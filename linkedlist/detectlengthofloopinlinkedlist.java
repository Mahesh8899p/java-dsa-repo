package linkedlist;


public class detectlengthofloopinlinkedlist{
    public static int detectlengthoflooplinkedlist(Node head){
         Node slow = head;
         Node fast = head;

         while(fast != null && fast.next != null){
            slow = slow.next;
            fast = fast.next.next;
            if(slow == fast){
                Node temp = slow.next;
                int count = 1;
                while(temp != fast){
                    temp = temp.next;
                    count++;
                }
                return count;
            }
         }
         
    }
}