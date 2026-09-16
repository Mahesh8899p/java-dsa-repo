package strings;

public class pallindromeString{
    //aproach two pointers
    public static boolean pallindromecheck(String s){
//if number is given instead of the string we will do  String s = String.valueOf(num); then check
        int j = s.length() - 1;
        for(int i = 0;i<s.length();i++){
            if(s.charAt(i) != s.charAt(j)){
                return false;
            }
            i++;
            j--;
        }
        return true;
    }
}