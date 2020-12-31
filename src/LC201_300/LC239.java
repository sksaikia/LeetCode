package LC201_300;
import java.util.*;
public class LC239 {
    public int[] maxSlidingWindow(int[] nums, int k) {

        Deque<Integer> deque = new LinkedList<>();

        int[] ans = new int[nums.length-k+1];


        for(int i=0;i<k;i++){

            while(!deque.isEmpty() && nums[i]>=nums[deque.peekLast()])
                deque.removeLast();

            deque.addLast(i);
        }


        for(int i=k;i<nums.length;i++){

            ans[i-k] = nums[deque.peek()];

            while(!deque.isEmpty() && deque.peek()<=i-k)
                deque.removeFirst();


            while(!deque.isEmpty() && nums[deque.peekLast()]<=nums[i])
                deque.removeLast();

            deque.addLast(i);


        }

        ans[nums.length-k] = nums[deque.peek()];


        return ans;

    }
}
