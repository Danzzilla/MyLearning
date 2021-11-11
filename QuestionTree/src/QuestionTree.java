
import java.util.*;
import java.io.*;

/**
 * Used to play question game
 * 
 * @author Daniel Svirida
 * @version 1
 */
public class QuestionTree{

	/** used to store the interface this game interacts with */
	private UserInterface my;
	
	/** used to store the total amount of games played */
	private int totalGames;
	
	/** used to store the total amount of games the computer won */
	private int gamesWon;
	
	/** used to store the overall root of the question tree */
	private QuestionNode overallRoot;
	
	/** used to store the last question node the computer used */
	private QuestionNode guessedObject;
	
	/**
	 * Constructs QuestionTree. The only node in the question tree by default is jedi
	 * 
	 * @param ui - the user interface that is passed down for the game to use
	 * @exception IllegalArgumentException if ui is null
	 */
	public QuestionTree (UserInterface ui){
		if(ui == null) throw new IllegalArgumentException("ui is null");
		my = ui;
		totalGames = 0;
		gamesWon = 0;
		overallRoot = new QuestionNode("Jedi");
	}
  
	/**
	 * Called to start the question asking
	 */
	public void play(){
		QuestionNode current = overallRoot;
		
		if(ask(current)) {                                                                   //starts question asking
			my.print("I win!");                                                              //if ask(current) returns true
			gamesWon++;                                                                      //updates amount of games won
		}
		else {
			my.print("I lose! What is your object?");
			String object = my.nextLine();
			my.print("Type a yes/no question to distinguish your item from " 
			+ guessedObject.data);
			String newQuestion = my.nextLine();
			my.println("And what is the answer for your object?");
			String temp = guessedObject.data;                                                //temporarily stores the previously guessed object
			guessedObject.data = newQuestion;
			if(my.nextBoolean()) {                                                           //if new object is said to go in the yes section of the new question
				guessedObject.yes = new QuestionNode(object);                                //puts new object in yes branch
				guessedObject.no = new QuestionNode(temp);                                   //puts previous object in no branch
			}
			else {
				guessedObject.yes = new QuestionNode(temp);                                  //puts previous object in yes branch
				guessedObject.no = new QuestionNode(object);                                 //puts new object in no branch
			}
		}
		totalGames++;                                                                        //updates amount of games played
	}
	
	/**
	 * Asks the user questions stored in the root node
	 * 
	 * @param question current question node being looked at
	 * @return true - if the computer got the right object
	 * <p>     false - if the computer didnt get the right object, returned value 
	 * 		   prompts in play() to create new object and question
	 * <p>     ask(question.yes/no) - if the computer has another question to ask
	 * @exception IllegalArgumentException if question is null
	 */
	private boolean ask(QuestionNode question) {
		if(question == null) throw new IllegalArgumentException("QuestionNode is null");
		if(question.yes == null) {
			my.print("Would your object happen to be the " + question.data + "?");
			
			if(my.nextBoolean()) {return true;} else {guessedObject = question; return false;}
		}
		
		else {
			my.print(question.data);
			
			if(my.nextBoolean()) {
				return ask(question.yes);
			}
			else {
				return ask(question.no);
			}
		}
	}
  
	/** 
	 * Saves the objects and questions created and used in this current game
	 * 
	 * @param output - PrintStream used to output data into a file
	 * @exception IllegalArgumentException if output is null
	 */
	public void save(PrintStream output){
		if(output == null) throw new IllegalArgumentException("Printstream output is null");
		save(overallRoot, output);
	}
	
	/**
	 * Saves the Question tree node by node
	 * 
	 * @param root - QuestionNode looked at
	 * @param output PrintStream used to output data into a file
	 */
	private void save(QuestionNode root, PrintStream output) {
		if(root.yes != null) {                                                               //checks if this is a node containing a question
			output.println("Q:" + root.data);
			save(root.yes, output);                                                          //calls to find the other nodes in its branches
			save(root.no, output);
		}
		else {
			output.println("A:" + root.data);
		}
	}
  
	/**
	 * Loads in Question Tree from previous game
	 * 
	 * @param input - input being scanned from a text file storing Question
	 * Nodes from a previous game
	 * @exception IllegalArgumentException if input is null
	 */
	public void load(Scanner input){
		if(input == null) throw new IllegalArgumentException("Scanner input is null");
		overallRoot = createTree(input);
	}
	
	/**
	 * Creates questionTree from scanned text file
	 * 
	 * @param input - input being scanned from a text file storing question nodes
	 * from a previous game
	 * @return root - QuestionNode that is at the top
	 */
	private QuestionNode createTree(Scanner input) {
		QuestionNode root;
		                                                                                                                       
		String line = input.nextLine();
		if(line.startsWith("Q:")) {                                                          //Checks if this line is a question
			String[] split = line.split("Q:");                                               //removes the "Q:"
			root = new QuestionNode(split[split.length-1], createTree(input), createTree(input));//creates a QuestionNode and recursively calls to
		}                                                                                    //create new question nodes in its branches
		else {   
			String[] split = line.split("A:");
			root = new QuestionNode(split[split.length-1]);
		}
		
		return root;
	}
  
	/**
	 * used to return the total number of games played
	 * 
	 * @return totalGames - total number of games played
	 */
	public int totalGames(){
		return totalGames;
	}
  
	/**
	 * used to return the total number of games the computer has won
	 * @return gamesWon - total number of games the computer has won
	 */
	public int gamesWon(){
		return gamesWon;
	}  
}