package LC101_200;

public class LC125 {
    public boolean isPalindrome(String a) {

        a = a.toLowerCase();
        a = a.replaceAll("[^a-zA-Z0-9]", "");
        //   System.out.println(a);

        // char[] ar = a.toCharArray();
        int right = a.length()-1;
        int left = 0;

        while (left<right){

            if (a.charAt(left)!=a.charAt(right))
                return false;

            left++;
            right--;

        }


        return true;

    }
}
