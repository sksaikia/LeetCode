package LC101_200;
import java.util.*;
public class LC131 {
    public List<List<String>> partition(String s) {
        List<List<String>> ans = new ArrayList<>();

        List<String> curr = new ArrayList<>();


        decompose(s,ans,curr,0);

        return ans;

    }


    private void decompose(String str,List<List<String>> ans,List<String> curr,int i){

        if(i==str.length()){
            ans.add(curr);
            return;
        }

        for(int k=i;k<str.length();k++){

            if(isPalindrome(str,i,k)){

                String substr = str.substring(i,k+1);
                curr.add(substr);
                decompose(str,ans,new ArrayList<>(curr),k+1);
                curr.remove(curr.size()-1);


            }


        }



    }



    public boolean isPalindrome(String str,int i,int j){

        while(i<j){
            if(str.charAt(i)!=str.charAt(j))
                return false;

            i++;
            j--;

        }


        return true;
    }

}
