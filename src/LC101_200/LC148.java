package LC101_200;

public class LC148 {

     public class ListNode {
      int val;
      ListNode next;
      ListNode() {}
      ListNode(int val) { this.val = val; }
      ListNode(int val, ListNode next) { this.val = val; this.next = next; }
  }

    public ListNode sortList(ListNode head) {

        ListNode slow = head,fast = head,temp = head;


        if(head==null || head.next==null)
            return head;

        while(fast!=null && fast.next!=null){
            temp = slow;
            slow = slow.next;
            fast = fast.next.next;
        }

        temp.next = null;

        ListNode left = sortList(head);
        ListNode right = sortList(slow);

        return solve(left,right);


    }

    private ListNode solve(ListNode left,ListNode right){

        ListNode head = new ListNode(0);
        ListNode curr = head;
        while(left!=null && right!=null){


            if(left.val<=right.val){
                curr.next = left;
                left = left.next;
            }else{
                curr.next = right;
                right = right.next;
            }

            curr = curr.next;

        }
        if(left!=null){
            curr.next = left;
            left = left.next;
        }

        if(right!=null){
            curr.next = right;
            right = right.next;
        }



        return head.next;

    }


}
