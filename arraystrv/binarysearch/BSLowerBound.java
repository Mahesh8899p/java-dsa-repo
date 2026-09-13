package arraystrv.binarysearch;

public class BSLowerBound{
    public static int lowerBound(int[] nums, int x){
        /*
        the condition of lower bound is arr[idx] >= x
        */


        /*
        dry run.           target = 4
        [2,4,4,7,9,11]
        low        high
             mid

        mid = 4
        mid >= 4 so 4>= 4
        
        
        */
        int n = nums.length;
        int low = 0;
        int high = n - 1;
        int ans = n;
        while(low <= high){
            int mid = low + (high-low) / 2;
            if(nums[mid] >= x){ 
                ans = mid;
                high = mid - 1;
            }
            else{ 
                low = mid + 1;
            }
        }
        return ans;
    }
    public static void main(String[] args){
        int[] arr = {1,2,3,4,5,6};
        int x = 5;
        lowerBound(arr, x);
    }
}