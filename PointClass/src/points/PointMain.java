package points;

public class PointMain{
	
   public static void main(String[] args){
      Point p1 = new Point();
      p1.setLocation(7, 2);
      
      Point p2 = new Point(4, 3);
      System.out.println("p1 is "+ p1.toString());
      System.out.println("p2 is "+ p2.toString());
      System.out.println();
      
      System.out.println();
      
      System.out.println("p1 is "+ p1.distanceFromOrigin()+" distance from origin");
      System.out.println("p2 is "+ p2.distanceFromOrigin()+" distance from origin");
      System.out.println();
      
      p1.translate(11, 6);
      p2.translate(1, 7);
      System.out.println("New p1 is "+ p1.toString());
      System.out.println("New p2 is "+ p2.toString());
      System.out.println();
      
      System.out.println("Distance among them is");
      System.out.println(p1.distance(p2));
   }
}
