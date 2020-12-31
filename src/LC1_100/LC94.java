package LC1_100;
import java.util.*;
public class LC94 {
    public List<Integer> inorderTraversal(TreeNode root) {


        List<Integer> list = new ArrayList<>();

        Stack<TreeNode> stack  = new Stack<>();


        while(root!=null || !stack.isEmpty()){

            while(root!=null){
                stack.push(root);
                root = root.left;
            }
            root = stack.pop();

            list.add(root.val);

            root = root.right;


        }

        return list;
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
