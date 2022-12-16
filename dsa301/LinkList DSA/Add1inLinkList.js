// Add 1 to Linked List Ended
// Description

// A number is given represented in the form of a linked list. Add one to it.

// Input
// This is a function complete problem. You don't have to take the input just complete the function given.

// The sample test case is given only for your understanding.

// Output
// Return head of linked list which is the new number after incrementing one.

// Sample Input 1

// 4
// 2 3 1 3
// Sample Output 1

// 2314
// Hint

// In the sample test case, the number represented by the linked list is 2->3->1->3 is 2313. After adding one the number becomes 2314, as given in the output.

const LinkedListNode = class {
  constructor(nodeData) {
    this.data = nodeData;
    this.next = null;
  }
};

var addOneToLinkedList = function (head) {
  /////////////////////////////
  // reverse 1st time
  let prev = null;
  let curr = head;
  let next = null;
  while (curr) {
    next = curr.next;
    curr.next = prev;
    prev = curr;
    curr = next;
  }
  head = prev;

  /////////////////////////////////
  let carry = 0;
  let c = head;
  let d = head;
  let count = 0;
  while (c) {
    let sum = 0;
    count++;
    if (count == 1) {
      sum += c.data + 1;
    } else {
      sum = sum + carry + c.data;
    }
    carry = Math.floor(sum / 10);
    sum = Math.floor(sum % 10);
    c.data = sum;
    c = c.next;
  }
  if (carry == 1) {
    var a = new LinkedListNode(carry);
    a.next = d;
    head = a;
    return head;
  }

  ///////////////////////////////////
  //again reverse
  let pre = null;
  let nex = null;
  let cur = head;
  while (cur) {
    nex = cur.next;
    cur.next = pre;
    pre = cur;
    cur = nex;
  }

  head = pre;
  return head;
  /////////////////////////////////
};
