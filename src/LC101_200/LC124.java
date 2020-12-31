package LC101_200;

public class LC124 {
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

    class Solution {

        int ans ;
        public int maxPathSum(TreeNode root) {
            ans = Integer.MIN_VALUE;
            if(root==null)
                return 0;

            solve(root);

            return ans;
        }
        private int solve(TreeNode root){



            if(root==null)
                return 0 ;

            int l = solve(root.left);
            int r = solve(root.right);

            int temp = Math.max(Math.max(l,r) + root.val , root.val);

            int res = Math.max(temp,l+r+root.val);

            ans = Math.max(ans,res);

            return temp;


        }



    }
}

