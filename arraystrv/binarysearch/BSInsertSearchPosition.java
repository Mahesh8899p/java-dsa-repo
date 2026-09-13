package arraystrv.binarysearch;

public class BSInsertSearchPosition {

    public static int  searchInsert(int[] nums, int target){
        int n = nums.length;
        int low = 0;
        int high = n - 1;
        int ans = n;
        while(low <= high){
            int mid = low + high / 2;
            if(nums[mid] >= target){
                ans = nums[mid];
                high = mid - 1;
            }
            else{
                low = mid + 1;
            }
        }

        return ans;
        
    }
    public static void main(String[] args){

    }
}
 