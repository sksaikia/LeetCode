package LC101_200;

public class LC101 {
    public boolean isSymmetric(TreeNode root) {
        if(root==null)
            return true;
        return solve(root.left,root.right);
    }

    private static boolean solve(TreeNode root1,TreeNode root2){

        if(root1==null && root2==null)
            return true;

        if(root1==null || root2==null)
            return false;

        if(root1.val!=root2.val)
            return false;

        return solve(root1.left,root2.right) && solve(root1.right,root2.left);


    }

    public class TreeNode {
      int val;
      TreeNode left;
      TreeNode right;
      TreeNode(int x) { val = x; }
  }

}
