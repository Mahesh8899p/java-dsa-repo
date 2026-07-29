package arrayeasy;
import java.util.HashSet;

/*
Approach:
- Use a set to store unique values while iterating through the array.
- The set automatically removes duplicates.
- Return or process only the unique values.
*/

public class removeduplicatesfromarray{
    public static void main(String[] args){

    }


    public int removeDuplicates(int[] nums){
    //first approach
    //take a set
    //loop through the array and set the array element one by one in the set
    //now in the set there cant be duplicate elements so only unique elements will be there
    //there will be 2 passes here one for iterating through the array.
    //int n = nums.length();
    //Set<Integer> set = new HashSet<>();
    //for(int i  = 0; i < n; i++){
    //set.insert(nums[i]);
    //}



    //optimal approach - two pointers
    //put first pointer as i = 0
    //put second pointer as j =1
    //for(int j = 1; j<n;j++){
    //  if(arr[j] != arr[i]){
    //       arr[i+1] = arr[j];
    //        i++;
    //}
    //}
    // return i + 1;
    //}
    }
    
}