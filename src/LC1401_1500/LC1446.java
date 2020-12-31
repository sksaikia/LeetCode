package LC1401_1500;

public class LC1446 {
    public int maxPower(String s) {
        if(s==null || s.length()==0)
            return 0;

        int n = s.length();

        int ans = 1;

        char c = s.charAt(0);

        int curr = 1;

        for(int i=1;i<n;i++){

            if(s.charAt(i)==c){
                curr++;
                ans = Math.max(ans,curr);
            }else{
                c = s.charAt(i);
                curr = 1;
            }

        }


        return ans;

    }
}
