package strings;
import java.util.HashMap;

public class firstnotrepeatingcharacter {
    public static void display(String name){
        HashMap<Character,Integer> map = new HashMap<>();
        int n = name.length();
        for(int i = 0;i < n; i++){
            char c = name.charAt(i);
            map.put(c,map.getOrDefault(c, 0)+1);
        }

        for(char num: map.keySet()){
            if(map.get(num) == 1){
                System.out.println(num);
            }
        }
        
    }
}
