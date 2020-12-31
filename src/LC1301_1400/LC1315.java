package LC1301_1400;
import java.util.*;
public class LC1315 {
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



        public int sum = 0;

        public int sumEvenGrandparent(TreeNode root) {

            if(root==null)
                return 0;

            solve(root,null,null);

            return sum;


        }


        private  void solve(TreeNode curr,TreeNode parent,TreeNode grandParent){

            if(curr==null)
                return ;

            if(grandParent!=null && (grandParent.val%2==0) )
                sum += curr.val;

            solve(curr.left,curr,parent);
            solve(curr.right,curr,parent);

        }
}
