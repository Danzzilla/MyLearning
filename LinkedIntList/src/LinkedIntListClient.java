public class LinkedIntListClient {
   public static void main (String [] args) {
      
      LinkedIntList list = new LinkedIntList();
      System.out.println ("Adding 1 -> 2 -> 3 -> 4 -> null to the list... " );     
      list.add (1);  list.add (2);  list.add(3); list.add (4);
      System.out.println (list);
      System.out.println();
       
      System.out.println ("calling delete2ndBack... ");
      System.out.println();
      System.out.println("Deleting "+ list.delete2ndBack());
      System.out.println (list);
      System.out.println();
       
      System.out.println ("calling delete2ndBack... ");
      System.out.println();
      System.out.println("Deleting "+ list.delete2ndBack());
      System.out.println (list);
      System.out.println();
      
      System.out.println ("calling delete2ndBack... ");
      System.out.println();
      System.out.println("Deleting "+ list.delete2ndBack());
      System.out.println (list); 
      System.out.println();
      
      System.out.println ("calling delete2ndBack... ");
      System.out.println();
      try{
    	  System.out.println("Deleting "+ list.delete2ndBack());
      } catch (Exception e) {
         System.out.println (e);
         System.out.println();
      }
      System.out.println ("Final List : " + list);   
   }
}

