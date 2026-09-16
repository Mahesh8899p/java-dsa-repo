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
    }
}

public class deletionoftail{

    public static Node ArrayTolinkedList(int[] arr){
        Node head = new Node(arr[0]);
        Node mover = head;
        for(int i = 1;i<arr.length;i++){
            Node temp = new Node(arr[i]);
            mover.next = temp;
            mover = temp;
        }
        return head;
    }

    public static Node deletionoftail(Node head){
            if(head == null || head.next == null){
                return null;
            }
            Node temp = head;
            while(temp.next.next != null){
                temp = temp.next;
            }
            temp.next = null;
            return head;
    }


    public static void main(String[] args){

    }
}