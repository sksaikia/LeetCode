package LC601_700;

public class LC700 {

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

    public TreeNode searchBST(TreeNode root, int val) {

        if(root==null)
            return null;

        if(root.val==val)
            return root;

        if(root.val>val)
            return searchBST(root.left,val);
        return searchBST(root.right,val);
    }
}
