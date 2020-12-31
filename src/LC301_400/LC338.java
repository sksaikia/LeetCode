package LC301_400;

public class LC338 {

    public int[] countBits(int num) {

        int[] ans = new int[num+1];

        if(num==0){
            ans[0] = 0;
            return ans;
        }

        if(num==1){
            ans[0] = 0;
            ans[1] = 1;
            return ans;

        }

        ans[0] = 0;
        ans[1] = 1;

        for(int i=2;i<=num;i++){

            if(i%2==0)
                ans[i] = ans[i/2];
            else
                ans[i] = 1 + ans[i-1];


        }

        return ans;


    }
}
