package LC201_300;

public class LC234 {
    public boolean isPalindrome(ListNode head) {

        ListNode slow=head,fast = head,prev=null;

        if(head==null || head.next==null)
            return true;

        while(fast!=null && fast.next!=null){
            fast = fast.next.next;
            prev = slow;
            slow = slow.next;
        }


        prev.next = null;
        if(fast!=null)
            return check(head,reverse(slow.next));
        else
            return check(head,reverse(slow));



    }


    private boolean check(ListNode head1,ListNode head2){

        while(head1!=null && head2!=null){

            if(head1.val!=head2.val)
                return false;
            head1 = head1.next;
            head2 = head2.next;

        }

        return true;


    }


    private ListNode reverse(ListNode root){

        ListNode curr = root,prev=null,next=null;

        while(curr!=null){

            next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;

        }

        return prev;

    }


    public class ListNode {
      int val;
      ListNode next;
      ListNode() {}
      ListNode(int val) { this.val = val; }
      ListNode(int val, ListNode next) { this.val = val; this.next = next; }
  }
}
