// Remove Duplicates -4:5:34
// Description

// Given a sorted linked list, delete all duplicates such that each element appears only once.

// No need to take any input, justcomplete the functionbelow, andreturn the head of the updated linked list.

// Input
// This is a function complete problem.

// Refer to sample input for understanding

// The first line contains the number of nodes (n)

// Next n lines contains the nodes of the linked list

// n <= 1000

// list[i] <= 1000

// Output
// Complete the function

// Sample Input 1

// 4
// 1
// 1
// 1
// 2
// Sample Output 1

// 1 2

const LinkedListNode = class {
  constructor(nodeData) {
    this.data = nodeData;
    this.next = null;
  }
};

// Complete the function below
var deleteDuplicates = function (head) {
  let prev = head;
  let curr = head;

  while (curr) {
    if (prev.data != curr.data) {
      prev.next = curr;
      prev = curr;
    }
    curr = curr.next;
  }

  if (curr != prev) {
    prev.next = curr;
  }

  return head;
};
