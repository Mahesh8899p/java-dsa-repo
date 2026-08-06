package numberprogram;
public class reversenumber {
    public static void reversenumber(int num){
        int reversed = 0;
        int original = num;

        boolean isNegative = true;

        if(isNegative == true){
            num = -num;
        }

        while(num!=0){
            int digit = num %10;
            reversed = reversed * 10 + digit;
            num = num / 10;
        }
        if(isNegative == true){
            reversed = -reversed;
        }
        
    }
}
