package LC1_100;
import java.util.*;
public class LC3 {
    public int lengthOfLongestSubstring(String s) {


        HashSet<Character> hashSet = new HashSet<>();

        int ans =0;
        int i=0,j=0;

        while(i<s.length() && j<s.length()){

            char c = s.charAt(j);

            if(!hashSet.contains(c)){

                hashSet.add(c);
                j++;
                ans = Math.max(ans,j-i);

            }else{

                hashSet.remove(s.charAt(i++));

            }



        }

        return ans;

    }
}
