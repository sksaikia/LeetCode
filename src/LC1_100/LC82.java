package LC1_100;
import java.util.*;
public class LC82 {

    class ListNode {
        int val;
        ListNode next;
        ListNode(int val){
            this.val = val;
        }
    }
    public ListNode deleteDuplicates(ListNode head) {

        if(head==null || head.next==null)
            return head;

        ListNode dummy = new ListNode(0);
        dummy.next = head;
        ListNode prev = dummy;
        ListNode curr = head;

        while(curr!=null){

            while(curr.next!=null && curr.next.val==prev.next.val)
                curr = curr.next;


            if(prev.next==curr)
                prev = prev.next;
            else
                prev.next = curr.next;


            curr = curr.next;

        }


        return dummy.next;




    }
}
