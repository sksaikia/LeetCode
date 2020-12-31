package LC1_100;

public class LC98 {
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

        public boolean isValidBST(TreeNode root) {


            return isValidBSTHelper(root,null , null);
        }

        public boolean isValidBSTHelper(TreeNode node, TreeNode lowerBound, TreeNode upperBound){
            if(node == null)
                return true;

            if(lowerBound != null && node.val <= lowerBound.val)
                return false;

            if(upperBound != null && node.val >= upperBound.val)
                return false;
            return  isValidBSTHelper(node.left, lowerBound, node) &&
                    isValidBSTHelper(node.right, node, upperBound);

        }
}
