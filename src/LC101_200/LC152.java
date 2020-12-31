package LC101_200;

public class LC152 {
    public int maxProduct(int[] ar) {

        if(ar.length==0)
            return 0;


        int ans = ar[0];
        int max = ar[0];
        int min = ar[0];

        for(int i=1;i<ar.length;i++){

            if(ar[i]<0){
                int temp = max;
                max = min;
                min = temp;
            }

            max = Math.max(ar[i],ar[i]*max);
            min = Math.min(ar[i],ar[i]*min);

            ans = Math.max(max,ans);


        }




        return ans;
    }

}
