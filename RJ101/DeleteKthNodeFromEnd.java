
class Node {
    int data;
    Node next;

    public Node(int data, Node next) {
        this.data = data;
        this.next = next;
    }

    public Node(int data) {
        this.data = data;
        this.next = null;
    }

    public Node() {
        this.data = 0;
        this.next = null;
    }
}

class Solution {
    public static Node deleteNode(Node head, int position) {
        Node current = head;
        int count = 0;
        while (current != null) {
            current = current.next;
            count++;
        }
        if (position == count) {
            return head.next;
        }
        int pos = count - position;
        Node temp = head;
        int j = 0;
        Node prev = null;
        while (j < pos && temp.next != null) {
            j++;
            prev = temp;
            temp = temp.next;
        }
        prev.next = temp.next;
        return head;
    }
}