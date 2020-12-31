package LC1_100;
import java.util.*;
public class LC2 {

    public class ListNode {
      int val;
      ListNode next;
      ListNode() {}
      ListNode(int val) { this.val = val; }
      ListNode(int val, ListNode next) { this.val = val; this.next = next; }
  }
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode ans = new ListNode(0);
        ListNode curr = ans;

        int carry = 0;

        while(l1!=null || l2!=null){

            int x=0,y=0;
            if(l1!=null)
                x = l1.val;
            if(l2!=null)
                y = l2.val;

            int z = x+y+carry;

            curr.next = new ListNode(z%10);

            carry = z/10;

            curr = curr.next;
            if(l1!=null)
                l1 = l1.next;
            if(l2!=null)
                l2 = l2.next;


        }

        if(carry==1)
            curr.next = new ListNode(1);

        return ans.next;




    }
}
