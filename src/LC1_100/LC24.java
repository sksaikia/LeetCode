package LC1_100;

public class LC24 {
    public ListNode swapPairs(ListNode head) {

        if(head==null || head.next==null)
            return head;

        ListNode prev = head, curr = head.next;
        ListNode ans = curr;

        while(true){

            ListNode next = curr.next;

            curr.next = prev;
            if(next==null || next.next==null){
                prev.next = next;
                break;
            }

            prev.next = next.next;
            prev = next;

            curr = prev.next;


        }



        return ans;
    }
    public class ListNode {
      int val;
      ListNode next;
      ListNode() {}
      ListNode(int val) { this.val = val; }
      ListNode(int val, ListNode next) { this.val = val; this.next = next; }
  }
}
