package LC101_200;
import java.util.*;
public class LC138 {
    class Node {
        int val;
        Node next;
        Node random;

        public Node(int val) {
            this.val = val;
            this.next = null;
            this.random = null;
        }
    }

        public Node copyRandomList(Node head) {

            Node orgHead = head,currHead = null,curr = head;


            HashMap<Node,Node> hashMap = new HashMap<>();

            while(curr!=null){

                currHead = new Node(curr.val);
                hashMap.put(curr,currHead);

                curr = curr.next;

            }

            curr = head;

            while(curr!=null){

                currHead = hashMap.get(curr);
                currHead.next = hashMap.get(curr.next);
                currHead.random = hashMap.get(curr.random);

                curr = curr.next;


            }

            return hashMap.get(head);


        }
}
