package LC1201_1300;

public class LC1221 {
    public int balancedStringSplit(String s) {

        int left = 0 ,right = 0;

        int count = 0;


        for(int i=0;i<s.length();i++){

            char c = s.charAt(i);

            if(c=='L')
                left++;
            if(c=='R')
                right++;

            if(left==right && right!=0){
                count++;
                right =0;
                left = 0;
            }


        }


        return count;

    }
}
