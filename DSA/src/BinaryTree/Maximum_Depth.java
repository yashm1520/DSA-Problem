package BinaryTree;

public class Maximum_Depth {
	
	
	 
	  public class TreeNode {
	      int val;
	      TreeNode left;
	      TreeNode right;
	      TreeNode() {}
	      TreeNode(int val) { this.val = val; }
	      TreeNode(int val, TreeNode left, TreeNode right) {
	          this.val = val;
	         this.left = left;
	         this.right = right;
	     }
	 }
	
	
	    public int maxDepth(TreeNode root) {
	        if(root==null){
	            return 0;
	        }
	        int leftdepth=1+maxDepth(root.left);
	        int rightdepth=1+maxDepth(root.right);

	        return Math.max(leftdepth,rightdepth);
	    }

}
