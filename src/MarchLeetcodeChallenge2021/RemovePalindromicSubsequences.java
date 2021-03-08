package MarchLeetcodeChallenge2021;

public class RemovePalindromicSubsequences {

    public int removePalindromeSub(String s) {

            int left = 0;
            int right = s.length()-1;

            if(s.length()==0)
                return 0;

            while(left<right){

                if(s.charAt(left)==s.charAt(right)){
                    left++;
                    right--;

                }else{
                    return 2;
                }


            }

            return 1;
        }

}
