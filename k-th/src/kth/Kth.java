package kth;

import java.util.Arrays;

public class Kth
{
   public static int kthLargest(int x, int[] array)
   {
      int[] sToLArray = array; 
      
      Arrays.sort(sToLArray);                                     //sorts array from least to greatest
      if((x >= 0) && (x <= (sToLArray.length - 1)))               //if x is within bounds of the array, returns integer in array that has x number of integers greater than it
      {
         return sToLArray[sToLArray.length - 1 - x];
      }
      else
      {
         return -9999;                                            //if x is out of bounds, returns -9999
      }
   }
   
   public static void main(String[] args)
   {
      int[] array1 = {6, 8, 2, 3, 5, 12, 16, 1, 7, 4, 21, 19};    //declaring main array that will be used
      int answer = kthLargest(0,array1);                          //value returned from called function is caught by the variable answer
      System.out.println(answer);                                 //the returned value stored in answer is printed
      answer = kthLargest(1,array1);     
      System.out.println(answer);                                 //the same repeats for the rest of the code.
      answer = kthLargest(2,array1);
      System.out.println(answer);
      answer = kthLargest(10,array1);
      System.out.println(answer);
      answer = kthLargest(11,array1);
      System.out.println(answer);
      answer = kthLargest(-1,array1);
      System.out.println(answer); 
      answer = kthLargest(20,array1);
      System.out.println(answer); 
   }
}
