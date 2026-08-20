package arraystrv;
import java.util.HashMap;
public class numberofsubarraywithxork{

   public static int subarraysWithXOR(int[] nums,int k){
      /*
      xor - same elemets - 0 
            different elements - 1
      [4,2,2,6,4]

      K= 6

      prefixor = 0;
      ans = 0;

      x = 4
      prefixor = prefixor ^ x
      prefixor = 0 ^ 4
      prefixor = 4;

      int need = prefixor ^ k
      need = 4 ^ 6 
      need = 2 

      
      */
      /*
      simple initution is 
      we have array = [4,2,2,6,4]

      
      prefixXor[0] = arr[0]                      = 4
      prefixXor[1] = arr[0]^arr[1]                = 4^2 = 6
      prefixXor[2] = arr[0]^arr[1]^arr[2]         = 6^2 = 4
      prefixXor[3] = arr[0]^arr[1]^arr[2]^arr[3]  = 4^6 = 2
      prefixXor[4] = ... ^arr[4]                  = 2^4 = 6      

      so xor array = [4,6,4,2,6]
      now xor every element by k (in this case its 6)
      and check where the element which comes after this is in hashmap or not 
      if its there in hashmap increase the count 

      */

      int xor = 0;
      HashMap<Integer,Integer> map = new HashMap<>();
      map.put(0,1);
      int count = 0;
      for(int x : nums){
         xor = xor ^ x;
         int need = xor ^ k;
         if(map.containsKey(need)){
            count += map.get(need);
         }

         map.put(xor,map.getOrDefault(xor,0)+1);
      }

      return count;
   
   }
}

