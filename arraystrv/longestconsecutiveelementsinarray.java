package arraystrv;
import java.util.HashSet;

/*
Approach:
- Put all elements into a HashSet so you can check presence in O(1) time.
- Loop through each number in the array.
- If the previous value is not present, treat the current number as the start of a sequence.
- Extend the sequence by checking the next consecutive values and track the maximum length.
*/

public class longestconsecutiveelementsinarray{
    public int longestConsecutive(int[] nums){
        int result = 0;
        int n = nums.length;
        for(int i =0;i<n;i++){
            set.add(nums[i]);
        }
        for(int x: nums){
            //checking for the first element and if you are the first element then ur previous one will not be in the set.
            //set.contains(x-1) checks if its the first element or not (if its the first element then we will start counting the sequence)
            if (!set.contains(x-1)){
                int num = x;
                int length = 0;
                while(set.contains(num+1)){
                    length++;
                }
                
            }
        }
    }
    return result;
}