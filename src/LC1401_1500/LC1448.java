package LC1401_1500;
import java.util.*;
public class LC1448 {

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

    public int goodNodes(TreeNode root) {
        return solve(root,Integer.MIN_VALUE);
    }

    public int solve(TreeNode root,int maxValue){

        if(root==null)
            return 0;

        int count;

        if(root.val>=maxValue)
            count=1;
        else
            count=0;
        maxValue = Math.max(maxValue,root.val);


        return count + solve(root.left,maxValue) + solve(root.right,maxValue);



    }
}
