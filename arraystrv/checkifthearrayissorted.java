package arrayeasy;
import java.util.ArrayList;
import java.util.Arrays;

/*
Approach:
- Traverse the array from the second element.
- Compare each element with the previous one.
- If any element is smaller than the previous one, the array is not sorted.
*/

public class checkifthearrayissorted {
    public boolean isSorted(int[] nums){
        int n = nums.length;
        for(int i = 1; i < n ; i++){
            if(nums[i] < nums[i-1]){
                return false;
            }
        }
        return true;
    }
}
