package LC101_200;
import java.util.*;
public class LC144 {
    public List<Integer> preorderTraversal(TreeNode root) {

        List<Integer> list = new ArrayList<>();

        solve(root,list);

        return list;

    }

    public void solve(TreeNode root,List<Integer> list){

        if(root==null)
            return ;

        list.add(root.val);
        solve(root.left,list);
        solve(root.right,list);



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
