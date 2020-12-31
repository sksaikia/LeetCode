package LC201_300;
import java.util.*;
public class LC236 {


    public class TreeNode {
      int val;
      TreeNode left;
     TreeNode right;
 TreeNode(int x) { val = x; }
  }
    public TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {

        Stack<TreeNode> stack = new Stack<>();

        HashMap<TreeNode,TreeNode> hashMap = new HashMap<>();


        hashMap.put(root,null);

        stack.push(root);

        while(!hashMap.containsKey(p) || !hashMap.containsKey(q)){

            TreeNode curr = stack.pop();

            if(curr.left!=null){
                stack.push(curr.left);
                hashMap.put(curr.left,curr);
            }
            if(curr.right!=null){
                stack.push(curr.right);
                hashMap.put(curr.right,curr);
            }


        }
        HashSet<TreeNode> hashSet = new HashSet<>();

        while(p!=null){

            hashSet.add(p);
            p = hashMap.get(p);

        }

        while(!hashSet.contains(q))
            q = hashMap.get(q);

        return q;




    }
}
