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

public class addTwoNumbersinLinkedList{
    public Node addTwoNumbers(Node head1, Node head2){
       Node temp1 = head1;
       Node temp2 = head2;
       int carry  = 0;
       Node dummyNode = new Node(-1);
       Node curr = dummyNode;

       while(temp1 != null || temp2 != null){
          int sum = carry;
          if(temp1 != null){
            sum += temp1.data;
            temp1 = temp1.next;
          }

          if(temp2 != null){
            sum += temp2.data;
            temp2 = temp2.next;
          }

          Node newNode = new Node(sum % 10);
          carry = sum /10;

          if(carry != null){
            Node newNode = new Node(carry);
          }
        }
    }
}