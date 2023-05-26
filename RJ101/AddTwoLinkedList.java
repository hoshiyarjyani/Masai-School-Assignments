/*
class Node{
  int data;
  Node next;
  
  Node(int data){
    this.data = data;
    this.next = null;
  }
}
*/
class Solution {
    public Node addTwoLinkedList(Node head1, Node head2) {

        int carry = 0;
        Node sarpanch = new Node(0);
        Node node = sarpanch;

        while (head1 != null || head2 != null) {
            int sum = carry;

            if (head1 != null) {
                sum += head1.data;
                head1 = head1.next;
            }
            if (head2 != null) {
                sum += head2.data;
                head2 = head2.next;
            }

            carry = sum / 10;
            int x = sum % 10;
            node.next = new Node(x);
            node = node.next;
        }

        if (carry > 0) {
            node.next = new Node(carry);
        }
        return sarpanch.next;

    }
}