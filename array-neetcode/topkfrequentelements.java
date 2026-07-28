package arrayhashing;
import java.util.HashMap;
import java.util.ArrayList;
import java.util.List;

public class topkfrequentelements {

    public int[] topKFrequent(int[] nums, int k){
        //input -> [1,1,1,2,2,3] k =2
        //goal find the 2 most frequent numbers
        //create a hashmap which would contain the frequency of the elements which are there in the array
        //phase 1 -> count the frequency using the HashMap
        //start map={}/

            HashMap<Integer,Integer> map = new HashMap<>();
            //now create a bucket array which would store the values of above with their frequency also
            
            //for each number : 1 -> getOrDefault 1 not found as map is empty so put 0 as the default value -> MapState {1->1}
            for(int num: nums){
                map.put(num,map.getOrDefault(num,0)+ 1);
                //{1->3,2->2,3->1}
                //map   
                
            //phase 2a: create bucket array 
                List<Integer>[] bucket = new ArrayList[nums.length + 1]; 
                //bucket = [null , null , null, null, null , null , null]
                //          0    1     2  3   4    5    6      
                //Now for loop for putting the actual empty ArrayList in each of the slot
                for(int i = 0; i<bucket.length; i++){
                    bucket[i] = new ArrayList<>();
                }
                // bucket = [[],[],[],[],[],[],[],[]]

            //phase 2b -fill the buckets
            //map.keySet->returns the keys of the map
            for(int key: map.keySet()){
                //keyset -> {1,2,3}
                //          key
                int value = map.get(key);
                //value -> value of 1->3
                //         value of 2->2
                //         value of 3->1
                bucket[value].add(key);
            }

            }
            

    }
    public static void main(String[] args){
            
    }
}
