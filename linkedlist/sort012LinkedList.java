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

public class sort012LinkedList{
    public Node sortList(Node head){
        Node ZeroHead = new Node(-1);
        Node OneHead = new Node(-1);
        Node TwoHead = new Node(-1);


        Node zero = ZeroHead;
        Node one = OneHead;
        Node two = TwoHead;
        
        Node temp = head;

        while(temp != null){
            if(temp.data == 0){
                zero.next = temp;
                zero = zero.next;
            }

            else if(temp.data == 1){
                one.next = temp;
            }
        }
    }
}