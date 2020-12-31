package LC1401_1500;
import java.util.*;
public class LC1487 {
    public String[] getFolderNames(String[] names) {
        HashMap<String,Integer> hashMap = new HashMap<>();

        String[] ans = new String[names.length];


        for(int i=0;i<names.length;i++){

            if(!hashMap.containsKey(names[i])){
                ans[i] = names[i];
                hashMap.put(names[i],1);
            }
            else{

                int num = hashMap.get(names[i]);

                String temp = names[i] + "(" + num + ")";

                while(hashMap.containsKey(temp)){
                    num = num+1;
                    temp = names[i] + "(" + num + ")";

                }

                ans[i] = temp;
                hashMap.put(temp,1);
                hashMap.put(names[i],num);


            }





        }



        return ans;

    }
}
