package LC101_200;
import java.util.*;
public class LC199 {
    ArrayList<Integer> list;

    int max = 0;
    public List<Integer> rightSideView(TreeNode root) {

        list = new ArrayList<>();
        max = -1;
        solve(root,0);

        return list;

    }

    private void solve(TreeNode root,int level){

        if(root==null)
            return ;

        if(level>max){
            list.add(root.val);
            max = level;
        }

        solve(root.right,level+1);
        solve(root.left,level+1);



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
