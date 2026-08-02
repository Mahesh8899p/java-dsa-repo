package arraystrv;

/*
Approach:
- Use Kadane's algorithm.
- Keep a running sum and update it by choosing the better of current element and current sum + element.
- Track the maximum subarray sum seen so far.
*/

public class maximumsubarraysum {
    public int maxSubArray(int[] nums) {
        int sum = 0;
        int maximum = Integer.MIN_VALUE;
        int n = nums.length - 1;
        for(int i = 0;i<=n;i++){
            sum += nums[i];

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
