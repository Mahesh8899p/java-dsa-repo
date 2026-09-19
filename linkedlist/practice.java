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
    }
}

public class practice{
    public static Node linkedlisttoarray(int[] arr){
        Node head = new Node(arr[0]);
        Node mover = head;

        for(int i =1;i<arr.length;i++){
            Node temp = new Node(arr[i]);

            mover.next = temp;
            mover = temp;
        }
        return head;
    }

    public static Node lengthoflinkedlist(Node head){
        int count = 0;
        Node temp = head;
        while(temp != null){
            count++;
            temp = temp.next;
        }

        return head;
    }

    public static Node traversaloflinkedlist(Node head){
        Node temp = head;
        while(temp != null){
            System.out.println(temp.data);
            temp = temp.next;
        }

        return head;
    }

    public static int searchElementinlinkedList(Node head, int target){
        Node temp = head;
        int index = 0;
        while(temp != null){
            if(temp.data == target){
                return index;
            }
            temp = temp.next;
            index++;
        }
        return -1;
    }

    public static Node deletionathead(Node head){
        if(head == null || head.next == null){
            return null;
        }
        head= head.next;
        return head;
    }

    public static Node insertionattail(Node head, int val){
        if(head == null || head.next == null){
            return null;
        }
        Node temp = head;

        while(temp.next != null){
            Node newNode = new Node(val);
            temp.next = newNode;
        }
        return head;
    }

    public static Node insertionatk(Node head, int val, int k){
        if(head == null || head.next == null){
            return head;

        }
        if(k == 1){
            
        }
    }
}