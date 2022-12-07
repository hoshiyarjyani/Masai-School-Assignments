// Linked List Cycle Ended
// Description

// Givenhead, the head of a linked list, determine if the linked list has a cycle in it.

// There is a cycle in a linked list if there is some node in the list that can be reached again by continuously following thenextpointer. Internally,posis used to denote the index of the node that the tail'snextpointer is connected to.

// Note-posis not passed as a parameter.

// Complete the function below. No need to take any input, just return if the given linked list has a cycle in it or not.Returntrueif there is a cycle in the linked list. Otherwise, returnfalse.

// Note- All the nodes are different

// Input
// This is a function complete problem.

// Refer to sample input for understanding

// The first line contains the number of cases (t)

// Next line contains number of nodes in the first linked list (n)

// Next n lines contains the linked list

// Next line contains the position of the node that the tail of the linked list points to. (If it's -1 then it doesn't point to anything)

// t <= 10

// n <= 10

// Output
// Complete the function

// Sample Input 1

// 1
// 3
// 1
// 2
// 3
// -1
// Sample Output 1

// false

const LinkedListNode = class {
  constructor(nodeData) {
    this.data = nodeData;
    this.next = null;
  }
};
// Complete the function below
var hasCycle = function (head) {
  let slow = head;
  let fast = head;
  while (slow != null && fast != null && fast.next != null) {
    slow = slow.next;
    fast = fast.next.next;

    if (slow == fast) {
      return true;
    }
  }
  return false;
};
