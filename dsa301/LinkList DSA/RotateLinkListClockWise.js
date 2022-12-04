// Rotate Linked List -4:10:17
// Description

// Given a linked list, rotate the list to the right by k places, where k isnon-negative.

// Complete the function, and return the head of the updated list

// Input
// This is a function complete problem.

// Refer to sample input for understanding

// The first line contains the number of nodes (n)

// Next n lines contains the nodes of the linked list

// Next line contains k

// n <= 1000

// list[i] <= 1000

// Output
// Complete the function

// Sample Input 1

// 3
// 1
// 2
// 3
// 2
// Sample Output 1

// 2 3 1

const LinkedListNode = class {
  constructor(nodeData) {
    this.data = nodeData;
    this.next = null;
  }
};
// k=3
// 1 2 3 4 5
// 3 4 5 1 2 clock wise  (from right side)
// 4 5 1 2 3 anticlock wise (from left side)
var rotateRight = function (head, k) {
  let a = 0;
  let cur1 = head;
  while (cur1) {
    cur1 = cur1.next;
    a++;
  }

  k = k % a;

  k = a - k + 1;

  //console.log(a);

  if (k == 0) {
    return head;
  }
  let curr = head;
  let kth = null;
  let count = 1;
  while (count < k && curr != null) {
    kth = curr;
    curr = curr.next;
    count++;
  }
  if (curr == null) {
    return head;
  }

  while (curr.next) {
    curr = curr.next;
  }

  curr.next = head;
  head = kth.next;
  kth.next = null;

  return head;
};
