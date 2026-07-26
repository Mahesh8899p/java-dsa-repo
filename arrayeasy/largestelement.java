package arrayeasy;
public class largestelement{
    //[1,5,8,9,10,3,2]
    public static int findLargestElement(int[] arr, int n){
        int max = arr[0];
        for(int i = 0;i<n;i++){
            if(arr[i] > max){
                max = arr[i];
            }
        }
        return max;
    }
}