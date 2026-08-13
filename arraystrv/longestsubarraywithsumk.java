package arraystrv;
import java.util.HashMap;

/*
Approach:
- Use prefix sums to track cumulative sum while iterating.
- Store the first index where each prefix sum appears.
- For each index, find the needed previous prefix sum to get the target subarray sum.
*/

public class longestsubarraywithsumk{

	public static int longestSubarray(int[] nums, int k){
		int n = nums.length;
		int[] prefixsum = new int[n];
		prefixsum[0] = nums[0];
		for(int i =1;i<n;i++){
			prefixsum[i] = prefixsum[i-1] + nums[i];
		}
		HashMap<Integer,Integer> map= new HashMap<>();
		map.put(0,-1); //it handles the subarray starting from index 0
		int result = 0;
		for(int j = 0;j<=n;j++){
			if(prefixsum[j] == k){
				result++;
			}
			int val = prefixsum[j] - k;
			if(map.containsKey(val)){
				result+=map.get(val);
			}
			map.put(prefixsum[j],map.getOrDefault(prefixsum[j],0)+1);

		}
		return result;
	}

	public static void main(String[] args){

	}
}