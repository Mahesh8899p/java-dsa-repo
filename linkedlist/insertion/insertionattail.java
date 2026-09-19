package linkedliststrv.insertion;

class Node{
    int data;
    Node next;

    Node(int data, Node next){
        this.data= data;
        this.next = next;
    }

    Node(int data){
        this.data = data;
        this.next = null;
    }
}

public class insertionattail{
    public static Node insertionatend(Node head, int val){

        if(head == null){
            return new Node(val);
        }
        Node temp = head;
        while(temp.next != null){
            temp = temp.next;
        }

        Node newNode = new Node(val);
        temp.next = newNode;

        return head;
    }
}