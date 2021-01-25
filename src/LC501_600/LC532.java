package LC501_600;
import java.util.*;
public class LC532 {
    public int findPairs(int[] nums, int k) {

        // Dry Run
        //  nums = [3,1,4,1,5], k = 2
        //  <3->1>, <1->2> , <4->1>, <5->1> ; Here <Array Element -> Occurance of that element>
        // As k=2 ; we have 1+2 = 3 and 3+2 = 5 ; which makes  (1,3) and (3,5) k-diff pair; output will be 2
        //  nums = [1,3,1,5,4], k = 0
        // <1->2>, <3->1>,<5->1>,<4->1> ;
        // As k=0; this is a special case, so we will check occurance of a no .
        // As 1 appears twice, our output will be 1.

        //Absolute Differnce can not negative
        if(k<0)
            return 0;
        //We are having a HashMap which takes <Element,Counter> as a pair.
        //The first Integer keeps the array element and second Integer keeps the counter for that element.

        HashMap<Integer,Integer> hashMap = new HashMap<>();
        for(int i=0;i<nums.length;i++){
            int curr = nums[i];
            if(hashMap.containsKey(curr))
                hashMap.put(curr,hashMap.get(curr)+1);
            else
                hashMap.put(curr,1);

        }
        //Now we have the frequency of each element stored in the hashMap.
        int ans = 0;
        //We run a loop for each key in the hashMap.
        for(int i:hashMap.keySet()){

            //So here is the integer which we have to search for in the hashMap
            int remainder = i+k;
            //k==0 is a special case. So if we have multiple occurance a no ,
            // then we can consider one pair for it.
            if(k==0){
                if(hashMap.get(i)>=2){
                    ans++;
                }
            }

            else{
                //If remainder is present in the hashMap, increment ans variable.
                if(hashMap.containsKey(remainder)){
                    ans++;
                }

            }

        }
        return ans;
    }
}
