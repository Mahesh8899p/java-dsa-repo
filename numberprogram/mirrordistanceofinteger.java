package numberprogram;

public class mirrordistanceofinteger {
    public static int mirror(int num){
        //mirror distance if the absolute difference between the orignal number and reverse

        int original = num;
        int reversed = 0;
        
        boolean isNegative = num < 0;
        if(isNegative){
            num = -num;
        }
        while(num != 0){
            int digit = num % 10;
            reversed = reversed * 10 + digit;
            num = num /10;
        }
        if(isNegative){
            reversed = -reversed;
        }



        int mirrordistance = original - reversed;
        return mirrordistance;


    }
}
