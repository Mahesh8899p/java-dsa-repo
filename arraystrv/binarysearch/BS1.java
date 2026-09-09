package arraystrv.binarysearch;
//search x in a sorted array
public class BS1 {

    //iterative approach

    public int search(int[] nums, int target){
        int n = nums.length;
        int low = 0;
        int high = n - 1;
        while(low <= high){
            int mid = low + high / 2;
            if(target == nums[mid]){
                return mid;
            }

            else if(target < nums[mid]){
                high = mid - 1;
            }
            else{
                low = mid + 1;
            }
        }
        return -1;
        
    }
    public static void main(String[] args) {
        
    }}

