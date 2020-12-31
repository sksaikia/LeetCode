package LC1_100;

public class LC28 {
    public int strStr(String haystack, String needle) {

        int l1 = haystack.length(), l2 = needle.length();
        if (l1 < l2) {
            return -1;
        } else if (l2 == 0) {
            return 0;
        }


        int[] kmp  = search(needle);

        int M = haystack.length();
        int N = needle.length();

        int i=0,j=0;

        int ans = -1;
        while(i<M){

            if(haystack.charAt(i)==needle.charAt(j)){
                i++;
                j++;

            }


            if(j==N){
                return (i-j);
            }
            else if(i<M && haystack.charAt(i)!=needle.charAt(j)){
                if(j!=0)
                    j = kmp[j-1];
                else
                    i = i+1;
            }




        }


        return ans;

    }

    private int[] search(String needle){

        int n = needle.length();
        int[] kmp = new int[n];


        int i =0 ;
        int j =1;
        int len = 0;
        while(j<n){

            if(needle.charAt(i)==needle.charAt(j)){
                len++;
                kmp[j] = len;
                i++;

            }else if(len!=0){
                len = kmp[i-1];

            }


            j++;



        }
        return kmp;


    }
}
