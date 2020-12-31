package LC401_500;

public class LC441 {
    public int arrangeCoins(int n) {
        long sum =0;

        if(n==0)
            return 0;

        int i=1;
        for(i=1;sum<n;i++){
            sum += i;
            if(sum>n)
                return i-1;
        }

        return i-1;
    }
}
