package LC501_600;

public class LC538 {
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



        static int sum ;
        public TreeNode convertBST(TreeNode root) {

            sum = 0;

            return solve(root);

        }

        private static TreeNode solve(TreeNode root){

            if(root==null)
                return null;


            solve(root.right);

            sum += root.val;
            root.val = sum;



            solve(root.left);

            return root;



        }

    }
