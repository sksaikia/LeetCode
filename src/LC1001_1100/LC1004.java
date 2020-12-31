package LC1001_1100;

public class LC1004 {
    public int longestOnes(int[] A, int k) {

        int ans = 0;


        int i=0;
        int j =0;

        int n = A.length;

        int count = 0;

        while(i<n && j<n){

            if(A[j]==0)
                count++;

            while(count>k){

                if(A[i]==0){
                    count--;
                }

                i++;
            }

            ans = Math.max(ans,j-i+1);
            j++;


        }



        return ans;

    }
}
