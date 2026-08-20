package arraystrv;
import java.util.Arrays;

public class ThreeSumClosest {
    public void moveZeroes(int[] nums){
        int n = nums.length;
        int j = 0;
        for(int i = 0;i<n;i++){
            if(nums[i] != 0){
                nums[j] = nums[i];
            }
        }
    }
}
