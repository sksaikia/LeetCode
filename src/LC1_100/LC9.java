package LC1_100;

public class LC9 {
    public boolean isPalindrome(int x) {
        if(x<0)
            return false;

        int res = x;
        int ans = 0;

        while(res>0){
            int y = res % 10;

            ans = ans*10 + y;
            res = res/10;

        }

        if(ans==x)
            return true;
        else
            return false;

    }
}
