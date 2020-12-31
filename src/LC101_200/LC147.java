package LC101_200;

public class LC147 {

    public class ListNode {
      int val;
      ListNode next;
      ListNode() {}
      ListNode(int val) { this.val = val; }
      ListNode(int val, ListNode next) { this.val = val; this.next = next; }
  }

    ListNode sorted;
    ListNode head;

    public ListNode insertionSortList(ListNode head) {

        sorted = null;

        ListNode curr = head;

        while(curr!=null){

            ListNode next = curr.next;
            solve(curr);
            curr = next;
        }


        head = sorted;
        return head;
    }

    private void solve(ListNode newNode){

        if(sorted==null || sorted.val>=newNode.val){

            newNode.next = sorted;

            sorted = newNode;
            return ;
        }


        ListNode current = sorted;

        while(current.next!=null && current.next.val<newNode.val){
            current = current.next;
        }

        newNode.next = current.next;
        current.next = newNode;


    }

}
