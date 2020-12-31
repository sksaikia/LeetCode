package LC801_900;
import java.util.*;
public class LC814 {

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

    public TreeNode pruneTree(TreeNode root) {
        if(solve(root))
            return root;
        return null;
    }

    public boolean solve(TreeNode root){

        if(root==null)
            return false;


        boolean l = solve(root.left);
        boolean r = solve(root.right);

        if(!l)
            root.left = null;
        if(!r)
            root.right = null;

        return root.val==1 || l||r;


    }
}
