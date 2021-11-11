package count.vowel;
import java.util.*;                                                                             //for objects and arrays

public class VowelCount{
   
   public static int[] vowelCount(String string){                                               //function that counts the vowels in a given string
      char[] charString = string.toCharArray();                                                 //converts the string to a character array to read char by char
      int[] vowelCount = new int[5];                                                            //Array that will store vowel values declared (5 vowels)
       
      for(int i = 0; i <= (charString.length-1); i++){                                          //iterates for every character in the array
         
         if((charString[i] == 'a') || (charString[i] == 'A')){                                  //runs if it is the specified char, regardless of upper or lower case
            vowelCount[0] = vowelCount[0] + 1;                                                  //adds a counter to the specific index in the array which counts a certain vowel
         }
         if((charString[i] == 'e') || (charString[i] == 'E')){                                  //same process as the two comments above repeated for the rest of the if
            vowelCount[1] = vowelCount[1] + 1;                                                  //statements in this for loop (lines 17-34)
         }
         if((charString[i] == 'i') || (charString[i] == 'I')){
            vowelCount[2] = vowelCount[2] + 1;
         }
         if((charString[i] == 'o') || (charString[i] == 'O')){
            vowelCount[3] = vowelCount[3] + 1;
         }
         if((charString[i] == 'u') || (charString[i] == 'U')){
            vowelCount[4] = vowelCount[4] + 1;
         }
      }
      
      return vowelCount;                                                                        //returns the array which contains the vowel counts
   }
   
   public static void main(String[] args){                                                      //main
      Scanner input = new Scanner(System.in);                                                   //scans what the user inputs
      String keyword = "stop";                                                                  //key word that the user needs to type to exit the program
      
      System.out.println("Please type a line which you would like to count the vowels in."+     //prompts the user
      "\nIf you would like to exit, type \"Stop\"");
      String line = input.nextLine();                                                           //line user inputed stored in variable line
      
      while (!keyword.equalsIgnoreCase(line)){                                                  //runs while the variable line doesnt consist of just the word stop (case ignored)
         System.out.println("Vowel count - " + Arrays.toString(vowelCount(line)));              //prints the vowel count for their input
         System.out.println("Please type a line which you would like to count the vowels in."+  //prompts user to enter new line or stop
         "\nIf you would like to exit, type \"Stop\"\n");
         line = input.nextLine();                                                               //new line stored in variable line
      }                                                                                         //while loop checks this new line before iterating another time or stopping
   }
}
