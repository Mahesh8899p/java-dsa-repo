package strings;
import java.util.HashMap;

public class anagramcheckstring {
    public static boolean isAnagram(String a, String b){
        int n = a.length();
        int n2 = b.length();
        if(n != n2){
            return false;
        }
        HashMap<Character,Integer> map = new HashMap<>();
        for(int i =0;i<n;i++){
            char c = a.charAt(i);
            map.put(c,map.getOrDefault(c, 0)+1);
        }
        for(int i =0;i<n2;i++){
            char c2 = b.charAt(i);
            map.put(c2,map.getOrDefault(c2, 0)-1);
        }

        for(int value: map.values()){
            if(value == 0){
                return true;
            }
        }
        return false;
    }
}
