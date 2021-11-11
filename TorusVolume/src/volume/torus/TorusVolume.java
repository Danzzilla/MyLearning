package volume.torus;

public class TorusVolume {

	public static double Torus(double r, double R) {      //function that finds the volume of a torus with radius r and R inputed in parameter
		double volume = (Math.PI*(r*r))*(2*Math.PI*R);    //calculates volume of a torus with given inputs
	    return volume;                                    //returns the value of the volume outside of the function
	}                                                     //end of function
	    
	public static void main(String[] args) {
	    double vol = Torus(8, 20);                        //returned value from the function put into a variable
	    System.out.println("Volume = "+vol);              //returned value from the function printed out 
	}                                                     //end of main
}                                                         //end of program
