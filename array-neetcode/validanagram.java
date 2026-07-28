package validanagram;
import java.util.HashMap;

public class validanagram {
    public boolean isAnagram(String s, String t) {
        HashMap<Character,Integer> map = new HashMap<>();
        for(int i =0;i<s.length();i++){
            char c = s.charAt(i);
            map.put(c,map.getOrDefault(c,0)+1);
        }
        for(int i = 0;i < t.length(); i++){
            char b = t.charAt(i);
            map.put(b,map.getOrDefault(b,0)-1);
        }
        for(int num : map.values()){
            if(num != 0){
                return false;
            }
        }
        return true;
    }
    
    }
