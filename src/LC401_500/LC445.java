package LC401_500;

public class LC445 {
    public class ListNode {
      int val;
      ListNode next;
      ListNode() {}
      ListNode(int val) { this.val = val; }
      ListNode(int val, ListNode next) { this.val = val; this.next = next; }
  }


        public ListNode addTwoNumbers(ListNode l1, ListNode l2) {


            l1 = reverse(l1);
            l2 = reverse(l2);


            ListNode head = new ListNode(0);
            int carry = 0;

            ListNode dummy = head;

            int x = 0 , y = 0 ;
            while(l1!=null || l2!=null){


                if(l1==null)
                    x = 0 ;
                else
                    x = l1.val;

                if(l2==null)
                    y=0;
                else
                    y = l2.val;

                int z = x+y+carry;

                carry = z/10;

                head.next = new ListNode(z%10);



                head = head.next;

                if(l1!=null)
                    l1 = l1.next;
                if(l2!=null)
                    l2 = l2.next;



            }
            if(carry>0)
                head.next = new ListNode(carry);



            return reverse(dummy.next);

        }


        private static ListNode reverse(ListNode head){

            ListNode prev=null,curr=head,next=null;


            while(curr!=null){

                next = curr.next;
                curr.next = prev;
                prev = curr;
                curr = next;


            }


            return prev;

        }
}
