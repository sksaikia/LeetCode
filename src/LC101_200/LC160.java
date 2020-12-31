package LC101_200;
import java.util.*;
public class LC160 {
    public class ListNode {
      int val;
      ListNode next;
      ListNode(int x) {
         val = x;
          next = null;
      }
  }


        public ListNode getIntersectionNode(ListNode headA, ListNode headB) {

            HashSet<ListNode> hashSet = new HashSet<>();

            ListNode curr = headA;

            while(curr!=null){

                hashSet.add(curr);
                curr = curr.next;
            }

            curr = headB;

            while(curr!=null){
                if(hashSet.contains(curr))
                    return curr;
                curr = curr.next;
            }

            return null;


        }
}
