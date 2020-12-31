package LC301_400;

public class LC345 {
    public String reverseVowels(String s) {


        char[] ar = s.toCharArray();


        int left = 0;
        int right = ar.length-1;

        while(left<right){

            char l = ar[left];
            char r = ar[right];

            if(isVowel(l) && isVowel(r)){
                swap(left,right,ar);
                left++;
                right--;
            }else if(isVowel(l)){
                right--;

            }else if(isVowel(r)){
                left++;
            }
            else{
                right--;
                left++;
            }




        }

        return new String(ar);
    }

    private static void swap(int left,int right,char[] ar){

        char c = ar[left];
        ar[left] = ar[right];
        ar[right] = c;
    }




    private static boolean isVowel(char c){


        if(c=='A' || c=='a' || c == 'E' || c=='e' || c == 'i' || c=='I' || c=='O' || c=='o' || c=='U' || c=='u')
            return true;
        else
            return false;

    }

}
