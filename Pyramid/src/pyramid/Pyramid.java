package pyramid;

public class Pyramid {

	public static void printDesign(int height) {       //prints the design in terms of inputed height
	     
	      for (int line = 1; line <= height; line++) { //for loop responsible for each line
	         
	    	  int amtDashes = 10 - line;               //calculates and holds how many dashes need to be printed
	    	  for (int d = 0; d < amtDashes; d++) {    //for loop prints amount of dashes calculated in line 14
	    		  System.out.print("-");
	          }
	         
	          int amtNumbers = 2 * (line - 1) + 1;     //calculates the amount of numbers need to be printed
	          for (int n = 0; n < amtNumbers; n++) {   //for loop that prints the amount of numbers calculated in line 20
	        	  System.out.print(line % 10);         //prints out the remainder of the line number divided by 10
	          }                                        //so the printed number is always in the ones place
	         
	          for (int d = 0; d < amtDashes; d++) {    //same for loop as line 15, repeated to print last set of dashes 
	         
	        	  System.out.print("-");
	          }

	         
	          System.out.println();                    //moves to the next line
	     }                                             //end of main loop
	}                                                  //end of printDesign
	   
	public static void main(String[] args) {           //main function
		printDesign(3);                                //calls to print 3 line design
	    printDesign(6);                                //6 line
	    printDesign(9);                                //9 line
	    printDesign(12);                               //12 line
	}                                                  //end of main
}                                                      //end of program
