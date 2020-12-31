package LC101_200;
import java.util.*;
public class LC145 {
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

        public List<Integer> postorderTraversal(TreeNode root) {

            List<Integer> list = new ArrayList<>();
            solve(root,list);

            return list;

        }


        private static void solve(TreeNode root,List<Integer> list){

            if(root==null)
                return ;
            solve(root.left,list);
            solve(root.right,list);
            list.add(root.val);


        }
}
