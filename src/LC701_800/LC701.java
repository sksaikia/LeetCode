package LC701_800;
import java.util.*;
public class LC701 {

    class TreeNode {
        int val;
        TreeNode left,right;

        TreeNode(int val){
            this.val = val;
        }
    }

    public TreeNode insertIntoBST(TreeNode root, int val) {

        if(root==null)
            return new TreeNode(val);



        if(val<root.val)
            root.left= insertIntoBST(root.left,val);
        else
            root.right = insertIntoBST(root.right,val);

        return root;
    }
}
