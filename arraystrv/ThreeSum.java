package arraystrv;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
public class ThreeSum {
    public static List<List<Integer>> threesum(int[] nums){
        Arrays.sort(nums);
        Set<List<Integer>> result = new HashSet<>();
        int n = nums.length;
        if(n<3){
            return new ArrayList<>();
        }
       
        List<Integer> list = new ArrayList<>();
        for(int i = 0;i<n-2;i++){
            int left = i + 1;
            int right = n -1;
            
            while(left < right) {
                int sum = nums[i] + nums[left] + nums[right];

            if(sum == 0){

                //add logic
                result.add(Arrays.asList(nums[i],nums[left],nums[right]));
                left++;
                right--;
            }

            else if(sum < 0){
                left++;
            }
            else{
                right++;
            }
            }
            
        }
        return new ArrayList<>(result);
        
    }
}
