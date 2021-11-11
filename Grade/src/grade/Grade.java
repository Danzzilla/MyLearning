package grade;
import java.util.*;                                                      //for scanner

public class Grade {

	public static void main(String[] args){
		
		Scanner console = new Scanner(System.in);                        //collects user input
	      
	    System.out.print("Hello, What is your name?...");                //prompts user
	    String name = console.next();                                    //catches the string the user inputed
	    System.out.print("\n");                                          //new line
	      
	    System.out.print("Hello "+name+", How old are you?...");         //prompts user
	    int age = console.nextInt();                                     //catches the age (int) the user inputed
	    System.out.print("\n");                                          //new line
	      
	    int grade = age - 5;                                             //calculates what grade the person should be in
	    System.out.println("Hello "+name+", as a person of age "+age+    //tells user what grade they should be in
	    		" you should be in grade "+grade);
	}
}