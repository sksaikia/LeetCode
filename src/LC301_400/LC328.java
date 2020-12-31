package LC301_400;

public class LC328 {
    public ListNode oddEvenList(ListNode head) {
        if(head==null || head.next==null)
            return head;


        ListNode odd = head,even = head.next;

        ListNode oddHead = odd,evenHead = even;

        while(even!=null && even.next!=null){

            odd.next = even.next;
            even.next = even.next.next;
            odd = odd.next;
            even = even.next;


        }

        odd.next = evenHead;
        return oddHead;


    }
    public class ListNode {
      int val;
      ListNode next;
      ListNode() {}
      ListNode(int val) { this.val = val; }
     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
  }
}
