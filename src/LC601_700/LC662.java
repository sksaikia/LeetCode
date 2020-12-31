package LC601_700;
import java.util.*;
public class LC662 {
    int ans = 0;

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

    HashMap<Integer,Integer> hashMap ;


    public int widthOfBinaryTree(TreeNode root) {
        ans = 0;
        hashMap = new HashMap<>();

        solve(root,0,0);

        return ans;

    }

    private void solve(TreeNode root,int depth,int pos){

        if(root==null)
            return ;

        if(!hashMap.containsKey(depth))
            hashMap.put(depth,pos);

        ans = Math.max(ans,pos-hashMap.get(depth)+1);

        solve(root.left,depth+1,2*pos);
        solve(root.right,depth+1,2*pos+1);


    }
}
