package LC1701_1800;

public class LC1737 {
    class Solution {
        public int minCharacters(String a, String b) {
            int ans = Integer.MAX_VALUE;

            //WE call the make method for first two conditions. First call makes a smaller than b and second one makes b smaller than a.
            ans = Math.min(make(a,b),make(b,a));

            //This is for the 3rd conditions. We count the steps to make the strings contain only one distinct character.
            for(char ch='a';ch<='z';ch++){

                int total = a.length() + b.length();

                for(char c:a.toCharArray())
                    if(c==ch)
                        total--;
                for(char c:b.toCharArray())
                    if(c==ch)
                        total--;

                ans = Math.min(total,ans);

            }


            return ans;
        }

        //This method checks for the first two conditions
        //For given string a and b, we try to make a smaller than b . We count the no of steps needed to make a smaller than b . We return the minimum value for it.
        public int make(String a, String b){

            int local = Integer.MAX_VALUE;

            for(char ch='b';ch<='z';ch++){

                int temp = 0;
                for(char c:a.toCharArray()){
                    if(c>=ch)
                        temp++;
                }

                for(char c:b.toCharArray()){
                    if(c<ch)
                        temp++;
                }
                local = Math.min(local,temp);

            }

            return local;
        }

    }
}
