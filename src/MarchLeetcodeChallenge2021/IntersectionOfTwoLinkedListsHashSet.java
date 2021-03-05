package MarchLeetcodeChallenge2021;

import java.util.HashSet;

public class IntersectionOfTwoLinkedListsHashSet {
    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
        HashSet<ListNode> hashset = new HashSet<>();

        while(headA!=null){
            hashset.add(headA);
            headA = headA.next;
        }


        while(headB!=null){
            if(hashset.contains(headB))
                return headB;
            headB = headB.next;
        }

        return null;

    }
    public class ListNode {
      int val;
      ListNode next;
      ListNode(int x) {
          val = x;
         next = null;
      }
  }
}
