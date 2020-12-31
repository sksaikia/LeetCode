package LC101_200;
import java.util.*;
public class LC102 {
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

        public List<List<Integer>> levelOrder(TreeNode root) {

            List<List<Integer>> ans = new ArrayList<>();


            if(root==null)
                return ans;


            Queue<TreeNode> queue = new LinkedList<>();


            queue.add(root);


            while(!queue.isEmpty()){

                List<Integer> list = new ArrayList<>();
                int size = queue.size();

                while(size>0){

                    TreeNode curr = queue.poll();

                    if(curr.left!=null)
                        queue.add(curr.left);
                    if(curr.right!=null)
                        queue.add(curr.right);

                    list.add(curr.val);



                    size--;
                }


                ans.add(list);


            }


            return ans;

        }
}
