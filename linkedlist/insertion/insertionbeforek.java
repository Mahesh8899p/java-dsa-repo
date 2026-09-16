package linkedliststrv.insertion;

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

public class insertionbeforek{
    public static Node insertionbeforeK(Node head, int el, int k){
        if(head == null){
            if(k == 1){
                return new Node(el);
            }
            else{
                return null;
            }
        }
        if(k == 1){
            Node temp = new Node(el,head);
            return temp;
        }
        int count = 0;
        Node temp = head;
        while(temp != null){
            count++;
            if(count == k-1){
                Node newnode = new Node(el);
                newnode.next = temp.next;
                temp.next = newnode; 

                return head;
            }

            temp = temp.next;
        }
        return head;
    }
}