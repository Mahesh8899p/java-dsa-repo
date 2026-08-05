package strings;

import java.util.HashMap;

public class frequencyofeachcharacter {
    public static void frequencychar(String s){
HashMap<Character, Integer> freq = new HashMap<>();

    for (int i = 0; i < s.length(); i++) {
        char c = s.charAt(i);
        freq.put(c, freq.getOrDefault(c, 0) + 1);
    }

    for (char key : freq.keySet()) {
        System.out.println(key + " -> " + freq.get(key));
    }
    }
}
