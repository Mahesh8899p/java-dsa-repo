package arrayeasy;
import java.util.HashMap;
import java.util.ArrayList;
import java.util.List;

/*
Approach:
- This file is for practice and simple testing.
- Add small experiments here to understand Java basics and array operations.
*/

public class practice {


    public void rotateArrayByOne(int[] nums) {
        int firstelement = nums[0];
        int n = nums.length;
        for(int i = 1;i<n;i++){
            nums[i-1] = nums[i];
        }

        nums[n-1] = firstelement;
    }
}


