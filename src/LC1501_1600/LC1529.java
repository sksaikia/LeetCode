package LC1501_1600;

public class LC1529 {
    public int minFlips(String target) {

        int state = 0;
        int ans = 0;

        for(char c:target.toCharArray()){

            if(c-'0'!=state){
                state = c-'0';
                ans++;
            }

        }

        return ans;

    }
}

