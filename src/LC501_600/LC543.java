package LC501_600;

public class LC543 {

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



    int ans = 0;

    public int diameterOfBinaryTree(TreeNode root) {

        ans = 0;

        solve(root);

        if(ans==0)
            return 0;

        return ans-1;
    }

    private int solve(TreeNode root){

        if(root==null)
            return 0;

        int l = solve(root.left);
        int r = solve(root.right);

        int temp = Math.max(l,r) + 1;

        int res = Math.max(temp,l+r+1);

        ans = Math.max(res,ans);

        return temp;

    }
}
