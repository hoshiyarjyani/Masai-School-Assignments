// Sort Binary List Ended
// Description

// Sort the linked list containing 0's and 1's only and return a reference to the head node. The head is at position 0.

// Complete the sortBinaryList in the editor below.

// sortBinaryList the following parameters:

// -LinkedListNode pointer list:a reference to the head node in the list

// Input
// Input Format
// The first line of input contains an integer n, the number of elements in the linked list.

// The next line contains n integers, the node data values in order.

// Constraints
// 1 <= n <= 10^4

// 0 <= node values <= 1

// Output
// Output Format
// Output the n node values in sorted order.

// Sample Input 1

// 5
// 1 0 1 1 0
// Sample Output 1

// 0 0 1 1 1
// Sample Input 2

// 4
// 1 1 1 0
// Sample Output 2

// 0 1 1 1
// Hint

// The output is just the sorted linked list.

const LinkedListNode = class {
  constructor(nodeData) {
    this.data = nodeData;
    this.next = null;
  }
};
// Complete the function below
var sortBinaryList = function (head) {
  let arr = [];
  let curr = head;
  while (curr) {
    arr.push(curr.data);
    curr = curr.next;
  }
  arr.sort();
  head = null;
  for (let i = 0; i < arr.length; i++) {
    let abc = new LinkedListNode(arr[i]);
    if (!head) {
      head = abc;
    } else {
      let cur = head;
      while (cur.next) {
        cur = cur.next;
      }
      cur.next = abc;
      cur = abc;
    }
  }

  return head;
};
