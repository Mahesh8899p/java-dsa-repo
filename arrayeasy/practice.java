package arrayeasy;
import java.util.HashMap;


public class practice {
    
   public int longestsasumk(int[] nums, int k){
    int n = nums.length - 1;
    int[] prefixsum = new int[n];
    for(int i =0;i<=n;i++){
        prefixsum = nums[i] - k;
    }
    }
}


