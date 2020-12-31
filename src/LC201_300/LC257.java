package LC201_300;

import java.util.ArrayList;
import java.util.List;

public class LC257 {

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

    List<String> list;
    public List<String> binaryTreePaths(TreeNode root) {

        list = new ArrayList<>();

        solve(root,"");

        return list;

    }

    public void solve(TreeNode root,String curr){

        if(root==null)
            return ;
        curr = curr + root.val + "->";

        if(root.left==null && root.right==null){

            list.add(curr.substring(0,curr.length()-2));
            return;
        }


        solve(root.left,curr);
        solve(root.right,curr);

        return;

    }
}
