package area.triangle;

public class TriangleArea {

	public static double triangleArea(int a, int b, int c) {  //function that calculates the area of triangle with 3 sides as parameters
	   
		double s = (a+b+c)/2.0;                               //sets a value for s for half perimeter
	    double area = Math.sqrt(s*(s-a)*(s-b)*(s-c));         //main function that calculates area, with precalculated value of s used
	      
	    return area;                                          //returns the area of triangle
	}                                                         //end of triangleArea
	   
	public static void main(String[] args) { 
	   
		double test1 = triangleArea(7, 6, 5);                 //returned value from the function caught by assigned variable
	    double test2 = triangleArea(5, 6, 7);
	    double test3 = triangleArea(12, 13, 14);
	    double test4 = triangleArea(300, 400, 550);
	     
	    System.out.println(test1+"\n");                       //prints off the calculated area from each variable
	    System.out.println(test2+"\n");
	    System.out.println(test3+"\n");
	    System.out.println(test4+"\n");
	}                                                         //end of main
}                                                             //end of program
