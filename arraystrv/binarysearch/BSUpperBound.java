package arraystrv.binarysearch;

public class BSUpperBound {
    public static int UpperBound(int[] nums, int x){
        /*
        the condition of lower bound is arr[idx] > x
        */
        int n = nums.length;
        int low = 0;
        int high = n - 1;
        int ans = 0;
        while(low <= high){
            int mid = low + high / 2;
            //upper bound condition here 
            if(nums[mid] > x){
                ans = mid;
                high = mid - 1;
            }
            else{
                low = mid + 1;
            }
        }
        return ans;
    }
    public static void main(String[] args) {
         
    }

}

