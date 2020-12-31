package LC301_400;
import java.util.*;
public class LC349 {
    public int[] intersection(int[] nums1, int[] nums2) {
        HashSet<Integer> hashSet = new HashSet<>();

        for(int i=0;i<nums1.length;i++){
            if(!hashSet.contains(nums1[i]))
                hashSet.add(nums1[i]);


        }

        List<Integer> list = new ArrayList<>();

        for(int i=0;i<nums2.length;i++){
            if(hashSet.contains(nums2[i])){
                list.add(nums2[i]);
                hashSet.remove(nums2[i]);
            }
        }


        int[] ar = new int[list.size()];

        for(int i=0;i<ar.length;i++){
            ar[i] = list.get(i);
        }


        return ar;


    }
}
