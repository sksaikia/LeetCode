package LC101_200;

public class LC141 {


    class ListNode {
      int val;
      ListNode next;
      ListNode(int x) {
          val = x;
          next = null;
      }
  }

    public boolean hasCycle(ListNode head) {
        ListNode slow = head;
        ListNode fast = head;

        if(head==null || head.next==null)
            return false;

        while(fast!=null && fast.next!=null){


            slow = slow.next;
            fast = fast.next.next;


            if(fast==null || fast.next==null)
                return false;

            if(slow==fast)
                return true;

        }

        return true;
    }
}
