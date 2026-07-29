package clsquestions;


public class practice{
    public static void display(int n){
        int num = n;
        if(n<0){
            n = -n;
        }
        int rev = 0;
        while(n>0){
            rev = rev * 10 + n % 10;
            n = n/10;
        }
        if(num < 0){
            rev = -rev;
        }
    }
}