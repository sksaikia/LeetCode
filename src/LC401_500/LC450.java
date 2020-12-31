package LC401_500;
import java.util.*;
public class LC450 {

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

    public TreeNode deleteNode(TreeNode root, int key) {
        if(root==null)
            return null;

        if(root.val>key)
            root.left = deleteNode(root.left,key);
        else if(root.val<key)
            root.right = deleteNode(root.right,key);
        else{

            if(root.left==null)
                return root.right;
            if(root.right==null)
                return root.left;
            root.val = minValue(root.right);

            root.right = deleteNode(root.right,root.val);
        }
        return root;

    }


    private int minValue(TreeNode root){

        int ans = root.val;
        while(root.left!=null){
            ans = root.left.val;
            root = root.left;
        }

        return ans;

    }

}
