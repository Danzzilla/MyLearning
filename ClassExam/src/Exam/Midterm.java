/* Please complete the programming questions here and submit the file on Canvas */
/* WRITE YOUR NAME HERE */

import java.util.*;

public class Midterm {
   /* The main is to test your implementations. Examples in the questions are implemented in main.
    * Do not change anything in main */
   public static void main (String [] args) {
       
      ArrayList<Integer> list = new ArrayList <>();
      list.add(1); list.add(2); list.add(3); list.add(4); list.add(5);
     
      method1(3, list); // list = [3, 4, 5]
      System.out.print ("Q1: [3, 4, 5] " + list);
      method1(6, list); // list = []
      System.out.println (", Q1: [] " + list);

      Map <String, String[]> map = new HashMap <>();
      String [] values = { "value1", "value2", "value3"};
      map.put ("key1", values);
      String [] values1 = {"value4", "value5", "value6", "value7"};
      map.put ("key2", values1);
      String [] values2 = {"value8", "value9", "value10"};
      map.put ("key3", values2);
     
      System.out.println ("Q2: " + method2(map));
      
      if (method3(123456) == 11223456 && method3(21) == 2211) System.out.println ("Q3: Correct");
      else {
         System.out.println ("Q3 test failed");
         System.out.println ("method3(123456): " + method3(123456));
         System.out.println ("method3(21): " + method3(21));
      }
   }
   
   /* add your code for method1 */
   public static void method1(int n, ArrayList<Integer> list) {
	   if(list.contains(n-1)) {
		   list.remove(list.indexOf(n-1));
		   method1((n-1), list);
	   }
   }
   
   /* add your code for method2 */
   public static Set<String> method2(Map<String, String[]> map){	   
	   int n = map.keySet().size() - 1;
	   
	   return method2b(n, map);
   }
   
   public static Set<String> method2b(int n, Map<String, String[]> map){
	   Set<String> threeValueKeys = new TreeSet<>();
	   ArrayList<String> keys = new ArrayList<>();
	   keys.addAll(map.keySet());
	   
	   Object[] keySet = keys.toArray();

	   if(map.get(keySet[n]).length == 3) {
		   threeValueKeys.add((String)keySet[n]);
	   }
	   
	   if(n-1 >= 0) threeValueKeys.addAll(method2b(n-1, map));
	   return threeValueKeys;
   }
   
   /* add your code for method3 */      
   public static int method3(int n) {
	   int temp = n/10;
	   int previousNum = 0;
	   int newNum = 0;
	  
	   if((n / 10) > 0) {
		   previousNum = method3(temp);
	   }
	   if((n % 10 == 1) || (n % 10 == 2)) {
		   n = (n % 10) * 11;
		   newNum = (previousNum * 100) + n;
	   }
	   else {
		   newNum = (previousNum * 10) + (n % 10);
	   }
	   return newNum;

   }
}