package arrayeasy;

public class sort012array {
    public static void main(String[] args){

    }
    public void swap(int[] nums, int a, int b){
        int temp = nums[a];
        nums[a] = nums[b];
        nums[b] = temp;
    }

    public void sortZeroOneTwo(int[] nums){
        int low = 0;
        int mid =0;
        int n = nums.length - 1;
        int high = n;
        while(mid <= high){
            if(nums[mid] == 0){
                //in the swap function send the array and the arrayname, low pointer , mid pointer
                 swap(nums, low, mid);
                 low++;
                 mid++;
            }
            else if(nums[mid] == 1){
                mid++;
            }
            else{
                //in the 
                swap(nums, mid,high);
                high--;
            }
        }
    }
}
