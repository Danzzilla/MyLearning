// An IntTree object represents an entire binary tree of ints.
public class IntTree {
	IntTreeNode overallRoot;
   
	// Constructs an empty binary tree
	public IntTree() {
		overallRoot = null;
	}

	// Constructs a binary tree with the given node as its root.
	public IntTree(IntTreeNode overallRoot) {
		this.overallRoot = overallRoot;
	}
   
   public IntTree (int max) {
      overallRoot = buildTree(1, max);
   }
   
      
   private IntTreeNode buildTree (int n, int max) {
      if (n>max) return null;
      else return new IntTreeNode(n, buildTree(2*n, max), buildTree(2*n+1, max));
   }
   
  public void printSideWays() {
      printSideWays (overallRoot, 0);
   }
   
   private void printSideWays (IntTreeNode root, int level) {
      if (root != null) {
         printSideWays (root.right, level+1);
         for (int i=0; i<level; i++) 
            System.out.print ('\t');
         System.out.println (root.data);
         printSideWays (root.left, level+1);
      }
   }
   
   public int size() {
	   return count(overallRoot);
   }
   
   private int count(IntTreeNode root) {
	   int i = 0;
	   if(root != null) {
		   return i += 1 + count(root.right) + count(root.left);
	   }
	   
	   return 0;
   }
}