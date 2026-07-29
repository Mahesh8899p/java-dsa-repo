package arrayeasy;

import java.util.HashMap;

/*
Approach:
- Count the frequency of each number using a HashMap.
- Check which number appears more than half the time.
- Return that number.
*/

public class majorityelement1 {
    public int majorityElement(int[] nums) {
        HashMap<Integer,Integer> map = new HashMap<>();
        int n = nums.length;
        for(int i = 0;i<n;i++){
            map.put(nums[i],map.getOrDefault(nums[i],0)+1);
        }
        for(int num:nums){
            if(map.get(num) > n/2){
                return num;
            }
        }
        return -1;
    }
}
