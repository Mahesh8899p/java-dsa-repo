package arraystrv;

/*
Approach:
- Keep a pointer for the next non-zero position.
- Traverse the array and place non-zero values in order.
- Fill the remaining positions with zeros.
*/

public class movezeroestoend {
    

    public void moveZeroes(int[] nums){
        int j = 0;
        int n = nums.length; 
        for(int i =0;i<n;i++){
            if(nums[i] != 0){
                int temp = nums[i];
                nums[i] = nums[j];
                nums[j]=temp;
                j++;
            }
        }
    }
}

