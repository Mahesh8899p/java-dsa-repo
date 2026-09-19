package linkedlist;
import java.util.HashMap;


public class detectloopinlinkedlist{
    //brute force 
    public static boolean detectLoopinLinkedList(Node head){
        HashMap<Node,Boolean> visited = new HashMap<>();
        
        Node temp = head;
        while(temp != null){
            if(visited.containsKey(temp)){
                return true;
            }

            visited.put(temp, true);
            head = head.next;
        }
        return false;
    }

    public static boolean detectloopinlinkedlist(Node head){
        //optimized way to solve the question
        Node slow = head;
        Node fast = head;
        while(fast != null && fast.next != null){
            slow = slow.next;
            fast = fast.next.next;

            if(slow == fast){
                return true;
            }
        }

        return false;
    }
}