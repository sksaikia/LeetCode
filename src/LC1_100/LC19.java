package LC1_100;
import java.util.*;
public class LC19 {
    public class ListNode {
      int val;
     ListNode next;
      ListNode() {}
      ListNode(int val) { this.val = val; }
      ListNode(int val, ListNode next) { this.val = val; this.next = next; }
  }

    class Solution {
        public ListNode removeNthFromEnd(ListNode head, int n) {

            ListNode dummy = new ListNode(0);

            dummy.next = head;

            ListNode first = dummy;
            ListNode second = dummy;

            for(int i=1;i<=n+1;i++){
                first = first.next;

            }

            while(first!=null){
                first = first.next;
                second = second.next;
            }

            second.next = second.next.next;


            return dummy.next;
        }
    }
}
