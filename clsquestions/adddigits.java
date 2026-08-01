package clsquestions;
//what happens when we number % 9
// we can solve this using this using this ternary operator

public class adddigits {
    public static int displaysum(int n){
        return n == 0 ? 0 : (n % 9 == 0 ? 9 : n % 9);
    }
}

