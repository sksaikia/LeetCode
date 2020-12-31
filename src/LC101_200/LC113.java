package LC101_200;
import java.util.*;
public class LC113 {
    public class TreeNode {
      int val;
      TreeNode left;
      TreeNode right;
      TreeNode(int x) { val = x; }
  }

        public List<List<Integer>> pathSum(TreeNode root, int sum) {

            List<List<Integer>> ans = new ArrayList<>();

            List<Integer> curr = new ArrayList<>();

            solve(root,sum,curr,ans);

            return ans;


        }

        private void solve(TreeNode root,int sum,List<Integer> curr,List<List<Integer>> ans){


            if(root==null)
                return;

            curr.add(root.val);


            if(root.left==null && root.right==null && root.val == sum){
                ans.add(curr);
                return;
            }


            solve(root.left,sum-root.val,new ArrayList<>(curr),ans);
            solve(root.right,sum-root.val,new ArrayList<>(curr),ans);




        }
}
