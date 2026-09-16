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

public class LinkedList{
    public static void main(String[] args){
        int[] arr = {2,4,6,8};
        Node y = new Node(arr[0]);
    }
}