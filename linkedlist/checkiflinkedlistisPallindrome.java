package linkedlist;

public class checkiflinkedlistisPallindrome{

    public static Node reversethelinkedlist(Node head){
    if(head == null || head.next == null){
        return null;
    }

    Node temp = head;
    Node prev = null;
    while(temp != null){
        Node front = temp.next;
        temp.next = prev;
        prev = temp;
        temp = front;
    }
    return head;
}


    public static boolean checkifPallindrome(Node head){
       Node slow = head;
       Node fast = head;
       while(fast != null && fast.next.next != null){
           slow = slow.next;
           fast = fast.next.next;
       }

       Node newhead = reversethelinkedlist(head.next);

       Node first = head;
       Node second = newhead;
       while(second !=null){
        if(first.data != second.data){
            return false;
        }
        first = first.next;
        second = second.next;
       }

       reversethelinkedlist(newhead);
       return true;
      
    }
}