package arrayeasy;
import java.util.HashMap;

/*
Approach:
- Keep track of the maximum and minimum product ending at the current index.
- Update them while iterating through the array.
- The maximum product so far is the best among these values.
*/

public class maximumsubarrayproduct{

    public static int maxProdut1(int[] nums){
        int maxsofar = nums[0];
        int minsofar = nums[0];
        int result = nums[0];
        int n = nums.length;
        for(int i =1;i<n;i++){
            int x = nums[i];
            if(x < 0){
                int temp = maxsofar;
                maxsofar = minsofar;
                minsofar = temp;
            }
            maxsofar = Integer.max(x,maxsofar * x);
            minsofar = Integer.min(x,minsofar * x);
            result = Integer.max(result,maxsofar);
        }
        return result;
    }
/*
Failed approach not using prefix multiplication 
 */
/*
    public static int maxProduct(int[] nums){
        int n = nums.length;
        int[] prefixproduct = new int[n];
        prefixproduct[0] = nums[0];
        for(int i =1;i<n;i++){
            prefixproduct[i] = prefixproduct[i-1] * nums[i];
        }

        /*
        [2,3,-2,4]
        prefixproduct = [2,6,-12,-48]
        now we have to make a map and fill them and compare

       int largest = prefixproduct[0];
       for(int j =1;j<n;j++){
        if(prefixproduct[j] > largest){
            largest = prefixproduct[j];
        }
       }
       return largest;
    }
*/
     
    public static void main(String[] args){

    }
}