package LC101_200;

public class LC191 {
    public int hammingWeight(int n) {
        int ans = 0;

        while(n!=0){

            ans++;
            n = n&(n-1);
        }

        return ans;
    }
}
