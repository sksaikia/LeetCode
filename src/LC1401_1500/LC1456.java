package LC1401_1500;

public class LC1456 {
    public int maxVowels(String s, int k) {

        int curr = 0;
        int ans = 0;
        for(int i=0;i<k;i++){

            if( isVowel(s.charAt(i)) )
                curr++;
            ans = Math.max(ans,curr);
        }


        for(int i=k;i<s.length();i++){

            if(isVowel(s.charAt(i-k)))
                curr--;
            if(isVowel(s.charAt(i)))
                curr++;

            ans  = Math.max(ans,curr);


        }


        return ans;

    }

    private boolean isVowel(char c){


        switch(c){

            case 'a' :
            case 'e' :
            case 'i' :
            case 'o' :
            case 'u' :
                return true;

        }

        return false;

    }
}
