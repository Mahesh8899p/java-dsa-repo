package patterns;

public class q2  {
    public static void displaypattern(int n){
        for(int i =1;i<=n;i++){
            for(int j = 0;j<=n;j++){
                System.out.print(i%2+" ");
            }

            System.out.println();
        }
    }

    public static void main(String[] args){
        displaypattern(7);   
}
}


