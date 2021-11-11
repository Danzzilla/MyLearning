package array.find.odd;
import java.util.Arrays;

public class FindOdd
{
	public static int[] findOdd(int[] array)
	{
		int[] oddsArray = {};                                                   //created array where the odds will be stored
		int n = 0;                                                              //variable to identify into which index to put odd in oddsArray
		
		for (int i = 0; i < array.length; i++)                                  //runs until gone through the whole array
		{
			if ((array[i])%2 != 0)                                              //runs if the integer in the index is not even (odd)
			{
				oddsArray = Arrays.copyOf(oddsArray, (oddsArray.length + 1));   //adds an index for the next odd to be added to the array
				oddsArray[n] = array[i];                                        //places the odd into the added index
				n++;                                                            //adds 1 to n to keep track of the array length
			}
		}
		
		return oddsArray;                                                       //returns array containing odds from the original array
	}
	
	public static void main(String[] args)
	{
		int[] numArray = {3, 5, 6, 8, 9, 10, 13, 7, 1, 9};                      //array, which will be used to find the odds out of, is declared
		int[] odds = findOdd(numArray);                                         //finds the odd numbers in numArray and stores returned array in odds array
		Arrays.sort(odds);                                                      //sorts odds array from least to greatest
		System.out.println("The original array was "+Arrays.toString(numArray));//prints the original array
		System.out.println("The new array is "+Arrays.toString(odds));          //prints the new array with the sorted odd numbers
	}
}