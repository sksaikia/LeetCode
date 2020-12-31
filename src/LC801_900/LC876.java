package LC801_900;

public class LC876 {


    public class ListNode {
      int val;
      ListNode next;
      ListNode() {}
      ListNode(int val) { this.val = val; }
      ListNode(int val, ListNode next) { this.val = val; this.next = next; }
  }

    public ListNode middleNode(ListNode head) {

        ListNode slow = head;
        ListNode fast = head;

        if(head==null)
            return null;

        while(fast!=null && fast.next!=null){

            slow = slow.next;
            fast = fast.next.next;
        }

        return slow;
    }
}
