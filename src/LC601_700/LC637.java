package LC601_700;

import java.util.ArrayList;
import java.util.*;

public class LC637 {


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

    public List<Double> averageOfLevels(TreeNode root) {

        List<Double> ans = new ArrayList<>();


        if(root==null)
            return ans;


        Queue<TreeNode> queue = new LinkedList<>();


        queue.add(root);


        while(!queue.isEmpty()){

            long sum = 0 ;
            int count = 0;
            int size = queue.size();

            while(size>0){

                TreeNode curr = queue.poll();

                if(curr.left!=null)
                    queue.add(curr.left);
                if(curr.right!=null)
                    queue.add(curr.right);

                sum += curr.val;

                count++;

                size--;
            }

            double x = (double) sum/count;
            ans.add(x);


        }


        return ans;



    }
}
