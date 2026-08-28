package arraystrv;
import java.util.ArrayList;
import java.util.List;
public class practice{
      public List<Integer> spiralOrder(int[][] matrix){
       int rowbegin = 0;
       int rowend = matrix.length-1;
       int colstart = 0;
       int colend = matrix[0].length-1;
       int n = matrix.length;
       ArrayList<Integer> list = new ArrayList<>();


       while(rowbegin <= rowend && colstart <= colend){

            //print the first row from left to right
       for(int j = colstart;j<=colend;j++){
            list.add(matrix[rowbegin][j]);
       } 
       rowbegin++;
       

       //print from top to bottom
       for(int i = rowbegin; i<=rowend;i++){
            list.add(matrix[i][colend]);
       }
       colend--;

       //print from right to left
       if(rowbegin <= rowend){
            for(int i = colend;i>=colstart;i--){
                  list.add(matrix[rowend][i]);
            }
            rowend--;
       }
       

       //print from top to bottom

       if(colstart <= colend){
            for(int i= rowend;i>=rowbegin;i--){
                  list.add(matrix[i][colstart]);
            }
            colstart++;
       }         

      }
      return list;
}
}  


