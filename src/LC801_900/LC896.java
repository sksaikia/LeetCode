package LC801_900;

public class LC896 {
    public boolean isMonotonic(int[] A) {
        if(A.length==0)
            return true;

        boolean isInc = false;
        boolean isDec = false;

        for(int i=0;i<A.length-1;i++){
            if(A[i]<A[i+1])
                isInc = true;
            else if(A[i]>A[i+1])
                isDec =  true;
        }

        return !(isInc && isDec);

    }
}
