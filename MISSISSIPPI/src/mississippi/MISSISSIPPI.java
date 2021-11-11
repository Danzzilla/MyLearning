package mississippi;

public class MISSISSIPPI {

	public static void Space() {                  //Will be used as a space between the different letters
	      System.out.println();
	    }
	 
	public static void MTop() {                   //Prints a block-like "M" figure
	      System.out.println("M           M");
	      System.out.println("M M       M M");
	      System.out.println("M   M   M   M");
	      System.out.println("M     M     M");
	    }

	public static void MLegs() {                  //Prints extensions so the "M" will look taller
	      System.out.println("M           M");
	      System.out.println("M           M");
	      System.out.println("M           M");
	    }
	    
	public static void M() {                      //Calls to the functions to print Block-like "M"
	      MTop();
	      MLegs();
	      Space();
	    }
	    
	public static void ICross() {                 //Prints top and bottom cross in a capital "I"
	      System.out.println("IIIIIIIIIIIII");
	    }

	public static void ILine() {                  //Prints vertical line in "I"
	      System.out.println("      I       ");
	      System.out.println("      I       ");
	      System.out.println("      I       ");
	      System.out.println("      I       ");
	      System.out.println("      I       ");
	    }

	public static void I() {                      //Calls functions to form a block-like letter "I"
	      ICross();
	      ILine();
	      ICross();
	      Space();
	    }
	    
	public static void SCross() {                 //Prints the three horizontal parts of a block-like "S"
	      System.out.println(" SSSSSSSSSSS ");  
	    } 
	 
	public static void SCurve() {                 //Prints the curve at the top and bottom ends of an "S" 
	      System.out.println("SS         SS");
	    }
	    
	public static void RSCurve() {                //Prints the curve coming from the center to the right
	      System.out.println("           SS");
	    }
	    
	public static void LSCurve() {                //Prints the curve coming from the center to the left
	      System.out.println("SS           "); 
	    }
	    
	public static void S() {                      //Calls functions to create the block-like letter "S"
	      SCross();
	      SCurve();
	      LSCurve();
	      SCross();
	      RSCurve();
	      SCurve();
	      SCross();
	      Space();
	    }

	public static void ISS() {                    //Calls functions to bunch the repeating group of letters together to create less repetition in the main function
	      I();
	      S();
	      S();
	    }
	      
	public static void PCross() {                 //Prints the top and bottom part of the bulge in the letter "P"
	      System.out.println("PPPPPPPPPPPP ");
	    }
	    
	public static void PMiddle() {                //Prints the hole in the letter "P"
	      System.out.println("PP         PP");
	    }
	    
	public static void PStem() {                  //Prints the stem in the letter "P"
	      System.out.println("PP");
	      System.out.println("PP");
	      System.out.println("PP");
	    }
	  
	public static void P() {                      //Calls functions to print a block-like letter "P"
	      PCross();
	      PMiddle();
	      PMiddle();
	      PCross();
	      PStem();
	      Space();
	    }
	    
	public static void IPPI() {                   //Calls functions to print the last set of letters
	      I();
	      P();
	      P();
	      I();
	    }
	 

	public static void main(String[] args) {      //Calls for functions to print the following letters and sets of letters to form the word "MISSISSIPPI"
	      M();  
	      ISS();
	      ISS();
	      IPPI();
	   }
}                                                 //End of program
