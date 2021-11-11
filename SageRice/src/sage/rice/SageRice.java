package sage.rice;

public class SageRice {

	public static void main(String[] args){
		int total = 0;                                     //Total amount of rice set to 0 to show how much rice we began with
	    int given = 1;                                     //Given amount of rice set to 1 to represent that day 1 started with being given one rice
	      
	    for (int i=1; i<=30; i++) {                        //"i" represents the day. The loop starts at the first day and ends on the 30th day
	    	total = total + given;                         //Updates the total by adding what it has already to what was given today
	         
	        System.out.println("Day "+i);                  //prints which day it is                                              
	        System.out.println("Rice Given - "+given);     //Prints the amount of rice given on that day            
	        System.out.println("Total Rice - "+total);     //Prints the total amount of rice                        
	        System.out.println();                          //Blank line to separate different days
	         
	        given = given * 2;                             //Updates to the amount that will be given for the next day
	    }                                                  //End of for loop
	      
	      System.out.println("Total Rice Count = "+total); //Prints the final amount of rice
	}                                                      //End of main function
}                                                          //End of program
