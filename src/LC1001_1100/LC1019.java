package LC1001_1100;
import java.util.*;
public class LC1019 {
    public class ListNode {
      int val;
     ListNode next;
      ListNode() {}
      ListNode(int val) { this.val = val; }
      ListNode(int val, ListNode next) { this.val = val; this.next = next; }
  }

        public int[] nextLargerNodes(ListNode head) {

            ArrayList<Integer> list = new ArrayList<>();

            ListNode curr = head;

            while(curr!=null){
                list.add(curr.val);
                curr = curr.next;
            }

            int[] ans = new int[list.size()];

            Stack<Integer> stack = new Stack<>();

            int n =list.size();

            for(int i=n-1;i>=0;i--){

                System.out.println(stack.size());
                int x = list.get(i);

                if(stack.isEmpty())
                    ans[i] = 0;
                else if(!stack.isEmpty() && stack.peek()>x)
                    ans[i] = stack.peek();
                else if(!stack.isEmpty() && stack.peek()<=x){
                    while(!stack.isEmpty() && stack.peek()<=x)
                        stack.pop();
                    if(stack.isEmpty())
                        ans[i] = 0;
                    else
                        ans[i] = stack.peek();
                }


                stack.push(x);

            }

            return ans;


        }
}
