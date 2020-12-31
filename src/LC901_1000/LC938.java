package LC901_1000;

public class LC938 {

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


    int ans ;
    public int rangeSumBST(TreeNode root, int L, int R) {

        ans = 0;

        solve(root,L,R);

        return ans;

    }

    private void solve(TreeNode root,int L,int R){
        if(root==null)
            return ;

        if(root.val>= L && root.val<=R)
            ans += root.val;

        if(L<root.val)
            solve(root.left,L,R);
        if(R>root.val)
            solve(root.right,L,R);



    }
}
