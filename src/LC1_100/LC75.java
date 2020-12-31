package LC1_100;

public class LC75 {
    public void sortColors(int[] ar) {

        int left =0 ,mid =0 ,right = ar.length-1;


        while(mid<=right){

            int x = ar[mid];

            switch(x){

                case 0 : swap(ar,left,mid);
                    left++;
                    mid++;
                    break;
                case 1 :mid++;

                    break;
                case 2 :swap(ar,mid,right);
                    right--;
                    break;
            }


        }


    }

    private void swap(int[] ar,int left,int right){

        int temp = ar[right];
        ar[right] = ar[left];
        ar[left] = temp;

    }
}
