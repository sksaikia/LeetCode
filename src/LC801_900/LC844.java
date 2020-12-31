package LC801_900;

import java.util.Stack;

public class LC844 {
    public boolean backspaceCompare(String a, String b) {
        Stack<Character> stackA = new Stack<>();
        Stack<Character> stackB = new Stack<>();

        int l = 0;
        int r = 0;
        while(l<a.length()){

            if (a.charAt(l)!='#'){
                stackA.push(a.charAt(l));
            }else{
                if(!stackA.isEmpty())
                    stackA.pop();
            }
            l++;

        }

        l=0;
        while(l<b.length()){

            if (b.charAt(l)!='#'){
                stackB.push(b.charAt(l));
            }else{
                if(!stackB.isEmpty())
                    stackB.pop();
            }

            l++;
        }

        while(!stackA.isEmpty() && !stackB.isEmpty()){
            char c1 = stackA.pop();
            char c2= stackB.pop();
            if (c1!=c2)
                return false;
        }

        if (stackA.isEmpty() && stackB.isEmpty())
            return true;
        return false;

    }
}
