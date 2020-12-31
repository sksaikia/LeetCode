package LC801_900;

public class LC860 {
    public boolean lemonadeChange(int[] bills) {
        int five = 0, ten = 0;

        for (int i=0;i<bills.length;i++){

            if (bills[i]==5)
                five++;
            else if (bills[i]==10){
                if (five==0)
                    return false;
                ten++;
                five--;
            }else if (bills[i]==20){

                if (five>0 && ten>0){
                    five--;
                    ten--;
                }else if (five>=3){
                    five = five-3;
                }else
                    return false;


            }


        }

        return true;

    }
}
