package LC801_900;

import java.util.ArrayList;
import java.util.List;

public class LC872 {

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

    ArrayList<Integer> list1,list2 ;
    public boolean leafSimilar(TreeNode root1, TreeNode root2) {


        list1 = new ArrayList<>();
        list2 = new ArrayList<>();

        findLeaves(root1,list1);
        findLeaves(root2,list2);

        int i= 0,j=0;

        int m = list1.size();
        int n = list2.size();


        if(m!=n)
            return false;

        while(i<m && j<n){

            if(list1.get(i)!=list2.get(i))
                return false;

            i++;
            j++;



        }


        return true;


    }


    private static void findLeaves(TreeNode root, List<Integer> list){


        if(root==null)
            return;

        if(root.left==null && root.right==null)
            list.add(root.val);

        findLeaves(root.left,list);
        findLeaves(root.right,list);



    }
}
