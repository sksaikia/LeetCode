package LC901_1000;
import java.util.*;
public class LC974 {
    public int subarraysDivByK(int[] A, int K) {

        int ans = 0;
        HashMap<Integer,Integer> hashMap = new HashMap<>();

        int sum = 0;

        hashMap.put(0,1);

        for(int i=0;i<A.length;i++){

            sum = sum+A[i];

            int rem = sum%K;
            if(rem<0)
                rem += K;

            if(hashMap.containsKey(rem)){

                ans += hashMap.get(rem);
                hashMap.put(rem,hashMap.get(rem)+1);
            }


            else{
                hashMap.put(rem,1);
            }
            //   System.out.println(hashMap + " ans : " + ans);


        }


        return ans;


    }
}
