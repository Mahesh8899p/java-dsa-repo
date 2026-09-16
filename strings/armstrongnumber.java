public class armstrongnumber{
    public static void checkarmstrong(int num){
        int length = String.valueOf(num).length();
        int originalnumber = num;
        int sum = 0;
        int temp = num;

        while(temp != 0){
            int digit = temp % 10;
            sum += Math.pow(digit, length);
            digit /= 10;
        }

    }
}