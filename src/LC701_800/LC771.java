package LC701_800;

import java.util.HashSet;

public class LC771 {
    public int numJewelsInStones(String J, String S) {
        HashSet<Character> hashSet = new HashSet<>();

        //Adding the jewels in an hashset such that searching jewels becomes an O(1) task
        for(int i=0;i<J.length();i++)
            hashSet.add(J.charAt(i));

        //This is the counter(our answer)
        int count = 0;

        for(int i=0;i<S.length();i++){

            char c = S.charAt(i);
            //If that stone is also a jewel,ie present in the hashset of jewels, we can increment the counter
            if(hashSet.contains(c))
                count++;

        }
        //Return the counter
        return count;


    }
}
