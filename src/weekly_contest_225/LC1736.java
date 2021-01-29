package weekly_contest_225;

public class LC1736 {


    //hour first digit : 0-2
    //hour second digit : 0-9
    //minute first digit : 0-5
    //minute second digit : 0-9

    public String maximumTime(String time) {

        char[] ar = time.toCharArray();

//        if the first digit of hour is unknown, then there arrises 3 cases.
//         - If second digit in hour is unknown then put 2 in the first digit.
//         - If the second digit is not "?" , then if it is greater than 3, we should put "1" (eg : 19:xx),
//         - If the second digit is not "?" , then if it is less than that then we put "2",eg: 23:xx ;

        if(ar[0]=='?'){
            if(ar[1]=='?')
                ar[0]= '2';
            else if(ar[1]>='4')
                ar[0] = '1';
            else
                ar[0] = '2';
        }

//        If the second posiiton of hour is unknown , then there arises 2 cases
//         - if first digit is 2 , then put 3 ;eg: 23:xx
//         - if second digit is less than 2 , then put 9 ; eg : 19
//

        if(ar[1]=='?'){
            if(ar[0]=='2')
                ar[1] = '3';
            else
                ar[1] = '9';
        }

        //if the first digit of minute is ? then put 5 at its place


        if(ar[3]=='?'){
            ar[3] = '5';
        }
        //if the second digit of minute is  ? then put 9 at its place.
        if(ar[4]=='?'){
            ar[4] = '9';
        }




        return new String(ar);
    }
}
