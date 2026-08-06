package numberprogram;
public class pallindrome {
    public static void display(int num){
        int original = num;
        int reversed = 0;
        if(num < 0){
            num = -num;
        }
        while(num != 0){
            int digit = num %10;
            reversed = reversed * 10 + digit;
            num = num / 10;
        }

        if(original == reversed){
            System.out.println("pallindrome");
        }
    }
}