package linkedlist;

public class removethemiddlenodelinkedlist{
    public static Node deleteMiddle(Node head){
        Node fast = head;
        Node slow = head;
        fast = fast.next.next;
        while(fast != null || fast.next != null){
            slow = slow.next;
            fast = fast.next.next;
        }

        slow.next = slow.next.next;
        return head;
    }
}