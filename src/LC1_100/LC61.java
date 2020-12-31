package LC1_100;

public class LC61 {
    public class ListNode {
      int val;
      ListNode next;
      ListNode() {}
      ListNode(int val) { this.val = val; }
      ListNode(int val, ListNode next) { this.val = val; this.next = next; }
  }

        public ListNode rotateRight(ListNode head, int k) {
            int len = length(head);

            if(k==0 || len==0 || k%len==0)
                return head;

            k = k % len;

            ListNode curr = head;
            ListNode newHead = head,prev = head;
            for(int i=1;i<=len-(k);i++){

                prev = newHead;
                newHead = newHead.next;
            }

            prev.next = null;
            ListNode key = newHead;
            while(key.next!=null){
                key = key.next;
            }


            key.next = head;
            return newHead;





        }



        public int length(ListNode head){
            ListNode curr = head;
            int ans = 0;
            while(curr!=null){
                ans++;
                curr = curr.next;
            }
            return ans ;
        }
}
