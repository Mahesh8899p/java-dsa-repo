package patterns;

public class q4 {
     public static void displaypattern(int n){
        for(int i =1;i<=n;i++){
            for(int j =1;j<=n;j++){
                System.out.print(j%2+" ");
            }
            System.out.println();
        }
    }

    public static void main(String[] args){
        displaypattern(7);   
}
}
