package LC201_300;

import java.util.LinkedList;
import java.util.Queue;

public class LC225 {
    Queue<Integer> q1,q2;
    /** Initialize your data structure here. */
    public LC225() {
        q1  = new LinkedList<>();
        q2 = new LinkedList<>();
    }

    /** Push element x onto stack. */
    public void push(int x) {
        while(!q1.isEmpty())
            q2.add(q1.poll());

        q1.add(x);
        while(!q2.isEmpty())
            q1.add(q2.poll());


    }

    /** Removes the element on top of the stack and returns that element. */
    public int pop() {
        if(q1.isEmpty())
            return -1;

        return q1.poll();
    }

    /** Get the top element. */
    public int top() {
        if(q1.isEmpty())
            return -1;

        return q1.peek();
    }

    /** Returns whether the stack is empty. */
    public boolean empty() {
        return q1.isEmpty();
    }
}
