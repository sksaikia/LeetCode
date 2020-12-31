package LC901_1000;

public class LC965 {

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

    int mainValue ;
    public boolean isUnivalTree(TreeNode root) {

        if(root==null)
            return true;

        mainValue = root.val;

        return solve(root);


    }
    private boolean solve(TreeNode root){
        if(root==null)
            return true;

        if(root.val!=mainValue)
            return false;

        return solve(root.left) && solve(root.right);



    }


}
