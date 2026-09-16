package doublylinkedlist.deletionoftail;

class Node{
    int data;
    Node next;
    Node back;

    Node(int data, Node next, Node back){
        this.data = data;
        this.next = next;
        this.back = back;
    }

    Node(int data){
        this.data = data;
        this.next = null;
        this.back = null;
    }
}


public class deletionoftail{
    public static Node deletionoftail(Node head){
        if(head == null || head.next == null){
            return null;
        }

        Node tail = head;
        while(tail.next != null){
            tail = tail.next;
        }

        Node newTail = tail.back;
        newTail.next = null;
        tail.back = null;

        return head;
    }
}