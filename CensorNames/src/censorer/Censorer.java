package censorer;
import java.io.*;
import java.util.*;

public class Censorer{
   
   public static int censorNames()throws FileNotFoundException{ 
      Scanner fileIn = new Scanner(new File("Names.txt"));                   //reads file
      PrintStream fileOut = new PrintStream(new File("CensoredNames.txt"));  //outputs into CensoredNames.txt
      
      String firstName = "";                                                 //Initialize variables
      String lastName = "";
      String censored = "";
      
      int c = 0;
      
      while(fileIn.hasNext()){                                               //Runs while there is something to read
         firstName = fileIn.next();                                          //stores first word to var firstName
         lastName = fileIn.next();                                           //stores second word to var lastName
         censored = " ";
         
         fileOut.print(firstName);                                           //prints first name in CensoredNames.txt
         for(int i = 0; i < lastName.length(); i++){                         //replaces each character in the last name 
        	 censored = censored + "*";                                      //with a star to censor the last name
         }
         fileOut.print(censored+"\n");                                       //prints the censored last name to CensoredNames.txt
          
         c++;                                                                //records how many names were censored
      }
      
      return c++;                                                            //returns how many names were censored
   }
   
   public static void main(String[] args)throws FileNotFoundException{
	   System.out.println(censorNames());                                    //runs censorNames() and prints out how many names were censored
   }
}