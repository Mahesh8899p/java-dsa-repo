package arraystrv;

public class setmatrixzero{
    public void setZeroes(int[][] matrix){
        boolean firstrow = false;
        boolean firstcol = false;

       //set the markers for the first row and first column
        for(int i = 0;i<matrix.length;i++){
            for(int j = 0;j<matrix[0].length;j++){
                if(matrix[i][j] == 0){
                    if(i == 0){
                        firstrow = true;
                    }
                    if(j == 0){
                        firstcol = true;
                    }
                    matrix[i][0] = 0;
                    matrix[0][i] = 0;
                }
            }
        }
        //replace the inner matrix
        for(int i =0; i<matrix.length;i++){
            for(int j =0; j<matrix[0].length;j++){
                if(matrix[i][0] == 0 || matrix[0][j] == 0){
                    matrix[i][j] = 0;
                }
            }
        }
        

        //replace the remaining blocks
        if(firstrow == true){
            for(int j =0;j<matrix[0].length;j++){
                 matrix[0][j] = 0;
            }
        }

        //replace the remaining blocks
        if(firstcol == true){
            for(int i =0; i<matrix.length;i++){
                matrix[i][0] = 0;
            }
        }


    }
}