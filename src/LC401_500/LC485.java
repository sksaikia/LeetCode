package LC401_500;

public class LC485 {
    public int findMaxConsecutiveOnes(int[] ar) {

        int count = 0;
        int ans = 0;


        for(int i=0;i<ar.length;i++){

            if(ar[i]==1){
                count++;
                ans = Math.max(ans,count);

            }else
                count=0;


        }

        return ans;

    }
}
