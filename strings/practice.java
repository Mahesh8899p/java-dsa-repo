

public class practice{
      public static void reversethestring(String s){
        int n = s.length();
        String res = " "; 
        for(int i =0;i<n;i++){
            res = s.charAt(i) + res;
        }

        System.out.println(res);
      }
}