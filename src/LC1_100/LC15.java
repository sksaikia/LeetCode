package LC1_100;
import java.util.*;
public class LC15 {
    public List<List<Integer>> threeSum(int[] ar) {


        Arrays.sort(ar);
        HashSet<List<Integer>> ans = new HashSet<>();



        for(int i=0;i<ar.length;i++){

            int left = i+1;
            int right = ar.length-1;

            while(left<right){

                int x = ar[left];
                int y = ar[right];
                int z = ar[i];

                if(x+y+z==0){
                    List<Integer> list = new ArrayList<>();

                    list.add(z);
                    list.add(ar[left]);
                    list.add(ar[right]);

                    ans.add(list);
                    left++;
                    right--;

                }
                else if(x+y+z<0){
                    left++;
                }else{
                    right--;
                }


            }


        }

        List<List<Integer>> list = new ArrayList<>();

        Iterator it = ans.iterator();
        while (it.hasNext()){
            list.add((List<Integer>) it.next());
        }





        return list;



    }
}
