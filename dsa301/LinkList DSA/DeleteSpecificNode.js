// Deleting a Node -4:12:15
// Description

// Delete the node at a given position in a linked list and return a reference to the head node. The head is at position 0. The list may be empty after you delete the node. In that case, return a null value.

// Complete thedeleteNodefunction in the editor below.

// deleteNodehas the following parameters:
// -LinkedListNode pointer list:a reference to the head node in the list
// -int position:the position of the node to remove

// Input
// The first line of input contains an integer n, the number of elements in the linked list.

// Each of the next n linescontains an integer, the node data values in order.

// The last line contains an integer,the position of the node to delete.

// n <= 1000

// list[i] <= 1000

// Output
// Print the updated Linked List

// Sample Input 1

// 8
// 20
// 6
// 2
// 19
// 7
// 4
// 15
// 9
// 3
// Sample Output 1

// 20 6 2 7 4 15 9

const LinkedListNode = class {
  constructor(nodeData) {
    this.data = nodeData;
    this.next = null;
  }
};

// Complete the function below

function deleteNode(head, position) {
  let count = 0;
  let prev = null;
  let curr = head;
  //20 6 2 19 7 4 15 9
  while (count < position) {
    prev = curr;
    curr = curr.next;
    count++;
  }
  curr = curr.next;
  prev.next = curr;
  return head;
}
