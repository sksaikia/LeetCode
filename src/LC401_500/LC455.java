package LC401_500;

import java.util.Arrays;

public class LC455 {
    public int findContentChildren(int[] g, int[] s) {

        Arrays.sort(g);
        Arrays.sort(s);

        int i=0,j=0;
        int count = 0;

        while(i<g.length && j<s.length){

            if(g[i]<=s[j]){
                count++;
                i++;
                j++;
            }else {
                j++;
            }

        }

        return count;

    }
}
