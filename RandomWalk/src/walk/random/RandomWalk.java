package walk.random;
import java.util.*;

public class RandomWalk 
{

	public static void randomWalk(int  x)
	{
		Random random = new Random();                   //new random object
	    int i;                                          //declare variable outside of loop to be able to use outside of loop
	    int position = 0;                               //same with this
	    System.out.println("Position = "+position);     //prints position
	    for (i=0; Math.abs(position) < x; i++)          //loops as long as the absolute value of the position is less than
	    {                                               //the requested walk size
	    	int n = random.nextInt(2);                  //returned random value of 0 or 1 stored in n
	        if (n == 0)                                 //different outcomes depending on what is in n
	        {
	           position -=1;                            //1 is subtracted from the position
	        }
	        if (n == 1)
	        {
	           position +=1;                            //1 is added to position
	        }
	        System.out.println("Position = "+position); //prints position
	    }
	    System.out.println("Steps: "+i);                //shows how many steps it took to get to the walk size
	}
	  
	public static void main(String[] args)
	{
		randomWalk(30);                                 //calls randomWalk with desired walk size
	}
}