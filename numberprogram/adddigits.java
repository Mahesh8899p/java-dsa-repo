package numberprogram;

public class adddigits {
    public static void display(int num){
        if(num < 0){
            num = -num;
        }
        int sum = 0;

        while(num != 0){
            int digit = num % 10;
            sum = sum + digit;
            num = num / 10;
        }
    }
}
