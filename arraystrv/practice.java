package arraystrv;
import java.util.HashMap;

public class practice{
      public int longestSubarray(int[] nums, int k){
          //[10,5,2,7,1,9]

          //prefix sum = [10,15,17,24,25,34]
          //k =15
          int n = nums.length;
          int[] prefixsum = new int[n];
          prefixsum[0] = nums[0];
          for(int i =1;i<n;i++){
               prefixsum[i] = prefixsum[i-1] + nums[i];
          }
          int count = 0;

          HashMap<Integer,Integer> map = new HashMap<>();
          
          for(int i=0;i<n;i++){
               int val = nums[i] - k;
               if(nums[i] == k){
                     Math.max(count, i+1);
               }

               if(map.containsKey(val)){
                    
               }



          }

      }
     }
    


     

     
     



