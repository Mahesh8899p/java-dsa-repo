package arraystrv;

/*
Approach:
- Track the largest and second-largest values while scanning the array.
- Update them according to the current element.
- Return the second-largest value at the end.
*/

public class secondlargestelement {
    public int secondLargestElement(int[] nums){
        //brute force
        //nums = [8,8,7,6,5]
        //if we sort this -> 5,6,7,8,8 -> then if n = length of the array
        // then arr[n-1]-> this will be the largest element 
        //we can loop from arr[n-2] to the starting of the array to find the second largest element
        //for(int i = n-2 ; i>=0;i--){
        // if(arr[n-2] != arr[n-1]){
        //  secondlargest = arr[n-2]
        //}
        //}

        //better approach

        //optimal approach
        //nums = [8,8,7,6,5]
        //nums[i] = largest 
        //-1 = secondlargest
        //nowntraverse the array 
        //n = length of the array
        //for(int i = 1; i<=n;i++){
        //   if(nums[i] > largest ){
        //           secondlargest = largest;
        //           largest = nums[i];       
        //}
        //   else if(nums[i] > secondlargest && nums[i] != largest){
        //           secondlargest = nums[i];
      //  }
        //return secondlargest;
        //}
        int largest = nums[0];
        int secondlargest = -1;
        int n = nums.length;
        for(int i = 0; i<n;i++){
            if(nums[i] >largest){
                secondlargest = largest;
                largest = nums[i];
            }
            else if(nums[i] > secondlargest && nums[i] != largest){
                secondlargest = nums[i];
            }

            return secondlargest;
        }

    
    }
}
