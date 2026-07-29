package arrayeasy;
import java.util.HashMap;

/*
Approach:
- This file is for practice and simple testing.
- Add small experiments here to understand Java basics and array operations.
*/

public class practice {
    public static int display(int[] nums){
        int n = nums.length;
        int sum = 0;
        int maximum = 0;
        for(int i = 0;i<n;i++){
            sum+=nums[i];

            if(sum > maximum){
            maximum = sum;
           }
            if(sum < 0){
                sum = 0;
            }
        }
        return maximum;
    }
}


