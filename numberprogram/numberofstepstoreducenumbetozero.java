package numberprogram;

public class numberofstepstoreducenumbetozero {
    public static void display(int number){
        int steps = 0;
        int original = number;
        while(number != 0){
             
             if(number % 2 == 0){
                number  = number / 2;
             }
             else{
                number = number - 1;
             }
             steps++;
        }
    }
}
