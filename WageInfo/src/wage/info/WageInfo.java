package wage.info;
import java.util.*;
import java.io.*;

public class WageInfo
{
   public static void main(String[] args) throws FileNotFoundException     //throws exception if file not found
   {
      Scanner wages = new Scanner(new File("NameWageInfo.dat"));           //scanner looks through file specified
     
      while (wages.hasNextLine())                                          //runs and loops while the file has a next line
      {
         String line = wages.nextLine();                                   //Stores line from file into variable
         Scanner read = new Scanner(line);                                 //scanner looks through the line
         String name1 = read.next();                                       //name stored in variable name
         double hours1 = read.nextDouble();                                //hours stored in variable hours
         double rate1 = read.nextDouble();                                 //pay rate stored in variable rate
         System.out.println(name1+" should recieve $"+(hours1*rate1)+      //prints out how much the worker should be payed
        		 " this week.");
      }
   }
}
