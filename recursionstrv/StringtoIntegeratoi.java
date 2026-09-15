package recursionstrv;

public class StringtoIntegeratoi{
    public static int StringtoInteger(String input, int last){
        if(last == 0){
            return input.charAt(0) - '0';
        }

        int smallnum = StringtoInteger(input, last - 1);
        int currentNumber = input.charAt(last) - '0';

        return smallnum * 10 + currentNumber;
    }
}