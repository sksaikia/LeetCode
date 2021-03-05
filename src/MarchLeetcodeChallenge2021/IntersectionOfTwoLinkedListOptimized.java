package MarchLeetcodeChallenge2021;

public class IntersectionOfTwoLinkedListOptimized {
    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {

        ListNode tempA = headA;
        ListNode tempB = headB;

        while(tempA!=tempB){
            if(tempA==null)
                tempA = headB;
            else
                tempA = tempA.next;

            if(tempB==null)
                tempB = headA;
            else
                tempB = tempB.next;
        }
        return tempA;

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
