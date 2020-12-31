package LC201_300;

public class LC203 {

    public class ListNode {
      int val;
      ListNode next;
     ListNode() {}
      ListNode(int val) { this.val = val; }
      ListNode(int val, ListNode next) { this.val = val; this.next = next; }
  }

    public ListNode removeElements(ListNode head, int val) {


        ListNode newHead = new ListNode(0);

        newHead.next = head;

        ListNode p = newHead;

        while(p!=null && p.next!=null){

            if(p.next.val==val)
                p.next = p.next.next;
            else
                p = p.next;


        }


        return newHead.next;
    }
}
