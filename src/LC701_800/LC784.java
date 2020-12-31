package LC701_800;
import java.util.*;
public class LC784 {
    public List<String> letterCasePermutation(String S) {
        List<String> ans = new ArrayList<>();

        solve(S,"",ans);

        return ans;
    }

    private void solve(String str,String curr,List<String> ans){

        if(str.isEmpty()){
            ans.add(curr);
            return ;
        }
        String op1 = curr;
        String op2 = curr;

        if(Character.isLetter(str.charAt(0))){

            str = str.toLowerCase();
            op1 = op1 + str.charAt(0);
            str = str.toUpperCase();
            op2 = op2 + str.charAt(0);
            str = str.toLowerCase();
            str = str.substring(1);


            solve(str,op1,ans);
            solve(str,op2,ans);
        }
        else
        {
            op1 += str.charAt(0);

            str = str.substring(1);
            solve(str,op1,ans);

        }


    }
}
