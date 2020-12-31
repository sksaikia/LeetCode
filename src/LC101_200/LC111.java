package LC101_200;
import java.util.*;
public class LC111 {
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


        static int ans ;

        public int minDepth(TreeNode root) {

            if(root==null)
                return 0;

            ans = Integer.MAX_VALUE;
            solve(root,1);

            return ans;
        }


        private static void solve(TreeNode root,int level){

            if(root==null)
                return;

            if(root.left==null && root.right==null)
                ans = Math.min(level,ans);

            solve(root.left,level+1);
            solve(root.right,level+1);

        }
}
