// Nth node from the end -41:56:51
// Description

// Given a linked list consisting of nodesand given a number N. The task is to find the nth nodefrom the end of the linked list.

// No need to take any input, just complete the function below and return the nth node.

// Input
// This is a function complete problem.

// Refer to sample input for understanding

// The first line contains the number nodes (t)

// Next t lines contains the nodes of the linked list

// Next line contains the number n

// t <= 1000

// list[i] <= 1000

// Output
// Complete the function

// Sample Input 1

// 3
// 1
// 2
// 3
// 1
// Sample Output 1

// 3

const LinkedListNode = class {
  constructor(nodeData) {
    this.data = nodeData;
    this.next = null;
  }
};

function nth_node(head, n) {
  if (head == null) return -1;
  let p = head;
  let q = head;
  for (let i = 1; i < n && q != null; i++) {
    q = q.next;
  }
  if (q == null) {
    return -1;
  }
  while (q.next != null) {
    p = p.next;
    q = q.next;
  }
  return p.data;
}
