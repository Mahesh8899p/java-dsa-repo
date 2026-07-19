package techniques;
import java.util.Arrays;


public class prefixs {
    public static void main(String[] args) {
        int[] arr = {10, 20, 10, 5, 15};
        int n = arr.length;

        //precomputing the prefix sum array
        int[] prefixSum = new int[n];
        prefixSum[0] = arr[0];
        for(int i =1; i<n-1;i++){
            prefixSum[i] = prefixSum[i-1] + arr[i];
        }
    }
}
