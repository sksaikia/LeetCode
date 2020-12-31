package LC1_100;

public class LC42 {
    public int trap(int[] height) {

        if(height.length==0)
            return 0;

        int[] left = leftMax(height);
        int[] right = rightMax(height);


        int ans = 0;

        for(int i=0;i<height.length;i++){

            int x = Math.min(right[i],left[i]) - height[i];
            if(x>0)
                ans += x;

        }
        return ans;


    }

    public int[] leftMax(int[] ar){

        int n = ar.length;
        int[] ans = new int[n];

        ans[0] = ar[0];

        for(int i=1;i<n;i++){

            ans[i] = Math.max(ans[i-1],ar[i]);

        }

        return ans;


    }

    public int[] rightMax(int[] ar){
        int n= ar.length;

        int[] ans = new int[n];

        ans[n-1] = ar[n-1];

        for(int i=n-2;i>=0;i--){
            ans[i] = Math.max(ar[i],ans[i+1]);
        }

        return ans;


    }
}
