package LC1101_1200;
import java.util.*;
public class LC1161 {
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


        public int maxLevelSum(TreeNode root) {


            if(root==null)
                return 0;

            Queue<TreeNode> queue = new LinkedList<>();

            queue.add(root);

            int level = 0;
            int ansLevel = 1;
            int max = Integer.MIN_VALUE;

            while(!queue.isEmpty()){

                int size = queue.size();
                int sum = 0;

                while(size>0){

                    TreeNode curr = queue.poll();

                    sum += curr.val;

                    if(curr.left!=null)
                        queue.add(curr.left);
                    if(curr.right!=null)
                        queue.add(curr.right);


                    size--;

                }
                level++;

                if(sum>max){
                    max = sum;
                    ansLevel = level;
                }




            }

            return ansLevel;



        }
}
