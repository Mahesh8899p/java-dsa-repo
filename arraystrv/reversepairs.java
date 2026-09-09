package arraystrv;

public class reversepairs {
    public static int reversepairs(int[] nums){
        int n = nums.length;
        int count = 0;

        for(int i = 0;i<n;i++){
            for(int j = i+1;j<n;j++){
                if(i<j && nums[i] > 2 * nums[j]){
                    count++;

                }
            }
        }

        return count;
    }

    public static void main(String[] args){
        int[] arr = {1,3,2,3,1};
        System.out.println(reversepairs(arr));
    }
}
