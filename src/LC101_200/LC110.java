package LC101_200;

public class LC110 {


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

    static boolean state = true;
    public boolean isBalanced(TreeNode root) {

        state = true;

        solve(root);

        return state;
    }

    private int solve(TreeNode root){

        if(root==null)
            return 0;

        int l = solve(root.left);
        int r = solve(root.right);

        if(Math.abs(l-r)>1){
            state = false;
        }

        return Math.max(l,r)+1;

    }


}
