package arraystrv;
import java.util.HashSet;

public class validsudoku {
    public boolean isValidSudoku(char[][] board){
        HashSet<String> seen = new HashSet<>();


        for(int i = 0;i<9;i++){
            for(int j =0;j<9;j++){
                char currentval = board[i][j];
                if(currentval != '.'){
                    if(!seen.add(currentval + "found in row " + i) ||
                    !seen.add(currentval + "found in column" + j) ||
                    !seen.add(currenval +  "found")){

                    }
                    
                }
            }
        }
    }
}
