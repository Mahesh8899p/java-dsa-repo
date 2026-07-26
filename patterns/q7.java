package patterns;

public class q7 {
     public static void displaypattern(int n){
        for(int i =1;i<=n;i++){
            for(int j =1;j<=n;j++){
                System.out.print("(" + i + "," + j + ")\t");
            }
            System.out.println();
        }
    }

    public static void main(String[] args){
        displaypattern(7);   
}
}
