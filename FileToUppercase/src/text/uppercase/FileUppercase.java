package text.uppercase;
import java.util.*;
import java.io.*;

public class FileUppercase
{
   public static void ToUpperCase(String filename) throws FileNotFoundException
   {
      PrintStream Out = new PrintStream(new File(filename+".txt"));                //used to print text in a file that the user specified
      Scanner file = new Scanner(new File("CS141 Data File W7ICA1.txt"));          //scans the current file which data needs to be modified from
      
      while(file.hasNext())                                                        //runs while the file has a next word
      {
         String word = file.next();                                                //scanner reads the word and stores it in the variable word
         Out.println(word.toUpperCase());                                          //program prints the word in upper case in the designated file
      }
   }
   
   public static void main(String[] args) throws FileNotFoundException
   {
      System.out.println("Please enter just the name of the file you would\n"+
    		  "like for the program to transfer the new data to.");
      Scanner input = new Scanner(System.in);
      
      String filename = input.next();                                             //asks user for the designated file name
      ToUpperCase(filename);                                                      //calls the function with the name the user chose for the file
   }
}
