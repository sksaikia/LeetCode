package LC701_800;

import java.util.Arrays;
import java.util.HashSet;

public class LC720 {
    public String longestWord(String[] words) {
        HashSet<String> hashSet = new HashSet<>();

        Arrays.sort(words);

        String ans = "";


        for(String c:words){

            if(c.length()==1 || hashSet.contains(c.substring(0,c.length()-1))){

                if(c.length()>ans.length())
                    ans = c;
                hashSet.add(c);

            }


        }


        return ans;
    }
}
