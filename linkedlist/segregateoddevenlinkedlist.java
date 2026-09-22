package linkedlist;


public class segregateoddevenlinkedlist{
    public Node  oddEvenList(Node head){
        Node temp = head;
        Node odd = head;
        Node even = head.next;
        Node evenHead = even;
        while(even != null && even.next != null){
            odd = odd.next.next;
            even = even.next.next;

            odd = odd.next;
            even = even.next;
        }

        odd.next = evenHead;

        return head;

    }
}