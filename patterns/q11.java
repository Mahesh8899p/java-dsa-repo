package patterns;

public class q11 {
     public static void displaypattern(int n){
        int mid = n/2+1;
        if(mid%2 == 0){
        System.out.println("We cant print the pattern ");
        }
        
            for(int i =1;i<=n;i++){
            for(int j =1;j<=n;j++){
             if((i == 1 && j > mid) || (j == mid && i > mid) || (i == n && j < mid) || (j == 1 && i < mid)){
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
