package LC401_500;

public class LC404 {

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

    public int sumOfLeftLeaves(TreeNode root) {


        return sumOfLeftLeaves2(root,false);


    }
    public static int sumOfLeftLeaves2(TreeNode root,boolean isLeft){

        if(root==null)
            return 0;

        if(root.left==null && root.right==null && isLeft)
            return root.val;

        return sumOfLeftLeaves2(root.left,true) + sumOfLeftLeaves2(root.right,false);




    }
}
