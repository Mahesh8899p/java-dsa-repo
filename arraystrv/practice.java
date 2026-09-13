     package arraystrv;
     import java.util.HashMap;

     public class practice{
            public static int maxlen(int[] nums){
                int result = 0;
                int n = nums.length;
                int[] prefixsum = new int[n];
                prefixsum[0] = nums[0];
                for(int i = 1;i<n;i++){
                    prefixsum[i] = prefixsum[i-1] + nums[i];
                }
                HashMap<Integer,Integer> map = new HashMap<>();
                for(int i=0;i<n;i++){
                    if(prefixsum[i] == 0){
                        result =  Math.max(result,i+1);
                    }

                    int val = prefixsum[i];
                    if(map.containsKey(val)){
                         result = Math.max(result,i - map.get(val));
                    }

                    map.put(nums[i],i);
                }

                return result;
            }
          
          public static void main(String[] args){
               
          }
     }
     
          
     


          

          
          



