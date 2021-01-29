package LC1_100;
import java.util.*;

public class LC22Reverse {
     static List<String> ans;

    public static void main(String[] args) {
        generateParenthesis(3);

        for (String c:ans)
            System.out.print(c + " ");
    }

    public static List<String> generateParenthesis(int n) {

        ans = new ArrayList<>();
        solve("",0,0,n);
        return ans;

    }

    private static void solve(String str,int left,int right,int n){

        System.out.println("solve called for : " + str + " left : " + left + " right : " + right);
        if(str.length()==2*n)
            ans.add(str);

        if(left<n){
            String temp1 = str;
            temp1+="(";
            solve(temp1,left+1,right,n);
        }

        if(right<left){
            String temp1 = str;
            temp1 += ")";
            solve(temp1,left,right+1,n);
        }

    }
}
