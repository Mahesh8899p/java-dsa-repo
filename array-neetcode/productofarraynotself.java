package arrayhashing;

public class productofarraynotself {
    public static void main(String[] args){
    }

    public int[] productExceptSelf(int[] nums) {
        int n = nums.length;
        int[] result = new int[n];
        result[0] = 1;
        //phase 1 fill the results
        //with the prefix products.
        for(int i = 1;i<nums.length;i++){
           result[i] = result[i-1] * nums[i-1];
            }

        //phase 2 fill the results with the suffix products.
        //multiply each by the suffix product(right to left)
        int suffix = 1;
        //we start suffix is 1 because for the last element rightmost there is nothing to its right 
        //multiplying it by 1 will leave it unchanged only
        for(int i = n-1;i>=0;i--){
            result[i] = result[i] * suffix;
            suffix = suffix * nums[i];

        }
        return result;
    }
}
