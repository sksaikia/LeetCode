package LC401_500;

import java.util.HashMap;

public class LC409 {
    public int longestPalindrome(String str) {
        HashMap<Character,Integer> hashMap = new HashMap<>();

        for (int i=0;i<str.length();i++){

            char ch = str.charAt(i);
            if (hashMap.containsKey(ch))
                hashMap.put(ch,hashMap.get(ch)+1);
            else
                hashMap.put(ch,1);


        }

        int count = 0;
        for (int c: hashMap.values()){

            count += c/2 * 2;

            if(count%2==0 && c%2==1)
                count++;

        }

        return count;

    }
}
