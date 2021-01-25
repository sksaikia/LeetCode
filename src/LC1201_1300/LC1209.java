package LC1201_1300;
import java.util.*;
public class LC1209 {
    public String removeDuplicates(String str, int k) {

//         Dry run for the code
//         s = "deeedbbcccbdaa" ; k= 3;

//         i   char          stack                 Action
//         0    d        (d,1)
//         1    e        (d,1),(e,1)
//         2    e        (d,1),(e,2)
//         3    e        (d,1),(e,3)          As e occurs thrice we pop it from the stack. stack becomes (d,1)
//         4    d        (d,2)
//         5    b        (d,2),(b,1)
//         6    b        (d,2),(b,2)
//         7    c        (d,2),(b,2),(c,1)
//         8    c        (d,2),(b,2),(c,2)
//         9    c        (d,2),(b,2),(c,3)    As c occurs thrice we pop it from the stack, stack becomes (d,2),(b,2)
//         10   b        (d,2),(b,3)          As b occurs thrice we pop it from the stack, stack becomes (d,2)
//         11   d        (d,3)                As b occurs thrice we pop it from the stack, stack becomes empty
//         12   a        (a,1)
//         13   a        (a,2)

//         now we have a stack . we need to pop elements from the stack and add that character according to its occurance.
//         finally return the reserved string



        //A Stack which keeps all the characters of the string
        Stack<Node> stack = new Stack<>();

        for (int i=0;i<str.length();i++){
            //We take one character at a time from the string
            char c = str.charAt(i);

            //If we have an emoty string then we will push a pair <c,1> to the stack as char c occurs once in the stack.
            if(stack.isEmpty())
                stack.push(new Node(c,1));

                //
            else if (!stack.isEmpty() && stack.peek().count==k-1 && stack.peek().ch==c){
                stack.pop();

            }
            else if (!stack.isEmpty() && stack.peek().ch==c){
                Node curr = stack.pop();
                stack.push(new Node(c,curr.count+1));
            }else{
                stack.push(new Node(c,1));
            }

        }

        //This is optimized version to make a string . Using StringBuilder is optimal then using string concatnation
        StringBuilder sb = new StringBuilder();
        while (!stack.isEmpty()){
            Node curr = stack.pop();
            char c  = curr.ch;
            int y = curr.count;

            for (int i=1;i<=y;i++)
                sb.append(c);
        }

        //Reverse the string to get the answer
        return sb.reverse(). toString();

    }

    //Node is a pair of character and frequenecy of the character. We use this class to put entries into the stack.
    static class Node {

        public char ch;
        public int count;

        public Node(char ch, int count) {
            this.ch = ch;
            this.count = count;
        }
    }


}