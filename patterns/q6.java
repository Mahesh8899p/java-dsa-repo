package patterns;

public class q6 {
     public static void displaypattern(int n){
        for(int i =1;i<=n;i++){
            for(int j =1;j<=n;j++){
                if(i == 1 || i == n || j ==1 || j ==n || i == 2 || i == n-1 || j ==2 || j ==n-1){
                    System.out.print("* ");
                }
                else{
                    System.out.print("  ");
                }
            }
            System.out.println();
        }
    }

    public static void main(String[] args){
        displaypattern(7);   
}
}