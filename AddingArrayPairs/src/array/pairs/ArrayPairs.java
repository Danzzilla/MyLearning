package array.pairs;
import java.util.*;                                                 //for arrays

public class ArrayPairs
{
   public static int[] collapse(int[] array)
   {
      int c = 0;                                                    //declarations
      int[] arrayb;
      
      if(array.length%2 == 0)                                       //checks if array is even
      {
         arrayb = new int[array.length/2];                          //if so, new array length is half of original array
      }
      else                                                          //if not...
      {
         arrayb = new int[array.length/2 + 1];                      //then, new array length is half of the original array plus one
         arrayb[arrayb.length - 1] = array[array.length - 1];       //keeps indexes in bounds
      }
      
      for(int i = 0; i < array.length/2; i++)                       
      {
         arrayb[i] = array[c] + array[c+1];                         //adds the two integers
         c = c + 2;                                                 //updates counter
      }
       
      return arrayb;                                                //returns new array
   }
   
   public static void main(String[] args)
   {
      int[] array1 = {1, 4, 6, 8, 3, 4, 6, 7, 10, 1};
      int[] array2 = {8, 7, 6, 4, 9, 12, 12, 8, 11, 12, 20};
      
      int[] array1b = collapse(array1);
      int[] array2b = collapse(array2);
      
      System.out.println("Before : "+Arrays.toString(array1));
      System.out.println("After : "+Arrays.toString(array1b));
      System.out.println("\n");
      System.out.println("Before : "+Arrays.toString(array2));
      System.out.println("After : "+Arrays.toString(array2b));
   }
}