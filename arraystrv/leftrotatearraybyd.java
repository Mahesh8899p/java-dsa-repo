package arrayeasy;

/*
Approach:
- Reduce the rotation count using d % n.
- Rotate the array left by that many positions.
- Use a temporary array or index-based logic to place elements in the correct order.
*/

public class leftrotatearraybyd {
    //brute approach
    //here d is the number of the time we wanna rotate the array
    //we have to left rotate by d
    //d = d % n where n is the length of the array
    //imagine if the d is 7 and the length of the array is 7 so array will be rotated and bring back to the same state
    /*
    [1,2,3,4,5,6]
    d = 3

    [1,2,3,4,5,6]
           i=3
           if we do i-d = 3-3 = 0
           this arr[3]/arr[i] -> arr[i-d]/arr[0]
    [1,2,3,4,5,6]
             i=4
           if we do i-d = 4-3=1
           arr[4]/arr[i] -> arr[i-d]/arr[1]
    [1,2,3,4,5,6]
               i=5
            if we do i-d = 5-3=2
            arr[5]/arr[i] -> arr[i-d]/arr[2]


    */
   static void reverse(int[] arr, int start , int end){
    while(start < end){
        int temp  = arr[start];
        arr[start] = arr[end];
        arr[end] = temp;
        start++;
        end--;
    }
   }

   void leftrotatearraybyd(int arr[], int d){
    int n = arr.length;
    d = d % n;
    reverse(arr , 0 , d-1);
    reverse(arr, d , n-1);
    reverse(arr , 0 ,n-1);

   }
}
