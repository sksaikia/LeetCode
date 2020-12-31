package LC1_100;

public class LC21 {

    public ListNode mergeTwoLists(ListNode l1, ListNode l2) {
        if (l1 == null)
            return l2;
        if (l2 == null)
            return l1;


        ListNode ans = new ListNode(0);
        ListNode curr = ans;

        while (l1 != null && l2 != null) {

            if (l1.val <= l2.val) {

                curr.next = l1;
                l1 = l1.next;
                curr = curr.next;

            } else {
                curr.next = l2;
                l2 = l2.next;
                curr = curr.next;
            }

        }

        if (l1 != null) {
            curr.next = l1;
            curr = curr.next;
            l1 = l1.next;
        }

        if (l2 != null) {
            curr.next = l2;
            curr = curr.next;
            l2 = l2.next;
        }


        return ans.next;
    }
    public class ListNode {
      int val;
      ListNode next;
      ListNode() {}
      ListNode(int val) { this.val = val; }
      ListNode(int val, ListNode next) { this.val = val; this.next = next; }
  }
}