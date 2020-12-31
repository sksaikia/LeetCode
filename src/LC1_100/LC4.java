package LC1_100;

public class LC4 {
    public double findMedianSortedArrays(int[] A, int[] B) {

        int m = A.length;
        int n = B.length;

        if(m>n){

            int[] temp = A;
            A = B;
            B = temp;

            int tmp = m;
            m = n;
            n= tmp;

        }


        int min = 0,max = m;
        int halfLen = (m+n+1)/2;


        while(min<=max){

            int i = (min+max)/2;
            int j = halfLen - i;

            if(i<max && B[j-1]>A[i])
                min = i+1;
            else if(i>min && A[i-1]>B[j])
                max = i-1;
            else {

                int maxLeft = 0;
                if(i==0)
                    maxLeft = B[j-1];
                else if(j==0)
                    maxLeft = A[i-1];
                else
                    maxLeft = Math.max(B[j-1],A[i-1]);

                if((m+n)%2==1)
                    return maxLeft;


                int minRight = 0;
                if(i==m)
                    minRight = B[j];
                else if(j==n)
                    minRight = A[i];
                else
                    minRight = Math.min(A[i],B[j]);

                return (double) (minRight+maxLeft)/2;


            }

        }


        return 0.0;



    }
}
