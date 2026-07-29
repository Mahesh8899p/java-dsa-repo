package arrayeasy;

public class leftrotatearrayby1 {
    /*
     approach
    input = [1,2,3,4,5]
    rotate by 1
    output = [2,3,4,5,1]
    first store the first element of the array in the temp variable 
    temp = arr[0];
    for(int i = 1; i<n;i++)
{
    arr[i-1] = arr[i];
    }
    arr[n-1] = temp;    
    */

    public void rotateArrayByOne(int[] nums){
        int temp = nums[0];
        int n = nums.length;
        for(int i =1;i<nums.length;i++){
            nums[i] = nums[i-1];
        }
        nums[n-1] = temp;

    }
}
