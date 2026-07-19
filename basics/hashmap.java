package basics;
import java.lang.reflect.Method;
import java.util.HashMap;
public class hashmap {
    public static void main(String[] args){
        HashMap<Integer, String> hashmap = new HashMap<>();
        //store the key value pair
        hashmap.put(5,"mahesh");
        hashmap.put(6,"manu");

        HashMap<Integer, String> map = new HashMap<>();
         map.put(5, "mahesh");
         map.put(6, "manu");
         map.put(7, "raj");

         map.keySet();  // returns: {5, 6, 7}


        //get the value by key returns the value of the key which theer was at
        System.out.println(hashmap.get(5)); //returns the value "mahesh"
        hashmap.get(6); //returns the value "manu"

        //check if the key exists returns true or false
        System.out.println(hashmap.containsKey(5)); //true 
        hashmap.containsKey(6); //true

        //remove a key
        hashmap.remove(5);

        //size of the hashmap
        hashmap.size();

        //Method	Returns	Example
      map.keySet();	//All keys	{4, 1, 3}
      map.values();	//All values	{2, 2, 1}
      map.entrySet();	//All key-value pairs	{4=2, 1=2, 3=1}

    }
}
