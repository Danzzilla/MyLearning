package array.cased.variating;
import java.util.*;                                                                                         //for arrays and objects

public class VariatingCase{
   
   public static String[] CreateArray(){                                                                    //Function that creates the array from user input
      
      Scanner input = new Scanner(System.in);                                                               //scans user input
      String[] words = new String[10];                                                                      //declares a string array with 10 slots
      
      for(int i = 0; i < words.length; i++){                                                                //iterates until all 10 slots filled
         System.out.print("Please type in word #"+(i+1)+": ");                                              //user prompted to type
         words[i] = input.next();                                                                           //typed word stored in array
      }
      
      return words;                                                                                         //returns array with clients words
   }
   
   public static String[] CasedArray(String[] array){                                                       //edits array passed to contain uppercase words in odd index and lowercase in even index
      for(int i = 0; i <= (array.length - 1); i++){                                                         //iterates until all slots in array used
         if(i%2 == 0){                                                                                      //executes if number is even
            String word = array[i];                                                                         //current word in array index passed to variable word
            array[i] = word.toLowerCase();                                                                  //string in variable word turned to lowercase and replaced at the array index
         }
         if(i%2 != 0){                                                                                      //executes if number odd
            String word = array[i];                                                                         //current word in array index passed to variable word
            array[i] = word.toUpperCase();                                                                  //string in variable word turned to uppercase and replaced at the array index
         }
      }
      
      return array;                                                                                         //returns cased array
   }
   
   public static String ConstructSentence(String[] array){                                                  //constructs a sentence out of the words stored in each array index
      String sentence = "";                                                                                 //String variable declared
      for (int i = 0; i <= (array.length-2); i++){                                                          //iterates until the 2nd to last word in the array have been added to the sentence
         sentence = sentence + array[i] + " ";                                                              //adds word in the array index to the sentence, followed by space
      }
      sentence = sentence + array[array.length-1] + ".";                                                    //adds last word in the array to the sentence and closes the sentence with a period
      return sentence;                                                                                      //returns the constructed sentence
   }
   
   public static void main(String[] args){                                                                  //main
      String[] sentenceArray = CreateArray();                                                               //stores the array of words the user inputted into sentenceArray
      
      System.out.println("\nYour sentence is:\n");                                                          //prints
      System.out.println((ConstructSentence(CasedArray(sentenceArray)))+"\n");                              //Prints out the sentence produced from the cased original array
      
      System.out.println("As a string the array would look like: "
      +Arrays.toString(CasedArray(sentenceArray)));                                                         //prints out the cased array itself (not in sentence form)
   }
}
