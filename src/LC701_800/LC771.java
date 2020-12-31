package LC701_800;

import java.util.HashSet;

public class LC771 {
    public int numJewelsInStones(String J, String S) {
        HashSet<Character> hashSet = new HashSet<>();

        for(int i=0;i<J.length();i++)
            hashSet.add(J.charAt(i));

        int count = 0;

        for(int i=0;i<S.length();i++){

            char c = S.charAt(i);
            if(hashSet.contains(c))
                count++;

        }

        return count;


    }
}
