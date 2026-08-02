package arraystrv;

/*
Approach:
- Place positive and negative numbers into separate positions.
- Fill the result array by alternating between them.
*/

public class RearrangeArrayElementsbySign{

	public static void main(String[] args){

	}
	public int[] rearrangeArray(int[] nums){
		int n = nums.length;
		int posIndex = 0;
		int negIndex = 1;
		int[] result = new int[n];
		for(int i =0 ;i<n;i++){
			if(nums[i] < 0){
				result[negIndex] = nums[i];
				negIndex+=2;
			}
			else{
				result[posIndex] = nums[i];
				posIndex+=2;
			}
		}
		return result;
	}
}