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

public class deletionofhead {

    public static Node ArrayToLinkedList(int[] arr){
        
        Node head = new Node(arr[0]);
        Node mover = head;
        for(int i = 1;i<arr.length;i++){
            Node temp = new Node(arr[i]);
            
        }

        return head;
    }

    public static Node deletionhead(Node head){
          if(head == null){
            return head;
          }
          head = head.next;
          return head;
    }
    public static void main(String[] args){
        int[] arr = {12,5,6,8};



    }
}
