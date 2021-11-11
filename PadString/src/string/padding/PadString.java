package string.padding;

public class PadString {

	public static String padString(String a, int x) { //function that pads a string with x integers

		int amount = x - a.length();                  //calculates the amount of "*" that will need to be printed
	    String padded = a;                            //creates a string variable padded which will hold the final string
	      
	    for(int i=0; i < amount; i++) {               //repeats for the amount of "*" that need to be added to string padded
	    	padded = padded + "*";                    //adds "*" to string padded
	    }                                             //end of loop
	      
	    return padded;                                //returns the string held by padded
	}                                                 //end of padString
	   
	public static void main(String[] args) {

		String s1 = padString("Hello", 3);            //variable holding the returned string for the specific string and padding
	    String s2 = padString("Hello", 7);
	    String s3 = padString("Daniel", 12);          //applies to the rest
	    String s4 = padString("Computer", 9);
	    String s5 = padString("Java", 7);
	      
	    System.out.println(s1+"\n");                  //returned string is printed
	    System.out.println(s2+"\n");
	    System.out.println(s3+"\n");                  //applies to the rest
	    System.out.println(s4+"\n");
	    System.out.println(s5+"\n");
	}                                                 //end of main
}                                                     //end of program
