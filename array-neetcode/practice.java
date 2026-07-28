import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;

public class practice {
    public static void main(String[] args){

    }
    //has duplicate
public boolean hasDuplicate(int[] nums){
    HashSet<Integer> seen = new HashSet<>();
    for(int num : nums){
        if(seen.contains(num)){
            return true;
        }
        seen.add(num);
    }
    return false;
}

public boolean isAnagram(String s, String t){
    HashMap<Character,Integer> map =  new HashMap<>();
    for(int i = 0; i<s.length();i++){
        char c = s.charAt(i);
        map.put(c,map.getOrDefault(c,0)+1);
    }
    for(int i = 0; i< t.length();i++){
        char ck = t.charAt(i);
        map.put(ck,map.getOrDefault(ck,0)-1);
    }
    for(int num : map.values()){
        if(num != 0){
            return false;
        }
    }
    return true;
}

public int[] twoSum(int[] nums,int target){
    HashMap<Integer,Integer> map = new HashMap<>();
    for(int i = 0; i<nums.length;i++){
        int complement = target - nums[i];
        if(map.containsKey(complement)){
            return new int[]{map.get(complement),i};
        }
        map.put(nums[i],i);
    }
    return new int[]{};
}

public List<List<String>> groupAnagrams(String[] strs){
    HashMap<String,List<String>> map = new HashMap<>();
    for(String s : strs){
        char[] chac = s.toCharArray();
        Arrays.sort(chac);
        String key = new String(chac);
        if(!map.containsKey(key)){
            map.put(key,new ArrayList<>());

        }
        map.get(key).add(s);
        
    }
    return new ArrayList<>(map.values());
}
public int[] topKFrequent(int[] nums, int k){
    //create a hashmap which would contain the integer and integer
    //nums array = [1,2,2,3,3,3]
    // {1->1, 2->2, 3->3}
    // num->frequency
    HashMap<Integer,Integer> map = new HashMap<>();
    //looping through each of the nums array element  
    for(int num: nums){
    //seing the frequency of the the element per num element in the nums array
        map.put(num,map.getOrDefault(num, 0)+1);
    }
    int[] bucket = new int[nums.length+1];
    //[null,null,null,null,null,null]
    for(key : map.keySet()){
        
    }
}

}





