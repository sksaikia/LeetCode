package LC1301_1400;
import java.util.*;
public class LC1302 {
    int sum = 0;
    int max = 0;


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

    public int deepestLeavesSum(TreeNode root) {

        sum = 0;
        max = 0;
        solve(root,1);

        return sum;

    }

    private void solve(TreeNode root,int level){

        if(root==null)
            return ;

        if(level==max)
            sum += root.val;

        if(level>max){

            sum = root.val;
            max = level;
        }

        solve(root.left,level+1);
        solve(root.right,level+1);


    }
}
