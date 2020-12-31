package LC901_1000;

public class LC993 {

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

    public boolean isCousins(TreeNode root, int a, int b) {

    int level1 = level(root,a,1);
    int level2 = level(root,b,1);

    if(level1==0 || level2==0)
        return false;

    if(level1!=level2)
        return false;

    //  System.out.println(level1 +"  " + level2) ;

    return !isChild(root,a,b);
}

    private boolean isChild(TreeNode root,int a,int b){

        if(root==null)
            return false;

        if(root.left!=null && root.right!=null && root.left.val==a && root.right.val==b)
            return true;

        if(root.left!=null && root.right!=null && root.left.val==b && root.right.val==a)
            return true;

        if(root.left==null)
            return isChild(root.right,a,b);
        else if(root.right==null)
            return isChild(root.left,a,b);
        else
            return isChild(root.left,a,b) || isChild(root.right,a,b);


    }


    private int level(TreeNode root,int a,int curr){

        if(root==null)
            return 0;

        if(root.val==a)
            return curr;

        int down = level(root.left,a,curr+1);

        if(down!=0)
            return down;

        down = level(root.right,a,curr+1);
        return down;



    }




}
