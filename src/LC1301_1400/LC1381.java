package LC1301_1400;
import java.util.*;
public class LC1381 {
    Stack<Integer> stack;
    int maxSize;
    int curr;

    public LC1381(int maxSize) {
        stack = new Stack<>();
        this.maxSize = maxSize;
        curr=0;
    }

    public void push(int x) {

        if(curr<maxSize){
            stack.push(x);
            //    System.out.println("Pushed");
            curr++;
        }



    }

    public int pop() {

        if(curr==0  || stack.isEmpty())
            return -1;
        //   System.out.println("Popped");
        curr--;
        return stack.pop();



    }

    public void increment(int k, int val) {

//System.out.println("incrementing");
        Stack<Integer> temp = new Stack<>();

        while(!stack.isEmpty())
            temp.push(stack.pop());

        for(int i=1;i<=k && !temp.isEmpty();i++){

            int x = temp.pop();
            x = x+val;
            stack.push(x);

        }

        while(!temp.isEmpty())
            stack.push(temp.pop());


    }
}
