package arrayeasy;
import java.util.ArrayList;
import java.util.Arrays;

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
