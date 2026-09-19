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
        this.next = null;
    }
}

public class reverselinkedlist{
    public static Node reverselinkedlist(Node head){
          if(head == null || head.next == null){
            return head;
          }

          Node newHead = reverselinkedlist(head.next);
          Node front = head.next;
          front.next = head;
          head.next = null;
          return newHead;
    }
}