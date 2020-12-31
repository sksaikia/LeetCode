package LC501_600;
import java.util.*;
public class LC515 {
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


        static List<Integer> list;
        public List<Integer> largestValues(TreeNode root) {


            list = new ArrayList<>();

            if(root==null)
                return list;


            Queue<TreeNode> queue = new LinkedList<>();

            queue.add(root);

            while(!queue.isEmpty()){

                int size = queue.size();

                int max = Integer.MIN_VALUE;

                while(size>0){

                    TreeNode curr = queue.poll();

                    if(curr.left!=null)
                        queue.add(curr.left);
                    if(curr.right!=null)
                        queue.add(curr.right);

                    max = Math.max(max,curr.val);

                    size--;

                }
                list.add(max);


            }

            return list;

        }
}
