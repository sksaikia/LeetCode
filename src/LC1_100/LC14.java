package LC1_100;

public class LC14 {
    public String longestCommonPrefix(String[] strs) {

        if(strs==null || strs.length==0)
            return "";

        String prefix = strs[0];

        for(int i=1;i<strs.length;i++){

            int minLength = Math.min(prefix.length(),strs[i].length());

            int j =0;

            while(j<minLength){

                if(prefix.charAt(j)!=strs[i].charAt(j))
                    break;

                j++;
            }

            prefix = prefix.substring(0,j);


        }

        return prefix;

    }
}

