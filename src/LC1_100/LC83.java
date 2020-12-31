package LC1_100;

public class LC83 {

    public class ListNode {
      int val;
      ListNode next;
      ListNode() {}
      ListNode(int val) { this.val = val; }
      ListNode(int val, ListNode next) { this.val = val; this.next = next; }
  }

    public ListNode deleteDuplicates(ListNode head) {

        ListNode curr = head;

        while(curr!=null && curr.next!=null){

            if(curr.next.val== curr.val)
                curr.next = curr.next.next;
            else
                curr = curr.next;

        }
        return head;

    }
}
