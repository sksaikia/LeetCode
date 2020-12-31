package LC1201_1300;

public class LC1249 {
    public String minRemoveToMakeValid(String s) {
        StringBuilder str = new StringBuilder();

        int balance = 0;

        for(int i=0;i<s.length();i++){

            char c = s.charAt(i);

            if(c=='(')
                balance++;
            else if(c==')'){
                if(balance==0)
                    continue;
                balance--;
            }

            str.append(c);

        }

        StringBuilder result = new StringBuilder("");
        for(int i=str.length()-1;i>=0;i--){

            char c = str.charAt(i);
            if(c=='(' && balance>0){
                balance--;
                continue;
            }
            result.append(c);

        }

        return result.reverse().toString();



    }
}
