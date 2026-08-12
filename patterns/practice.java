package patterns;

public class practice {
    public static void displaypattern(int n){
        int patternsize = 1;
        int mid = n/2;
       for(int i =0;i<=n;i++){
          for(int j = 0; j<=patternsize ; j++){
           System.out.println("*  ");
          }
          if(i < mid){
            patternsize++;
          }
          else{
            patternsize--;
          }
          
          System.out.println();
       }
    }

    public static void main(String[] args) {
        displaypattern(7);
    }
} 
