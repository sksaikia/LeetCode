package MarchLeetcodeChallenge2021;

class ListNode {
    int val;
    ListNode next;
    ListNode() {}
    ListNode(int val) { this.val = val; }
    ListNode(int val, ListNode next) { this.val = val; this.next = next; }
}

public class SwapLLNodes {
    public ListNode swapNodes(ListNode head, int k) {


        //fast and slow are used for traversing the linkedlist
        ListNode fast = head;
        ListNode slow = head;

        //First and second are used for swapping
        ListNode first = head, second = head;

        //First should be after k-1 nodes from the slow
        for(int i = 0; i < k - 1; ++i)
            fast = fast.next;

        // Save the node for swapping
        first = fast;

        // Move until the end of the list
        while(fast.next != null) {
            slow = slow.next;
            fast = fast.next;
        }

        // Now save the slow node in second for swapping.
        second = slow;

        // swapping the values now
        int temp = first.val;
        first.val = second.val;
        second.val = temp;

        return head;


    }
}