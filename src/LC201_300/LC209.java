package LC201_300;

public class LC209 {
    public int minSubArrayLen(int k, int[] ar) {
        int sum = 0;
        int i = 0;
        int j = 0;
        int n =ar.length;
        int ans = Integer.MAX_VALUE;

        if(n==0)
            return 0;

        while (i<n && j<n){

            sum += ar[j];

            while (sum>=k){

                ans = Math.min(ans,j-i+1);
                //  System.out.println("Here : " + sum + " ans : " + ans) ;
                sum -= ar[i++];

            }
            //  System.out.println(sum);

            j++;
        }

        if(ans==Integer.MAX_VALUE)
            return 0;
        return ans;

    }
}
