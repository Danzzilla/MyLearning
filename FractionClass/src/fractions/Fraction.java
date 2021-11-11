package fractions;

public class Fraction{
	   
	private int numerator;                                //numerator field
	private int denominator;                              //denominator field
	   
	public Fraction(){                                    //creates a default fraction equal to 1 (1/1)
		numerator = 1;
		denominator = 1;
	}
	   
	public Fraction(int num, int den){                    //creates a fraction with the inputed numerator and denominator
		numerator = num;                                  //passes the inputed numerator into the numerator
		if (den == 0){                                    //if the user inputed 0 into the denominator value
			denominator = 1;                              //it will set the denominator to 1
		} 
		else{
			denominator = den;                            //if it isnt 0, then it sets it to the value inputed
		}
	}
	   
	public String toString(){                             //converts the fraction to a string
		if(denominator == 1){                             //if the denominator is 1, then it just returns the numerator
			return " "+numerator+" ";
		}
		else{
			return " "+numerator+"/"+denominator+" ";     //if not, then it returns the fraction
		}
	}
	   
	public int getNumerator(){                            //returns the numerator
		return numerator;
	}
	   
	public int getDenominator(){                          //returns the denominator
		return denominator;
	}
	   
	public void setNumerator(int num){                    //passes the inputed number into the numerator
		numerator = num;
	}
	   
	public void setDenominator(int den){                  //passes the inputed number into the denominator
		if(den != 0){                                     //if the number isn't zero
			denominator = den;
		}
	}
	   
	public double getDecimalValue(){                      //returns the decimal number of the fraction
		double dec = (numerator) / ((double)denominator);
		return dec;
	}
	   
	public boolean equals(Fraction other){                //checks if the fraction is equal to the fraction in the parameter
		double dec = (numerator) / ((double)denominator);
		if(dec == other.getDecimalValue()){               //checks if the current fraction is equal to the inputed fraction
			return true;                                  //if it is equal it returns true
		}
		else{
			return false;                                 //if it isnt equal it returns false
		}
	}
	   
	public void multiply(Fraction other){                 //multiplies the current fraction with an inputed fraction
		numerator = numerator * other.getNumerator();
		denominator = denominator * other.getDenominator();
	}
}
	   