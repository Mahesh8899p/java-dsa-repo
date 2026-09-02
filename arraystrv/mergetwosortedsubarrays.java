package arraystrv;
import java.util.Arrays;

public class mergetwosortedsubarrays {

    public void merge(int[] nums1, int m , int[] nums2, int n){
        int left = nums1.length - 1;
        int right = 0;
        while(left >= 0 && right < nums2.length){
            if(nums1[left] > nums2[right]){
                int temp = nums1[left];
                nums1[left] = nums2[right];
                nums2[right] = temp;
                left--;
                right++;
            }
        }

        Arrays.sort(nums1);
        Arrays.sort(nums2);

    }
    
}
