package basics;
import java.util.HashMap;
public class hashmap {

    /*
    hashmap -> part of collections jisme key value pair hote hai

    key1 -> value1
    key2 -> value 2
    key3 -> value3
    [1,2,3,4,5,6] -> seat no
    1 -> "mahesh"
    2 -> "aryan"
    3 -> "bablu"
    4 -> "babli"
    5 -> "ganchakkar singh"

    Map is an interface 
    HashMap imeplements Map

    HashMap<Integer,String> map = new HashMap<>();
    Map<Integer,String> map = new HashMap<>();

    "mahesh" -> 1
    "aryan" -> 2
    HashMap<String,Integer> map = new HashMap<>();

    key-> value
    HashMap<key(type),value(type)> naam = new HashMap<>();

    
    
    */
    public static void main(String[] args){
        HashMap<Integer, String> hashmap = new HashMap<>();
        //store the key value pair
        hashmap.put(5,"mahesh");
        hashmap.put(6,"manu");
        hashmap.put(9,"shreya");

        //System.out.println(hashmap.get(5));
        //System.out.println(hashmap.get(6));
       // System.out.println(hashmap.get(9));

        //raw declaration
        /*
        HashMap shreyakakurafatimind = new HashMap<>();
        shreyakakurafatimind.put("mahesh","kiss");
        shreyakakurafatimind.put("job",52000);
        shreyakakurafatimind.put("home","tikkar");
        shreyakakurafatimind.put(2026,6000);
        
        */

        
         HashMap<Integer, String> map = new HashMap<>();
          map.put(5, "mahesh");
          map.put(6, "manu");
          map.put(7, "raj");

          //System.out.println(map.keySet());  // returns: {5, 6, 7}


        //get the value by key returns the value of the key which theer was at
      //  System.out.println(hashmap.get(5)); //returns the value "mahesh"
       // hashmap.get(6); //returns the value "manu"

        //check if the key exists returns true or false
      // System.out.println(hashmap.containsKey(100)); //true //returns boolean value
        //hashmap.containsKey(6); //true

        //remove a key
        //hashmap.remove(5);

        //size of the hashmap
        //System.out.println(hashmap.size());

        //Method	Returns	Example
      //map.keySet();	//All keys	{4, 1, 3}
      //System.out.println(map.values());	//All values	{2, 2, 1}
      //System.out.println(map.entrySet());	//All key-value pairs	{4=2, 1=2, 3=1}

      //[1,1,2,2,3,3,4,4,5,5,6,6] ARRAY -> nums[];
      //map1 [1->2,2->2,3->2,4->2,5->2,6->2];

      //two sum

      //[2,7,11,15]

      //7+2 = 9

      //target = 9

      //return an array of two numbers index
      //[0,1]

      //solution
      /*
      hashmap map2
      target = 9
      array loop lagayenge
      int compliment = target - nums[i];
      9 -2 = 7
      compliment = 7
      7 hai map2 mien? nhi hai toh hum nums[i] put in map
      
      */
      

    }
}
