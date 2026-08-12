package arraystrv;
import java.util.ArrayList;
import java.util.List;
class spiralmatrix {
    public List<Integer> spiralOrder(int[][] matrix) {
        int colbegin = 0;
        int colend = matrix[0].length - 1;
        int rowbegin = 0;
        int rowend = matrix.length - 1;
        List<Integer> list = new ArrayList<>();
        while(colbegin <= colend && rowbegin <= rowend){

            //traverse left to right
            for(int j = colbegin;j<=colend;j++){
                list.add(matrix[rowbegin][j]);
            }
            rowbegin++;

            //traverse top to bottom
            for(int i = rowbegin;i<=rowend;i++){
                list.add(matrix[i][colend]);
            }
            colend--;

            //traverse right to left
            if(rowbegin <=rowend){
                for(int j = colend;j>=colbegin;j--){
                list.add(matrix[rowend][j]);
                 
            }
            }
            rowend--;
            //traverse bottom to top
            if(colbegin <= colend){
                for(int i = rowend;i>=rowbegin;i--){
                list.add(matrix[i][colbegin]);
            }
           
            }
             colbegin++;
            
        }
        return list;
    }
}