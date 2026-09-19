class Node{
    int data;
    Node next;

    Node(int data, Node next){
        this.data = data;
        this.next = next;
    }

    Node(int data){
        this.data = data;
        this.next = null;
    }
}

public class reverselinkedlistiterative{
    public static Node reverselinkedlist(Node head){
        Node temp = head;
        Node prev = null;
    while(temp != null){
        Node front = temp.next;
        temp.next = prev;
        temp = front;
        prev = temp;
    }
    return head;
    }
    }

    public static void main(String[] args){

    }
