package arraystrv;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
public class practice{
      public void setZeroes(int[][]matrix){
         //setting the outside columns as zero
         int n = matrix.length;
         for(int i = 0;i<matrix.length;i++){
            for(int j = 0; j<matrix[0].length;j++){
               if(matrix[i][j] == 0){
                    matrix[i][0] = 0;
                    matrix[0][j] = 0;
               }
            }
         }
      }
}

