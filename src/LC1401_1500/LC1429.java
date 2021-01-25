package LC1401_1500;

import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;

public class LC1429 {
    LinkedHashMap<Integer,Integer> hashMap ;
    List<Integer> list;

//    ["FirstUnique","showFirstUnique","add","showFirstUnique","add","showFirstUnique","add","showFirstUnique"]
//            [[[2,3,5]],[],[5],[],[2],[],[3],[]]
//    Output:
//            [null,2,null,2,null,3,null,-1]
//    Explanation:
//    FirstUnique firstUnique = new FirstUnique([2,3,5]);
//firstUnique.showFirstUnique(); // return 2
//firstUnique.add(5);            // the queue is now [2,3,5,5]
//firstUnique.showFirstUnique(); // return 2
//firstUnique.add(2);            // the queue is now [2,3,5,5,2]
//firstUnique.showFirstUnique(); // return 3
//firstUnique.add(3);            // the queue is now [2,3,5,5,2,3]
//firstUnique.showFirstUnique(); // return -1

    //constructor
    public LC1429(int[] nums) {
        //initilizing the list and linkedhashmap
        list = new ArrayList<>();
        hashMap = new LinkedHashMap<>();

        //add all the initial elements into the list and hashmap
        for(int n : nums){
           add(n);
        }


    }

    //in this method we iterate over each element present in the hashmap . If it's counter is one , then we return it,
    // If there is no element present with occurance 1, we return -1.
    public int showFirstUnique() {
        for(int c:hashMap.keySet()){
            if(hashMap.get(c)==1)
                return c;

        }
        return -1;
    }

    //in this method we add elements to the list and map. If the element is present in the hashMap then we increment its
    //counter by 1 , else put that element into the hashmap with value 1.
    public void add(int n) {
        list.add(n);
        if(hashMap.containsKey(n))
            hashMap.put(n,hashMap.get(n)+1);
        else
            hashMap.put(n,1);

    }

}
