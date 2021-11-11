package retirement;
import java.util.*;                                                           //for scanner

public class Retirement{
	
	public static void main(String[] args){
	   
		Scanner console = new Scanner(System.in);                             //scanner receives input from system
      
        System.out.println("How old are you?");                               //prompts user
        int age = console.nextInt();                                          //stores next inputed integer into variable age
      
        int years = 65-age;                                                   //calculates how many years that person has until retirement
        System.out.println("You have " +years+ " years till retirement!");    //prints how many years until retirement
    }                                                                         //end of method
}                                                                             //end of class
