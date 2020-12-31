package LC101_200;

public class LC167 {
    public int[] twoSum(int[] numbers, int target) {
        int[] ar = new int[2];

        if(numbers.length==0)
            return ar;


        int left = 0;
        int right = numbers.length-1;

        while(left<right){

            // System.out.println();
            int sum = numbers[left] + numbers[right];
            System.out.println(sum);

            if(sum==target){
                ar[0] = left+1;
                ar[1] = right+1;
                return ar;
            }

            if(sum>target){
                right--;
            }else if(sum<target){
                left++;
            }


        }

        return ar;



    }
}
