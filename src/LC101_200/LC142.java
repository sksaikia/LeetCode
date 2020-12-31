package LC101_200;

public class LC142 {
    class ListNode {
      int val;
      ListNode next;
      ListNode(int x) {
          val = x;
          next = null;
      }
  }

        public ListNode detectCycle(ListNode head) {

            if(head==null || head.next==null)
                return null;

            ListNode slow = head;

            ListNode fast = head;

            boolean isCycle = false;

            while(fast!=null && fast.next!=null){

                slow = slow.next;
                fast = fast.next.next;

                if(slow==fast){
                    isCycle = true;
                    break;
                }

                if(fast==null || fast.next==null)
                    break;

            }


            if(!isCycle){
                return null;
            }


            slow = head;
            while(slow!=fast){
                slow = slow.next;
                fast = fast.next;
            }


            return slow;



        }
}
