package LC1_100;

public class LC11 {
    public int maxArea(int[] ar) {

        int ans = 0;
        int j = ar.length-1;
        int i =0 ;


        while(i<j){

            ans = Math.max(ans,Math.min(ar[i],ar[j])*(j-i));

            if(ar[i]<ar[j])
                i++;
            else
                j--;

        }

        return ans;

    }
}
