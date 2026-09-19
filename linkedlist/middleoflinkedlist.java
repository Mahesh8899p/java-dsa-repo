package linkedlist;

class Node{
    int data;
    Node next;

    Node(int data, Node next){
        this.data = data;
        this.next = next;
    }

    Node(int data){
        this.data = data;
    }
}

public class middleoflinkedlist{
    //tortoise and hare method
    public static Node middleoflinkedlist(Node head){
        Node slow = head;
        Node fast = head;
        while(fast != null && fast.next != null){
              slow = slow.next;
              fast = fast.next.next;
        }
        return slow;
    }
    }
