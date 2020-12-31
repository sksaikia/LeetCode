package LC201_300;
import java.util.*;
public class LC230 {
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


        static int ans;
        static ArrayList<Integer> list;

        public int kthSmallest(TreeNode root, int k) {

            list = new ArrayList<>();

            ans = 0;
            solve(root,k,0);


            return list.get(k-1);

        }


        private static void solve(TreeNode root,int k,int level){

            if(root==null){

                return;

            }

            solve(root.left,k,level);


            list.add(root.val);


            solve(root.right,k,level);



        }
}
