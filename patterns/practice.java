package patterns;

public class practice {
    public static void displaypattern(int n){
        int space = n-1;
     
        
            for(int i =1;i<=n;i++){
                   int patternSize = 2 * i - 1;
            for(int s =1;s<=space;s++){
                System.out.print("  ");
            }
            for(int j =1;j<=patternSize;j++){
                 System.out.print("* ");
            }
            System.out.println();
            patternSize++;
            space--;

        }
    }

    public static void main(String[] args){
        displaypattern(7);   
}
}
