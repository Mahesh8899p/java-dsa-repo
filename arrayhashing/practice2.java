import java.util.List;
import java.util.HashMap;
import java.util.ArrayList;


public class practice2 {
    public static void main(String[] args) {
        
    }

    public String encode(List<String> strs){
        //strs = ["Hello","World"]
        //to encode this we will first do "5#Hello5#World"

        StringBuilder sb = new StringBuilder();
        for(String s : strs){
             sb.append(s.length()).append('#').append(s);
        }
        return sb.toString();
        
    }

    public List<String> decode(String str){
        

    }
}

