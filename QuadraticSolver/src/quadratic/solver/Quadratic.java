package quadratic.solver;

public class Quadratic {

	public static void printQuadratic(double a, double b, double c) {   //inputs variables for ax^2+bx+c received as type double
	                                                                    //in case the user inputs a decimal variable
		double plus;                                                    //variable for answer outputed by the subtractive quadratic formula
	    double minus;                                                   //variable for answer outputed by additive
	      
	    plus = (-b+Math.sqrt((b*b)-4*(a)*(c)))/(2*a);                   //additive quadratic formula with answer stored in variable plus
	    System.out.print("x = " + plus);                                //prints answer as int as asked in assignment
	      
	    minus = (-b-Math.sqrt((b*b)-4*(a)*(c)))/(2*a);                  //subtractive quadratic formula with answer stored in variable minus
	    System.out.print(", x = " + minus);                             //prints answer
	      
	    System.out.println("\n");                                       //blank line
	}                                                                   //end of printQuadratic
	   
	public static void main(String[] args) {
		printQuadratic( 1, -1.82, 0.8281);                              //calls function printQuadratic with variables inputed
	    printQuadratic( 2, 6, 4);
	}                                                                   //end of main
}                                                                       //end of program
