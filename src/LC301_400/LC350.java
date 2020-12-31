package LC301_400;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class LC350 {
    public int[] intersect(int[] nums1, int[] nums2) {

        HashMap<Integer,Integer> hashMap = new HashMap<>();

        for(int i=0;i<nums1.length;i++){
            if(hashMap.containsKey(nums1[i]))
                hashMap.put(nums1[i],hashMap.get(nums1[i])+1);
            else
                hashMap.put(nums1[i],1);
        }


        List<Integer> list = new ArrayList<>();

        for(int i=0;i<nums2.length;i++){

            if(hashMap.containsKey(nums2[i]) && hashMap.get(nums2[i])>0){
                list.add(nums2[i]);
                hashMap.put(nums2[i],hashMap.get(nums2[i])-1);
            }


        }


        int[] ar = new int[list.size()];

        for(int i=0;i<ar.length;i++)
            ar[i] = list.get(i);

        return ar;



    }
}
