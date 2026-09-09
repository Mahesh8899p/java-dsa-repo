package arraystrv.sortingalgo;
public class mergesort{
    public static void mergesort(int[] arr, int low, int high){
        if(low>=high){
            return;
        }
        int mid = low + (high - low) / 2;
        mergesort(arr, low, mid);
        mergesort(arr, mid+1,high);
        merge(arr,low,mid,high);    
    }

    public static void merge(int[] arr,int low, int mid, int high){
        int[] temp = new int[high - low + 1];
        int i = low;
        int j = mid + 1;
        int k = 0;
        while(i<= mid && j<= high){
            if(arr[i] <= arr[j]){
                temp[k] = arr[i];
                k++;
                i++;
            }
            else{
                temp[k] = arr[j];
                k++;
                j++;
                
            }
        } 
        
        while(i <= mid){
            temp[k] = arr[i];
                k++;
                i++;
        }

        while(j <= high){
            temp[k] = arr[j];
            k++;
            j++;
        }

        for(int m = 0;m<temp.length;m++){
              arr[low + m] = temp[m];
        }
    }
}
