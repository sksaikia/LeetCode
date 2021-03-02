package MarchLeetcodeChallenge2021;

import java.util.HashMap;

public class DistributeCandies {
    public int distributeCandies(int[] candyType) {
        HashMap<Integer,Integer> hashMap = new HashMap<>();
        for(int i=0;i<candyType.length;i++){

            if(hashMap.containsKey(candyType[i]))
                hashMap.put(candyType[i],hashMap.get(candyType[i])+1);
            else
                hashMap.put(candyType[i],1);

        }

        int n = candyType.length/2;

        if(hashMap.size()>n)
            return n;
        else
            return hashMap.size();


    }
}
