package LC201_300;

public class LC231 {
    public boolean isPowerOfTwo(int n) {
        return n>0 &&  ((n&(n-1))==0);
    }
}
