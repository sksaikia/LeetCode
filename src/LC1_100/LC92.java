package LC1_100;

public class LC92 {


     public class ListNode {
      int val;
      ListNode next;
      ListNode() {}
      ListNode(int val) { this.val = val; }
      ListNode(int val, ListNode next) { this.val = val; this.next = next; }
  }
    public ListNode reverseBetween(ListNode head, int m, int n) {

        if(m==n)
            return head;

        int count = 1;

        ListNode revPrev=null,revStart = null, revEnd = null, revNext = null;

        ListNode curr = head;


        while(count<m){
            revPrev = curr;
            curr = curr.next;
            count++;
        }
        revStart = curr;

        while(count<n){

            curr = curr.next;
            count++;
        }

        revEnd = curr;
        revNext = curr.next;

        curr.next = null;

        ListNode temp = reverse(revStart);

        //If m is 1.

        if(revPrev!=null){

            revPrev.next = temp;
            revStart.next = revNext;

        }else{

            if(revNext!=null)
                head.next = revNext;
            head = temp;

        }

//         revPrev.next = temp;
//         revStart.next = revNext;


        return head;

    }

    private ListNode reverse(ListNode head){

        ListNode prev=null,curr=head,next=null;

        while(curr!=null){

            next = curr.next;
            curr.next = prev;
            prev=curr;
            curr = next;
        }

        return prev;


    }




}
