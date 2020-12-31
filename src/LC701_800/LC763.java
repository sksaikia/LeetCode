package LC701_800;
import java.util.*;
public class LC763 {
    public List<Integer> partitionLabels(String S) {

        int[] counts = new int[26];

        for(int i=0;i<S.length();i++)
            counts[S.charAt(i)-'a'] = i;


        ArrayList<Integer> list = new ArrayList<>();

        int start = 0, end =0;

        for(int i=0;i<S.length();i++){

            end  = Math.max(end,counts[S.charAt(i)-'a']);
            if(i==end){
                list.add(end-start+1);
                start = i+1;
            }

        }
        return list;


    }
}

