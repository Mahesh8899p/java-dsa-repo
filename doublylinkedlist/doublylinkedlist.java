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

public class doublylinkedlist{
    public static Node ArraytoDoublyLinkedList(int[] arr){
        Node head = new Node(arr[0]);
        Node prev = head;

        for(int i = 1; i<arr.length;i++){
            Node temp = new Node(arr[i],null,prev);
            prev.next = temp;
            prev = temp;
        }

        return head;
    }
}