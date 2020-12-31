package LC1_100;

public class LC34 {
    int first = -1;
    int last = -1;
    public int[] searchRange(int[] nums, int target) {
        int[] ans  = new int[2];

        if (nums.length==0)
            return new int[]{-1,-1};

        if(nums.length==1 && nums[0] == target)
            return new int[]{0,0};

        else if(nums.length==1)
            return new int[]{-1,-1};

        first = -1;
        last = -1;

        first =  searchFront(nums,0,nums.length-1,target);


        last =  searchLast(nums,0,nums.length-1,target);

        ans[0] = first;
        ans[1] = last;

        return ans;

    }

    private int searchFront(int[] ar,int left,int right,int x){

        if(right<left)
            return first;

        int mid = left + (right-left)/2;

        if(ar[mid]==x){
            first = mid;
            return searchFront(ar,left,mid-1,x);
        }
        if(ar[mid]>x)
            return  searchFront(ar,left,mid-1,x);
        else
            return searchFront(ar,mid+1,right,x);

    }
    private int searchLast(int[] ar,int left,int right,int x){


        if(right<left)
            return last;

        int mid = left + (right-left)/2;

        if(ar[mid]==x){
            last = mid;
            return searchLast(ar,mid+1,right,x);
        }

        if(ar[mid]>x)
            return searchLast(ar,left,mid-1,x);
        else
            return searchLast(ar,mid+1,right,x);


    }


}
