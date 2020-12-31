package LC301_400;
import java.util.*;
public class LC394 {
    public String decodeString(String s) {
        Stack<String> strings = new Stack<>();
        Stack<Integer> integers = new Stack<>();

        String ans = "";
        int curr = 0;

        for(int i=0;i<s.length();i++){

            char c = s.charAt(i);

            if(Character.isLetter(c))
                ans += c;
            else if(Character.isDigit(c))
                curr = curr*10 + c - '0';
            else if(c=='['){
                integers.add(curr);
                curr = 0;
                strings.add(ans);
                ans = "";

            }else if(c==']'){

                String x = strings.pop();
                int y = integers.pop();

                for(int j=1;j<=y;j++)
                    x += ans;

                ans = x;

            }


        }

        return ans;

    }
}
