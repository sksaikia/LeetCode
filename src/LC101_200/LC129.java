package LC101_200;

public class LC129 {
    public int sumNumbers(TreeNode root) {
        return solve(root,0);
    }

    private int solve(TreeNode root,int s){

        if(root==null)
            return 0;

        if(root.left==null && root.right==null)
            return s*10 + root.val;
        return solve(root.left,s*10+root.val ) + solve(root.right,s*10+root.val);


    }

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
}
