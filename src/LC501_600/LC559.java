package LC501_600;

import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class LC559 {
    class Node {
        public int val;
        public List<Node> children;

        public Node() {}

        public Node(int _val) {
            val = _val;
        }

        public Node(int _val, List<Node> _children) {
            val = _val;
            children = _children;
        }
    }

    public int maxDepth(Node root) {
        if(root==null)
            return 0;

        int ans = 0;

        Queue<Node> queue = new LinkedList<>();
        queue.add(root);


        while(!queue.isEmpty()){

            int size = queue.size();

            for(int i=0;i<size;i++){

                Node curr = queue.poll();

                for(Node c:curr.children){
                    queue.add(c);
                }


            }
            ans++;




        }


        return ans;


    }
}
