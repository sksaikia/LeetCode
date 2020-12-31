package LC901_1000;

public class LC977 {
    public int[] sortedSquares(int[] ar) {


        int[] ans = new int[ar.length];

        int left = 0, right = ar.length-1;

        int i =ar.length-1;

        while(i!=-1){

            int L = ar[left]*ar[left];
            int R = ar[right]*ar[right];

            if(L>R){

                left++;
                ans[i--] = L;
            }else{
                right--;
                ans[i--] = R;

            }



        }


        return ans;



    }
}
