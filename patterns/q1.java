package patterns;

public class q1 {
    public static void displaypattern(int n){
        for(int i =1;i<=n;i++){
            for(int j = 0;j<=n;j++){
                System.out.print(i+" ");
            }

            System.out.println();
        }
    }

    public static void main(String[] args){
        displaypattern(7);   
}
}


