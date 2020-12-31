package LC501_600;
import java.util.*;
public class LC560 {
    public int subarraySum(int[] nums, int k) {

        HashMap<Integer,Integer> hashMap = new HashMap<>();

        int ans = 0;
        int sum = 0;

        for(int i=0;i<nums.length;i++){

            sum += nums[i];

            if(sum==k)
                ans++;

            if(hashMap.containsKey(sum-k))
                ans += hashMap.get(sum-k);

            if(hashMap.containsKey(sum))
                hashMap.put(sum,hashMap.get(sum)+1);
            else
                hashMap.put(sum,1);



        }



        return ans;
    }
}
