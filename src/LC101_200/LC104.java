package LC101_200;

public class LC104 {
    public int maxDepth(TreeNode root) {

        if(root==null)
            return 0;

        int l = maxDepth(root.left);
        int r = maxDepth(root.right);

        if(l>r)
            return 1+l;
        return 1+r;


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
