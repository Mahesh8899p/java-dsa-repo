package strings;
//reverse string code
public class reversethestring {
    public static void reverse(String s){
        int n = s.length();
        String rev = " ";
        for(int i = 0;i<n;i++){
            rev = s.charAt(i) + rev;
        }

        System.out.println(rev);
    }

    public static void main(String[] args) {
        reverse("mahesh");
    }
}
