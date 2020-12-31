package LC901_1000;
import java.util.*;
public class LC916 {
    public List<String> wordSubsets(String[] A, String[] B) {
        int[] max = new int[26];
        int[] curr;

        for(int i=0;i<B.length;i++){

            curr = new int[26];

            for(int j=0;j<B[i].length();j++){
                char c = B[i].charAt(j);

                curr[c-'a']++;
            }

            for(int j=0;j<26;j++)
                max[j] = Math.max(max[j],curr[j]);



        }


        List<String> result = new ArrayList<>();


        for(int i=0;i<A.length;i++){

            int[] ar = new int[26];

            for(int j=0;j<A[i].length();j++) {

                char c = A[i].charAt(j);

                ar[c - 'a']++;

            }

            boolean state = check(ar,max);

            if(state)
                result.add(A[i]);

        }

        return result;

    }

    private static boolean check(int[] ar,int[] max){

        for(int i=0;i<26;i++){



            if(max[i]>0 && ar[i]==0) {

                return false;
            }
            if (max[i]>0 && ar[i]<max[i]) {

                return false;
            }
        }

        return true;

    }
}
