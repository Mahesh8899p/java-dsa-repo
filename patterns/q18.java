package patterns;

public class q18 {
       public static void displaypattern(int n){
        
        int patternSize = 1;
        
            for(int i =1;i<=n;i++){
            for(int j =1;j<=patternSize;j++){
                 System.out.print(j+" ");
            }
            System.out.println();
            patternSize++;
        }
        
        
    }

    public static void main(String[] args){
        displaypattern(7);   
}
}
