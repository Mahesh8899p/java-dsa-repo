package arraystrv;
import java.util.HashSet;

/*
Approach:
- Insert all numbers from the array into a HashSet.
- Check each number from 0 to n and find the one that is missing.
*/

public class missingnumber {
    

    public int missingNumber(int[] nums){
        int n = nums.length;
        int expectedSum = n * (n + 1)/2;
        int actualSum = 0;
        for(int num : nums){
            actualSum += num;
        }
        return expectedSum - actualSum;
    }
}
