package LC1_100;

public class LC86 {

    public class ListNode {
      int val;
      ListNode next;
      ListNode() {}
      ListNode(int val) { this.val = val; }
      ListNode(int val, ListNode next) { this.val = val; this.next = next; }
  }
    public ListNode partition(ListNode head, int x) {

        ListNode before_head = new ListNode(0);
        ListNode prev = before_head;
        ListNode after_head = new ListNode(0);
        ListNode curr = after_head;

        while(head!=null){

            if(head.val<x){
                prev.next = head;
                prev = prev.next;
            }
            else{
                curr.next = head;
                curr = curr.next;
            }

            head = head.next;

        }
        System.out.println("Rached here" );
        prev.next = after_head.next;
        curr.next = null;

        return before_head.next;

    }
}
