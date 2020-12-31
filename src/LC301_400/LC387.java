package LC301_400;

import java.util.HashMap;

public class LC387 {
    public int firstUniqChar(String s) {
        HashMap<Character,Integer> hashMap = new HashMap<>();

        for(int i=0; i<s.length();i++){

            char c = s.charAt(i);


            if(hashMap.containsKey(c))
                hashMap.put(c,hashMap.get(c)+1);
            else
                hashMap.put(c,1);


        }


        for(int i=0;i<s.length();i++){

            char c  = s.charAt(i);

            if(hashMap.get(c)==1)
                return i;


        }


        return -1;

    }
}
