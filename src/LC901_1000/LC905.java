package LC901_1000;

public class LC905 {
    public int[] sortArrayByParity(int[] A) {
        int i =0 ;
        int j = A.length-1;

        while(i<j){

            if(A[i]%2>A[j]%2){

                int temp = A[j];
                A[j] = A[i];
                A[i] = temp;

            }

            if(A[i]%2==0) i++;
            if(A[j]%2==1) j--;


        }


        return A;
    }
}
