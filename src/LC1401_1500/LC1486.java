package LC1401_1500;

public class LC1486 {
    public int xorOperation(int n, int start) {

        int res = start;

        for(int i=1;i<n;i++){

            res = res ^ (start+ 2*i );

        }

        return res;

    }
}
