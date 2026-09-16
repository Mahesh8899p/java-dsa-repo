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

    public class insertionbeforevalue{
        public static Node insertionbeforevalue(Node head, int el, int val){
            if(head == null){
                return null;
            }
            if(head.data == val){
                return new Node(el,head);
            }

             
        }
    }
}