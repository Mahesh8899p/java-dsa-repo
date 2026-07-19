package arrayeasy;

import java.util.HashMap;

public class majorityelement1 {
    public int majorityElement(int[] nums) {
        HashMap<Integer,Integer> map = new HashMap<>();
        int n = nums.length - 1;
        for(int i = 0;i<=n;i++){
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
