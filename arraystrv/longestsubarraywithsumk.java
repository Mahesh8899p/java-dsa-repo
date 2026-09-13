package arraystrv;
import java.util.HashMap;


public class longestsubarraywithsumk{
    public static int longestSubarray(int[] nums, int k){
        int n = nums.length;
        int[] prefixsum = new int[n];
        prefixsum[0] = nums[0];
        for(int i = 1;i<n;i++){
            prefixsum[i] = prefixsum[i-1] + nums[i];
        }

        int result = 0;
        HashMap<Integer,Integer> map = new HashMap<>();
        for(int i =0;i<n;i++){
            if(prefixsum[i] == k){
                result = Math.max(result,i+1);
            }
            int val = prefixsum[i] - k;

            if(map.containsKey(val)){
                result = Math.max(result,i-map.get(val));
            }
            
            if(!map.containsKey(prefixsum[i])){
                map.put(prefixsum[i],i);
            }
        }
        return result;
}
}
