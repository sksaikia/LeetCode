package LC1_100;
import java.util.*;
public class LC23 {
    public class ListNode {
     int val;
     ListNode next;
      ListNode(int x) { val = x; }
  }

        public ListNode mergeKLists(ListNode[] lists) {

            if(lists==null)
                return null;

            ListNode head = null,temp=null;

            PriorityQueue<ListNode> pQueue = new PriorityQueue<>(new Comparator<ListNode>(){

                public int compare(ListNode o1,ListNode o2){
                    return o1.val-o2.val;
                }
            });

            for(int i=0;i<lists.length;i++){
                if(lists[i]!=null)
                    pQueue.add(lists[i]);
            }


            while(!pQueue.isEmpty()){

                ListNode popped = pQueue.poll();

                if(head==null){
                    head = popped;
                    temp = head;
                }
                else{
                    head.next = popped;
                    head = head.next;
                }

                if(popped.next!=null)
                    pQueue.add(popped.next);



            }

            return temp;

        }
}
