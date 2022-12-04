// Insert a node at the Tail -4:14:38
// Description

// You are given the pointer to the head node of a linked list and an integer to add to the list. Create a new node with the given integer. Insert this node at the tail of the linked list and return the head node of the linked list formed after inserting this new node. The given head pointer may be null, meaning that the initial list is empty.

// You have to complete theLinkedListNode insertAtTail(LinkedListNode head, int data)method. It takes two arguments: the head of the linked list and the integer to insert at the tail. You should not readany input from the stdin/console.

// Input
// The first line contains an integer n, denoting the elements of the linked list.

// The next nlines contain an integer each, denoting the element that needs to be inserted at the tail.

// n <= 1000

// list[i] <= 1000

// Output
// For each case print the updated Linked List

// Sample Input 1

// 3
// 1
// 2
// 3
// Sample Output 1

// 1
// 1 2
// 1 2 3

const LinkedListNode = class {
  constructor(nodeData) {
    this.data = nodeData;
    this.next = null;
  }
};

// Complete the function below

function insertNodeAtTail(head, data) {
  let node = new LinkedListNode(data);
  if (!head) {
    head = node;
    return head;
  }
  let curr = head;

  while (curr.next) {
    curr = curr.next;
  }
  curr.next = node;
  return head;
}
