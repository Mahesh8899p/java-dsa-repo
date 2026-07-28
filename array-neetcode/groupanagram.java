package arrayhashing;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;


public class groupanagram {

    public static List<List<String>> groupAnagrams(String[] strs){
        //input - > strs = ["eat","tea","tan","tea","ate","nat","bat"]
        //output -> [["bat"],["nat","tan"],["ate","eat","tea"]]
    //start by making a hashmap where the key is the sorted string value and value is the list of words associated with it
    HashMap<String,List<String>> map = new HashMap<>();

    for(String s : strs){
        //looping through every element in the array of strings
        // ["eat","tea","tan","ate","nat","bat"]
        //   s -> eat now  
    char[] arr = s.toCharArray();
    //"eat" -> ["e","a","t"]
    Arrays.sort(arr);
    //sorting of this array we will do 
    //["a","e","t"]
    String sh = new String(arr);
    //
    if(!map.containsKey(sh)){
        map.put(sh,new ArrayList<>());
    }
    map.get(sh).add(s);
    } 
return new ArrayList<>(map.values());

    
    }
    public static void main(String[] args) {
        
    }
}
