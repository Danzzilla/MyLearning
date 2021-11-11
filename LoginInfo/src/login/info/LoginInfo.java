package login.info;
import java.io.*;                                                                                        //for file
import java.util.*;

public class LoginInfo
{
   public static void main(String[] args) throws FileNotFoundException                                   //if file is not found, throws exception
   {
      Scanner input = new Scanner(System.in);                                                        
      PrintStream LoginOut = new PrintStream(new File("LoginInfo.txt"));                                 //printstream that prints information to the
                                                                                                         //following file
      System.out.println("If you wish to exit the program, during any time in the program type \"exit\"\n");
      
      System.out.println("Input Username: ");
      String User1 = input.next();                                                                       //catches users string input
      String Pass1 = "";
      
      if (User1.equalsIgnoreCase("exit") == false)                                                       //checks if the user wanted to exit, if not
      {                                                                                                  //executes the following
         System.out.println("Input Password");                                               
         Pass1 = input.next();                                                                           //user inputs password
         
         while((User1.equalsIgnoreCase("exit") == false) && (Pass1.equalsIgnoreCase("exit") == false))   //runs while the user didnt type exit in username and password
         {
            LoginOut.println("User Name: "+User1+"\t Password: "+"!"+Pass1+"!");                         //Prints user information into file with password surrounded by "!"
            System.out.println("Input Username: ");
            User1 = input.next();
            if (User1.equalsIgnoreCase("exit") == false)
            {
               System.out.println("Input Password");
               Pass1 = input.next();
            }
         }
      }
   }
}