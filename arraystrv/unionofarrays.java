package arrayeasy;
import java.util.ArrayList;

/*
Approach:
- Merge the two arrays and store unique values in a list.
- Return the combined unique elements.
*/

public class unionofarrays {
    public int[] unionArray(int[] nums1, int[] nums2){
         
        int n1 = nums1.length;
        int n2 = nums2.length;
        int[] union = new int[n1+n2];
        int i = 0;
        int k = 0;
        int j = 0;
        while(i<n1 && j<n2){
            if(nums1[i] <= nums2[j]){
                if(k == 0 || union[k-1] != nums1[i]){
                    union[k] = nums1[i];
                    k++;
                }
                i++;
                }
                else{
                    if(nums2[j] <= nums1[i]){
                        if(k == 0 || union[k-1] != nums2[j]){
                            union[k] = nums2[j];
                            k++;
                        }
                        j++;
                    }
                }
            }
            while(i<n1){
                 if(nums1[i] <= nums2[j]){
                if(k == 0 || union[k-1] != nums1[i]){
                    union[k] = nums1[i];
                    k++;
                }
                i++;
            }
            while(j<n2){
                if(nums2[j] <= nums1[i]){
                        if(k == 0 || union[k-1] != nums2[j]){
                            union[k] = nums2[j];
                            k++;
                        }
                        j++;
                    }
            }
        }
        return union;
    }
}