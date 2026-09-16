package doublylinkedlist;
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

public class deletionofhead{
    public static Node Deletionofhead(Node head){
        Node prev = head;

        head = head.next;
        head.back = null;
        prev.next = null;

        
        return  head;
    }
    
}
