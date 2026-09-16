package linkedliststrv.deletion;

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


public class deletionofelement{
    public static Node Deletionofelement(Node head, int el){
        if(head == null ){
            return null;
        }

        Node temp = head;
        Node prev = null;
        while(temp != null){
            if(temp.data == el){
                prev.next = prev.next.next;
                break;
            }
        prev = temp;
        temp = temp.next;
        }
        


        return head;
    }
    
}