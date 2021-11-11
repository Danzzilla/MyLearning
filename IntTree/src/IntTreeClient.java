public class IntTreeClient {
   public static void main (String[] args) {
      IntTree t = new IntTree(12);
      System.out.println ("Tree structure: ");
      t.printSideWays();
      System.out.println("There are " + t.size() + " TreeNodes");
   }
}