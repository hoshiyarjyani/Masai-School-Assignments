// Remove Maximum Element In Linked List Ended
// Description

// You are given the head of the linked list, you need to remove the maximum element in the linked list and return the head of the changed linked list.

// Note

// You don’t need to take input/output. Just implement the given function.

// If the linked list is empty, return a NULL value

// If there is more than one maximum element remove the last occurring element in the linked list.

// Input
// The first line contains the size of the linked list.

// The second line contains the linked list in form of an array.

// Function description

// removeMaximum(head) {

// // Write your code here

// }

// Arguments:

// head = Head node of the linked list.
// Constraints

// 1 <= N <= 10^4

// 1 <= Linked List Values <= 500

// Output
// Return the head of the modified linked list.

// Sample Input 1

// 5
// 1 2 3 4 5
// Sample Output 1

// 1 2 3 4 5
// 1 2 3 4
// 1 2 3
// 1 2
// 1
// -1

const LinkedListNode = class {
  constructor(nodeData) {
    this.data = nodeData;
    this.next = null;
  }
};
// Complete the function below
var removeMaximum = function (head) {
  let max = -Infinity;
  let curr = head;
  while (curr != null) {
    if (max < curr.data) {
      max = curr.data;
    }
    curr = curr.next;
  }
  // 1 5 7 9 3 5 4 9 7
  // reverse

  let pre = null;
  let cur = head;
  let nex = null;
  while (cur != null) {
    nex = cur.next;
    cur.next = pre;
    pre = cur;
    cur = nex;
  }
  head = pre;

  let prev = null;
  let front = head;

  while (front) {
    if (head.data == max) {
      head = front.next;
      front.next = null;
    } else if (front.data == max) {
      if (front.next == null) {
        prev.next = null;
      } else {
        prev.next = front.next;
        front.next = null;
      }
    }
    prev = front;
    front = front.next;
  }

  //again reverse

  let pr = null;
  let cu = head;
  let ne = null;
  while (cu != null) {
    ne = cu.next;
    cu.next = pr;
    pr = cu;
    cu = ne;
  }
  head = pr;

  return head;
};
