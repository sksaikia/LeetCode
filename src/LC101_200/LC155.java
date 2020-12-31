package LC101_200;

import java.util.Stack;

public class LC155 {
    Stack<Integer> stack ;
    int minEle = 0;

    /** initialize your data structure here. */
    public LC155() {
        minEle = 0;
        stack = new Stack<>();
    }

    public void push(int x) {
        if(stack.isEmpty()){
            stack.push(x);
            minEle = x;
            return ;
        }else{

            if(x>=minEle){
                stack.push(x);
                return;
            }else{

                stack.push(2*x-minEle);
                minEle = x;
                return ;
            }


        }
    }

    public void pop() {
        if(stack.isEmpty()){
            return ;

        }else{

            if(stack.peek()>=minEle)
                stack.pop();
            else{

                minEle = 2*minEle - stack.pop();

                return ;

            }

        }
    }

    public int top() {
        if(stack.isEmpty())
            return -1;
        else{

            if(stack.peek()>=minEle)
                return stack.peek();

            else
                return minEle;

        }
    }

    public int getMin() {
        if(stack.isEmpty())
            return -1;
        return minEle;
    }
}
