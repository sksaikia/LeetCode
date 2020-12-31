package LC901_1000;
import java.util.*;
public class LC958 {
    public boolean isCompleteTree(TreeNode root) {

        if(root==null)
            return true;

        boolean result = false;

        Queue<TreeNode> queue = new LinkedList<>();
        queue.add(root);

        while(!queue.isEmpty()){

            TreeNode curr = queue.poll();

            if(curr==null)
                result = true;

            else{
                if(result)
                    return false;

                queue.add(curr.left);
                queue.add(curr.right);
            }

        }


        return true;
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
