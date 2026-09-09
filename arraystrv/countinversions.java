package arraystrv;


/*
brute force appraoch where we apply two loops in order to find the inversions
*/
public class countinversions {
    public static int inversionCount(int[] arr) {
        int n = arr.length;
        int count = 0;
        for(int i =0;i<n;i++){
            for(int j = i+1;j<n;j++){
                if(arr[i] > arr[j]){
                    count++;
                }
            }
        }
        return count;
    }
    /*
    optimized solution
    */
    public static void mergesort(int[] arr, int low, int high){
        int mid = low + (high- low)/2;
        if(low >= high){
            return;
        }
        mergesort(arr, low, mid);
        mergesort(arr,mid+1, high);
        merge(arr,low,mid,high);
    }

    public static int merge(int[] arr, int low, int mid , int high){
        int i = low;
        int j = mid+1;
        int[] temp = new int[high - low];
        int count = 0;
        int k =0;
        while(i<= mid && j<= high){
            if(arr[i] <= arr[j]){
                temp[k] = arr[i];
                i++;
                k++;
            }
        
            else{
                temp[k] = arr[j];
                j++;
                k++;
                count += (mid - i + 1);
            }
        }
            while(i<=mid){
                temp[k] = arr[i];
                i++;
                k++;
            }
            while(j<=high){
                temp[k] = arr[j];
                j++;
                k++;
            }

            for(int m =0;m<temp.length;m++){
                arr[low + m] = temp[m];
            }

            return count;
        }
    
    

    public static void main(String[] args){
        int[] arr = {2,4,1,3,5};
        

    }
}
