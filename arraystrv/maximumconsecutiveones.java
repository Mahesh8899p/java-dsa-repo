package arraystrv;

/*
Approach:
- Traverse the array and keep a count of consecutive ones.
- Reset the count when a zero is found.
- Track the maximum count seen.
*/

public class maximumconsecutiveones {
     public int findMaxConsecutiveOnes(int[] nums) {
        int count = 0;
        int max  = 0;
        for(int num : nums){
            if(num == 1){
                count++;
                max = Math.max(count,max);
            }
            else{
                count = 0;
            }
        }
        return count;
    }
}
