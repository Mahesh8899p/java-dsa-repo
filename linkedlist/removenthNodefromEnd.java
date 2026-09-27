package linkedlist;

public class removenthNodefromEnd{
    public Node removeNthFromEnd(Node head , int n){
        Node fast = head;
        for(int i = 0;i<n;i++){
            if(fast.next == null){
                return head;
            }
             fast = fast.next;
        }
        Node slow = head;
        while(fast.next != null){
            fast = fast.next;
            slow = slow.next;
        }

        Node delNode = slow.next;
        slow.next = slow.next.next;

        return head;

    }
}