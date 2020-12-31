package LC201_300;

import java.util.Stack;

public class LC232 {
    Stack<Integer> stack1,stack2;

    /** Initialize your data structure here. */
    public LC232() { // This is the queue
        stack1 = new Stack<>();
        stack2 = new Stack<>();
    }

    /** Push element x to the back of queue. */
    public void push(int x) {

        while(!stack1.isEmpty())
            stack2.push(stack1.pop());

        stack1.push(x);
        while(!stack2.isEmpty())
            stack1.push(stack2.pop());



    }

    /** Removes the element from in front of queue and returns that element. */
    public int pop() {
        if(stack1.isEmpty())
            return -1;

        int x = stack1.pop();

        return x;

    }

    /** Get the front element. */
    public int peek() {
        if(stack1.isEmpty())
            return -1;

        int x = stack1.peek();

        return x;
    }

    /** Returns whether the queue is empty. */
    public boolean empty() {
        return stack1.isEmpty();
    }
}
