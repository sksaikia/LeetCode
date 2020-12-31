package LC501_600;

import java.util.ArrayList;
import java.util.List;

public class LC590 {


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

    class Solution {

        List<Integer> list;

        public List<Integer> postorder(Node root) {
            list = new ArrayList<>();

            if(root==null)
                return list;

            solve(root);

            return list;
        }

        private void solve(Node root){

            if(root==null)
                return ;
            for(Node node : root.children)
                solve(node);

            list.add(root.val);


        }




    }
}
