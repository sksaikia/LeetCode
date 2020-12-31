package LC201_300;

public class LC206 {

    public class ListNode {
      int val;
      ListNode next;
      ListNode() {}
      ListNode(int val) { this.val = val; }
      ListNode(int val, ListNode next) { this.val = val; this.next = next; }
  }

    public ListNode reverseList(ListNode head) {
        ListNode prev=null,curr = null,next = null;

        if(head==null)
            return null;

        curr = head;

        while(curr!=null){

            next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;

        }


        return prev;
    }
}
