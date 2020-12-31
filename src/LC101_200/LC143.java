package LC101_200;

public class LC143 {
    public class ListNode {
      int val;
      ListNode next;
      ListNode() {}
      ListNode(int val) { this.val = val; }
      ListNode(int val, ListNode next) { this.val = val; this.next = next; }
  }


        public void reorderList(ListNode head) {


            if(head==null || head.next==null)
                return ;

            ListNode slow = head,fast = head;


            while(fast!=null && fast.next!=null){
                slow = slow.next;
                fast = fast.next.next;
            }


            ListNode postMid = slow.next;
            slow.next = null;


            postMid = reverse(postMid);

            ListNode ans = new ListNode(0);
            ListNode curr = ans;

            while(head!=null || postMid!=null){

                if(head!=null){

                    curr.next = head;
                    curr = curr.next;
                    head = head.next;

                }

                if(postMid!=null){

                    curr.next = postMid;
                    curr = curr.next;
                    postMid = postMid.next;

                }



            }

            ans = ans.next;



        }

        private ListNode reverse(ListNode head){

            ListNode prev=null,curr = head,next=null;


            while(curr!=null){

                next = curr.next;
                curr.next = prev;
                prev= curr;
                curr = next;

            }

            return prev;


        }
}
