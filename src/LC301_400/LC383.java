package LC301_400;

import java.util.HashMap;

public class LC383 {
    public boolean canConstruct(String ransomNote, String magazine) {


        HashMap<Character,Integer> hashMap = new HashMap<>();

        for(int i=0;i<magazine.length();i++){


            char c = magazine.charAt(i);

            if(hashMap.containsKey(c))
                hashMap.put(c,hashMap.get(c)+1);
            else
                hashMap.put(c,1);

        }


        for(int i=0;i<ransomNote.length();i++){

            char c = ransomNote.charAt(i);


            if(hashMap.containsKey(c) && hashMap.get(c)>0)
                hashMap.put(c,hashMap.get(c)-1);
            else
                return false;


        }


        return true;


    }
}
