package LC301_400;

public class LC392 {
    public boolean isSubsequence(String s, String t) {
        int m = s.length();
        int n = t.length();


        int i=0,j=0;

        while(i<m && j<n){

            if(s.charAt(i)==t.charAt(j)){
                i++;
                j++;
            }

            else
                j++;

        }

        if(i==m)
            return true;
        else
            return false;

    }
}
