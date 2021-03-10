package MarchLeetcodeChallenge2021;

public class IntegerToRoman {
        public String intToRoman(int num) {

            int[] nums = {1000,900,500,400,100,90,50,40,10,9,5,4,1};
            String[] values = {"M","CM","D","CD","C","XC","L","XL","X","IX","V","IV","I"};


            StringBuilder str = new StringBuilder();

            for(int i=0;i<nums.length;i++){

                //Assign roman equivalent
                while(num>=nums[i]){
                    num -= nums[i];
                    str.append(values[i]);
                }

            }

            return new String(str);



        }
}
