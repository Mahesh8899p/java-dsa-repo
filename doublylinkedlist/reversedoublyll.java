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
        this.data= data;
    }
}

public class reversedoublyll{
    public static Node reversedll(Node head){
         if(head == null || head.next == null){
            return head;
         }

         Node prev = null;
         Node current = head;

         while(current != null){
                prev = current.back;


                current.back = current.next;
                current.next = prev;

                current = current.back;
         }

            return prev;
    }
}