package linkedliststrv.deletion;

class Node{
    int data;
    Node next;


    Node(int data,Node next){
        this.data = data;
        this.next = next;
    }

    Node(int data){
        this.data = data;
    }
}
public class deletionofk{

    public static Node deletionofkth(Node head, int k){
        if(head == null){
            return null;
        }

        if(k == 1){
            head = head.next;
            return head;
        }

        Node temp = head;
        int count = 0;
        Node prev = null;

        while(temp!=null){
            count++;
            if(count == k){
                prev.next = prev.next.next;
                break;
            }

            prev = temp;
            temp = temp.next;
        }

        return head;

    }

    public static Node ArrayToLinkedList(int[] arr){
        Node head = new Node(arr[0]);
        Node mover = head;
        
        for(int i = 1;i<arr.length;i++){
            Node temp = new Node(arr[i]);
            mover.next = temp;
            mover = temp;
        }

        return head;
    }

}