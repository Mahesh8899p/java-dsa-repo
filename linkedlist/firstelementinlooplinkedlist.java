package linkedlist;
import java.util.HashMap;


public class firstelementinlooplinkedlist{
    public static void firstelementinloop(Node head){
        HashMap<Node,Boolean> map  = new HashMap<>();
        Node temp = head;
        while(temp !=null){

        }
    }

    public static Node firstelementinloop(Node head){
        Node temp = head;
        Node slow = head;
        Node fast = head;
        while(fast != null && fast.next != null){
            slow = slow.next;
            fast = fast.next.next;
            if(slow == fast){
                slow = head;
                while(slow != fast){
                    slow = slow.next;
                    fast = fast.next;
                }
                return slow;
            }
        }
        return null;    
    }
}