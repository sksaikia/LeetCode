package LC501_600;
import java.util.*;
public class LC532 {
    public int findPairs(int[] nums, int k) {

        if(k<0)
            return 0;

        HashMap<Integer,Integer> hashMap = new HashMap<>();

        for(int i=0;i<nums.length;i++){

            int c = nums[i];
            if(hashMap.containsKey(c))
                hashMap.put(c,hashMap.get(c)+1);
            else
                hashMap.put(c,1);

        }
        //   System.out.println(hashMap);
        int count = 0;

        for (int n : hashMap.keySet()){

            int rem = n + k;

            if(k==0){

                if(hashMap.get(n)>=2){
                    //   System.out.println(hashMap.get(n));
                    count++;
                }

            }else{
                if(hashMap.containsKey(rem)){

                    count++;

                }
            }


        }

        return count;





    }
}
