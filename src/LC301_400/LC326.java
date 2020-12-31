package LC301_400;

public class LC326 {
    public boolean isPowerOfThree(int n) {
        return ( Math.log10(n)/Math.log10(3)) %1==0;
    }
}
