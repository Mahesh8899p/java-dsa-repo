package arraystrv;

public class findmisingrepeatingnumber {
    public static long[] findMissingRepeatingNumbers(int[] nums){
          /*
          [3,5,4,1,1]
          output - [1,2]
          1->2
          2-> missing

          [3,5,4,1] 
          natural sum = n*(n+1)/2
          natural sum - sum = missing
          isme 2 number extra hai 
          jo number extra hai usko minus mardo
          */


          //brute force
          /*
          HashMap<Integer,Integer> map = new HashMap<>();
          int n = nums.length;
          int sum = 0;
          long naturalsum = n*(n+1)/2;
          int repeatednumber = 0;
          for(int i =0;i<n;i++){
               map.put(nums[i],map.getOrDefault(nums[i], 0)+1);

               sum+=nums[i];
               
          }
          for(int x : map.keySet()){
               if(map.get(x) > 1){
                    repeatednumber = x;
               }
          }
          
          
          long missingnumber = naturalsum - (sum - repeatednumber);

          return new long[]{repeatednumber,missingnumber};
          */

          //optimized approach

          //sum - naturalsum
          //sum^2 - naturalsum^2
          int n = nums.length;
          long s = (long)n*(n+1)/2;
          long sn = (long)(n*(n+1)) * (2*n+1)/6;
          long sum1 = 0;
          long sum2 = 0;
          for(int i =0;i<n;i++){
               sum1 += nums[i];
               sum2 += nums[i] * nums[i];
          } 

          long val1 = s - sum1; //x-y
          long val2 = sn - sum2; //x^2-y^2
          val2 = val2/val1;
          long x = val1+val2/2;
          long y = x - val1;

          return new long[]{x,y};


          
     }

     public static void main(String[] args){
          int[] nums = {3,5,4,1,1};
          
          long[] arr = findMissingRepeatingNumbers(nums);
          int n = arr.length;
          for(int i = 0;i<n;i++){
               System.out.println(arr[i]);
          }
     }

     
     
}
