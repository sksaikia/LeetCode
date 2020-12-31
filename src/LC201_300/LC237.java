package LC201_300;

public class LC237 {

    public class ListNode {
      int val;
      ListNode next;
     ListNode(int x) { val = x; }
  }

    public void deleteNode(ListNode node) {
        int temp = node.next.val;
        node.val = temp;
        node.next = node.next.next;
    }
}
