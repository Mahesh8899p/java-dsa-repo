package numberprogram;

public class maximumproduct {
    public static void display(int num){
        if(num < 0){
            num = -num;
        }
        int largest = -1;

        int secondlargest = -1;

        while(num != 0){
            int digit = num % 10;
            if(digit > largest){
                secondlargest = largest;
                largest = digit;
            }
            else if(digit > secondlargest && digit != largest){
                secondlargest = digit;
            }

            digit = digit / 10;
        }

        int maximumproduct = largest * secondlargest;

        System.out.println(maximumproduct);
    }
}
