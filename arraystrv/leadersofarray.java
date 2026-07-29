package arraystrv;
import java.util.ArrayList;
import java.util.List;
import java.util.Collections;

/*
Approach:
- Traverse the array from right to left.
- Maintain the maximum value seen so far.
- Add the current value to the result when it is greater than the maximum seen so far.
*/

public class leadersofarray{
    //[1, 2, 5, 3, 1, 2]
    public static List<Integer> displayleaders(int[] nums){
        List<Integer> result = new ArrayList<>();

        int n = nums.length;
        int maxSoFar = nums[n-1];//last element is always a leader
        result.add(maxSoFar);//adding the last element in the List
        for(int i = n-2;i>=0;i--){//for loop starting from n-2 
           if(nums[i] > maxSoFar){
            maxSoFar = nums[i];
            result.add(maxSoFar);

           }
        }
        Collections.reverse(result);//collections has one reverse method which can be used to reverse the different elements in the list
        return result;
    }
    
    public static void main(String[] args){
        int[] nums = {16, 17, 4, 3, 5, 2};
        List<Integer> leaders = displayleaders(nums);
        System.out.println(leaders);
    }
}