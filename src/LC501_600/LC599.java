package LC501_600;

import java.util.*;

public class LC599 {
    public String[] findRestaurant(String[] list1, String[] list2) {

        HashMap<String,Integer> hashMap = new HashMap<>();

        for(int i=0;i<list1.length;i++)
            hashMap.put(list1[i],i);


        List<String> list = new ArrayList<>();

        int small = Integer.MAX_VALUE;

        for(int i=0;i<list2.length;i++){

            if(hashMap.containsKey(list2[i])){
                int key = hashMap.get(list2[i]);

                int no = key + i;

                if(no<small){

                    small = no;
                    list = new ArrayList<>();
                    list.add(list2[i]);

                }else if(no==small){
                    list.add(list2[i]);

                }

            }


        }


        return list.toArray(new String[list.size()]);




    }

}
