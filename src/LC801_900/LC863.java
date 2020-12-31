package LC801_900;
import java.util.*;
public class LC863 {
    HashMap<TreeNode,TreeNode> hashMap ;

    public List<Integer> distanceK(TreeNode root, TreeNode target, int K) {

        hashMap = new HashMap<>();

        dfs(root,null);

        Queue<TreeNode> queue = new LinkedList<>();

        queue.add(target);

        Set<TreeNode> seen  = new HashSet<>();
        seen.add(target);

        int level = 0;

        ArrayList<Integer> list = new ArrayList<>();
        if(K==0){
            list.add(target.val);
            return list;
        }


        while(!queue.isEmpty()){

            int size = queue.size();

            while(size>0){

                TreeNode node = queue.poll();

                if(!seen.contains(node.left) && node.left!=null){
                    seen.add(node.left);
                    queue.add(node.left);
                }

                if(!seen.contains(node.right) && node.right!=null){
                    seen.add(node.right);
                    queue.add(node.right);
                }

                TreeNode parent = hashMap.get(node);
                if(!seen.contains(parent) && parent!=null){
                    seen.add(parent);
                    queue.add(parent);
                }



                size--;
            }
            level++;

            if(level==K){


                while(!queue.isEmpty())
                    list.add(queue.poll().val);

            }


        }

        return list;



    }


    private void dfs(TreeNode root,TreeNode parent){

        if(root==null)
            return;

        hashMap.put(root,parent);
        dfs(root.left,root);
        dfs(root.right,root);

    }
     public class TreeNode {
      int val;
      TreeNode left;
      TreeNode right;
      TreeNode(int x) { val = x; }
  }
}
