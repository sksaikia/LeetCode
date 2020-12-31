package LC801_900;



import LC901_1000.LC938;

import java.util.ArrayList;

public class LC897 {


    static class TreeNode {
        int val;
        TreeNode left,right;

        public TreeNode(int val) {
            this.val = val;
        }
    }

    static ArrayList<Integer> list;

    public TreeNode increasingBST(TreeNode root) {

        if(root==null)
            return null;

        list = new ArrayList<>();
        inOrder(root);

        //   System.out.println(list.size());


        TreeNode ans = new TreeNode(list.get(0));
        TreeNode curr = ans;

        for(int i=1;i<list.size();i++){

            curr.right = new TreeNode(list.get(i));
            curr = curr.right;

        }

        return ans;


    }


    private static void inOrder(TreeNode root){

        if(root==null)
            return;

        inOrder(root.left);

        list.add(root.val);

        inOrder(root.right);



    }

}
