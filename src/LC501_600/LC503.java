package LC501_600;
import java.util.*;
public class LC503 {
    public static void main(String[] args) {
        int[] ar = {1,2,1};
        nextGreaterElements(ar);
    }


//     [1,2,1] , n=3
//     We start from i=5 (2*length of array - 1) till 0 by decrementing 1;
//     element indexs are pushed to the stack
//     i         current element           stack          ans              Remarks
//     5      ar[5%3] = ar[2] = 1           <>           [0,0,-1]     As the stack is empty , we put ans[0,0,-1],pushed 2 to stack
//     4      ar[1] = 2                     <2>          [0,-1,-1]    We pop everything from the stack bcz we can't find any element greater than 2,at last we put 1 into the stack
//     3      ar[0] = 1                     <1>          [2,-1,-1]    As ar[stack.peek()] is greater than 1 , we change the ans array . push 0 to stack
//     2      ar[2] = 1                     <0,1>        [2,-1, 2]    0 is popped. 2 is greater than 1, therefore we modify the ans aray.
//     1      ar[1] = 2                     <2,1>        [2,-1, 2]    we pop elements the stack until its empty because the elements are smaller. Pushed 1 to the stack.
//     0      ar[0] = 1                      <1>         [2,-1, 2]    ar[stack.peek()] is greater than 1 , So ans[0] = ar[stack.peek()]



    public  static int[] nextGreaterElements(int[] ar) {

        int n = ar.length;
        //Our ans array
        int[] ans = new int[n];

        Stack<Integer> stack = new Stack<>();

        //Here we traverse the input array twice, and we update our indexes one by one.
        for(int i= 2*n-1;i>=0;i--){

            //If our stack is empty , that element has no greater element than that
            if(stack.isEmpty())
                ans[i%n] = -1;
                //If the top of the stack is greater than the array element, that element is the next greater element for that index. We update the ans array.
            else if(!stack.isEmpty() && ar[stack.peek()]>ar[i%n])
                ans[i%n] = ar[stack.peek()];
                //If the top of the stack is not greater than the array element, we go to a while loop and we element numbers from the stack until it is either empty or the top element becomes greater than the array element
            else if(!stack.isEmpty() && ar[stack.peek()]<=ar[i%n]){
                while(!stack.isEmpty() && ar[stack.peek()]<=ar[i%n])
                    stack.pop();

                //If the stack is empty than there is no greater element than that.
                if(stack.isEmpty())
                    ans[i%n] = -1;
                else
                    //Else we put that element into the ans array at that index.
                    ans[i%n] = ar[stack.peek()];
            }

            //Push the index%length to the stack
            stack.push(i%n);
        }




        return ans;

    }
}
