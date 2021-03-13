package MarchLeetcodeChallenge2021;

import java.util.HashSet;

public class CheckIfContainsAllBinaryStrings {
    public boolean hasAllCodes(String s, int k) {

        HashSet<String> hashSet = new HashSet<>();

        //We know that for a length of k we will have 2^k different numbers
        int required = (int) Math.pow(2,k);

        for(int i=k;i<=s.length();i++){
            //eg : 00110110 ; generated substrings : 00,01,11,10,01,11,10
            //Find a substring of length k.
            String temp = s.substring(i-k,i);
            //If we have not found that number add that to the hashset
            if(!hashSet.contains(temp))
                hashSet.add(temp);

        }

        //if the size of the hashset is equal to 2^k then return true else false
        if(hashSet.size()==required)
            return true;
        else
            return false;



    }
}
