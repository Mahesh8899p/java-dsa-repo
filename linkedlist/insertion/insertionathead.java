package linkedlist.insertion;

class Node{
    int data;
    Node next;

    Node(int data, Node next){
        this.data = data;
        this.next = next;
    }
    Node(int data){
        this.data =data;
        this.next = null;
    }
}

public class insertionathead{

    public static Node ArraytoLinkedList(int[] arr){
        Node head = new Node(arr[0]);
        Node mover = head;
        for(int i = 1;i<arr.length;i++){
            Node temp = new Node(arr[i]);
            mover.next = temp;
            mover = temp;
        }
        return head;
    }

    public static Node insertathead(Node head,int val){
        return new Node(val,head);
    }
}