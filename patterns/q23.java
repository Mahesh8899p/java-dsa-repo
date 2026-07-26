package patterns;

public class q23 {
    public static void displaypattern(int n){
        
        int patternSize = 1;
        int counter = n* (n+1)/2;
        
            for(int i =1;i<=n;i++){
            for(int j =1;j<=patternSize;j++){
                
                 System.out.print(counter+" ");
                 counter--; 
            }
            System.out.println();
            patternSize++;
        }
        
        
    }

    public static void main(String[] args){
        displaypattern(5);   
}
}
