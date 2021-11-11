package factor.twos;

public class TwoFactor
{
	public static String showTwos(int n)
	{
		String factors = n + " = ";            //begins the string with " n = "
		while (n%2 == 0)                       //checks if the integer has another factor of 2
		{
			factors = factors + "2 * ";        //adds "2 *" to the string if the integer has another factor of 2
			n = n/2;                           //divides the integer by 2 to show that we have logged that it had another factor of 2 and prepares us to go onto the next factor
		}
		      
		factors = factors + n;                 // adds to the string what factor is left of the integer
		
		return factors;                        //returns the factored integer string
	}                                          //end of  showTwos
		   
	public static void main(String[] args)
	{
		System.out.println(showTwos(7));       //calls for specific factored integers
		System.out.println(showTwos(18));
		System.out.println(showTwos(68));
		System.out.println(showTwos(120));
		System.out.println(showTwos(192));
		System.out.println(showTwos(8));
	}                                          //end of main
}                                              //end of program