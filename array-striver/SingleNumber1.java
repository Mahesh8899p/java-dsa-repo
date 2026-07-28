package arrayeasy;
import java.util.HashMap;

public class SingleNumber1 {
    //Given an array of nums of n integers. 
    // Every integer in the array appears twice except one integer.
    //  Find the number that appeared once in the array.
    public int singleNumber(int[] nums){
        //first sort the array
        //then compare the pairs in xor meaning if the pair contains the same number then the integer has came twice other wise the integer has not came twice.
        HashMap<Integer,Integer> map = new HashMap<>();
        for(int num:nums){
            map.put(num,map.getOrDefault(num, 0)+1);
        }
        for(int key : map.keySet()){
            //map.get-> returns the value of the key
            if(map.get(key) == 1){
                return key;
            }
        }
        return -1;
    }

}
