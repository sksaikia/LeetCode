package LC1201_1300;
import java.util.*;
public class LC1209 {
    public String removeDuplicates(String str, int k) {
        Stack<Node> stack = new Stack<>();

        for (int i=0;i<str.length();i++){
            char c = str.charAt(i);

            if(stack.isEmpty())
                stack.push(new Node(c,1));
            else if (!stack.isEmpty() && stack.peek().count==k-1 && stack.peek().ch==c){
                stack.pop();

            }
            else if (!stack.isEmpty() && stack.peek().ch==c){
                Node curr = stack.pop();
                stack.push(new Node(c,curr.count+1));
            }else{
                stack.push(new Node(c,1));
            }

            //      System.out.println(stack.size());


        }


        StringBuilder sb = new StringBuilder();
        while (!stack.isEmpty()){
            Node curr = stack.pop();
            char c  = curr.ch;
            int y = curr.count;

            for (int i=1;i<=y;i++)
                sb.append(c);
        }

        return sb.reverse(). toString();

    }

    static class Node {

        public char ch;
        public int count;

        public Node(char ch, int count) {
            this.ch = ch;
            this.count = count;
        }
    }

}
