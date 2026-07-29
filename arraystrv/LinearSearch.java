package arrayeasy;

/*
Approach:
- Iterate through the array from start to end.
- Compare each element with the target.
- Return the index as soon as the match is found.
*/

public class LinearSearch {
    public int linearSearch(int nums[], int target){
        for(int i =0;i<nums.length;i++){
            if(nums[i] == target){
                return i;
            }
        }
        return -1;
    }
}
