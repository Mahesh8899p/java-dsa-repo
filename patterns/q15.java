package patterns;

public class q15 {
     public static void displaypattern(int n){
        int space = 0;
        int patternSize = n;
        
            for(int i =1;i<=n;i++){
            for(int s =1;s<=space;s++){
                System.out.print("  ");
            }
            for(int j =1;j<=patternSize;j++){
                 System.out.print("* ");
            }
            System.out.println();
            patternSize--;
            space++;

        }
    }

    public static void main(String[] args){
        displaypattern(7);   
}
}
