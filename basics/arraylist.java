import java.util.ArrayList;
package basics;

public class arraylist {
    public static void main(String[] args) {
        //arraylist is a resizeable array which grows automatically when we add eleemnts in that
    // it is a part of the java utils pacakge
    ArrayList<Integer> list = new ArrayList<>();
    //syntax breakdown
    //ArrayList = the type a resizable array
    //<> = what value it holds <Integer>
    //list = its the variable name which we have choosen to declare our array list as
    //ArrayList<> - the actual object which is been created in the heap memeory
    //() -> the actual contructor call which is empty meaning start with no elemnts

    list.add(10);
    list.add(20);
    list.add(30);
    list.add(50);

    //access and modify
    list.get(0);
    list.set(0,89);

    }
    
}
