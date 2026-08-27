package arraystrv;

public class rotatearrayby90 {
    /*

    1,2,3
    4,5,6
    7,8,9
      |
      |transpose
      |
    1,4,7
    2,5,8
    3,6,9
      |
      |reverse
      |
    7,4,1
    8,5,2
    9,6,3


    
    */

    public static void swap(int[] nums){
        int n = nums.length;
        int i = 0;
        int j = n -1;
        while(i<=j){
            int temp = nums[i];
            nums[i] = nums[j];
            nums[j] = temp;
            i++;
            j--;
        }
    }

    public void rotate(int[][] matrix){
        int n = matrix.length;
        //transpose 
        for(int i = 0; i<n;i++){
            for(int j = i+1;j<n;j++){
                int temp = matrix[i][j];
                matrix[i][j] = matrix[j][i];
                matrix[j][i] = temp;
            }

        }
       

        //reverse
        for(int i = 0;i<matrix.length;i++){
             swap(matrix[i]);
        }


    }
}
