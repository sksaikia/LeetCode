package LC501_600;

public class LC513 {
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


        static int h,ans,count;
        public int findBottomLeftValue(TreeNode root) {

            h = 0;
            ans = 0;
            count=0;
            height(root,1);

            System.out.println(h);

            findLeftMost(root,1);

            return ans;
        }


        private static void findLeftMost(TreeNode root,int level){

            if(root==null)
                return ;

            if(level==h && count==0){
                ans = root.val;
                count++;
                return ;
            }

            findLeftMost(root.left,level+1);
            findLeftMost(root.right,level+1);


        }



        private static void height(TreeNode root,int level){

            if(root==null)
                return ;

            if(level>h)
                h = level;

            height(root.left,level+1);
            height(root.right,level+1);



        }
}
