package LC1301_1400;
import java.util.*;
public class LC1382 {
    ArrayList<Integer> list ;

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

    public TreeNode balanceBST(TreeNode root) {
        list = new ArrayList<>();

        store(root);

        return makeBinaryTree(list,0,list.size()-1);


    }

    private TreeNode makeBinaryTree(ArrayList<Integer> list,int left,int right){

        if(right<left)
            return null;


        int mid = left + (right-left)/2;

        TreeNode root = new TreeNode(list.get(mid));

        root.left = makeBinaryTree(list,left,mid-1);
        root.right = makeBinaryTree(list,mid+1,right);

        return root;


    }



    private void store(TreeNode root){

        if(root==null)
            return ;

        store(root.left);
        list.add(root.val);
        store(root.right);


    }
}
