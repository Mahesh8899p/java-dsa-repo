package linkedliststrv;

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

public class lengthoflinkedlist{

    public static Node arraytolinkedlist(int[] arr){
        int n = arr.length;
        Node head = new Node(arr[0]);
        Node mover = head;
        for(int i = 1;i<n;i++){
            Node temp = new Node(arr[i]);
            mover.next = temp;
            mover = temp;
        }

        return head;
    }

    public static int lengthofLinkedlist(Node head){
        int count = 0;
        Node temp = head;
        while(head != null){
            count++;
            head.next = head;
        }

        return count;
    }

    public static void main(String[] args){
        int[] arr = {1,2,3,4,5,6};
        Node head = arraytolinkedlist(arr);

        

    }
}