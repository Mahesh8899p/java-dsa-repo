package arraystrv;
/*
Approach:
- This file is for practice and simple testing.
- Add small experiments here to understand Java basics and array operations.
*/

public class practice {
    public static void setZeroes(int[][] matrix){
        boolean firstrow = false;
        boolean firstcol = false;

        //marking out the first row/column

        for(int i = 0;i<matrix.length;i++){
            for(int j = 0;i<matrix[0].length;j++){
                if(matrix[i][j] == 0){
                    if(i == 0){
                        firstrow = true;
                    }
                    if(j == 0){
                        firstcol = true;
                    }
                    matrix[0][j] = 0;
                    matrix[i][0] = 0;
                }
            }
        }

        //zeroing out the inner matrix based on the matrix
        for(int i = 1; i<matrix.length;i++){
            for(int j = 1;j<matrix[0].length;j++){
                  if(matrix[i][0] == 0 || matrix[0][j] == 0){
                    matrix[i][j] = 0;
                  }
            }
        }


        //zeroing out the cols
        if(firstrow == true){
            for(int j = 0;j<matrix[0].length;j++){
                matrix[0][j] = 0;
            }
        }
        //zeroing out of the rows
        if(firstcol == true){
            for(int i = 0;i<matrix.length;i++){
                matrix[i][0] == 0;
            }
        }
    }
}


