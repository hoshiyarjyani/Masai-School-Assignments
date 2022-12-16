// Add two Linked Lists Ended
// Description

// You are given two non-empty linked lists representing two non-negative integers. The digits are stored in reverse order, and each of their nodes contains a single digit. Add the two numbers and return the sum as a linked list.

// You may assume the two numbers do not contain any leading zero, except the number 0 itself.

// Return the head of the updated linked list (In reverse order)

// Input
// This is a function complete problem.

// Refer to sample input for understanding

// First Line contains the number of elements in the first linked list (t1)

// Next t1 lines contains a single node of linked list in which the first element is the head

// The next line contains the number of elements in the second linked list (t2)

// Next t2 lines contains a single node of linked list in which the first element is the head

// t1,t2 <= 1000

// list[i] <= 1000

// Output
// Complete the function

// Sample Input 1

// 3
// 2
// 4
// 3
// 3
// 5
// 6
// 4
// Sample Output 1

// 7 0 8
// Hint

// 342 + 465 = 807

const ListNode = class {
  constructor(nodeData) {
    this.val = nodeData;
    this.next = null;
  }
};

// Complete the function below

var addTwoNumbers = function (l1, l2) {
  let carry = 0;
  let sarpanch = null;
  while (l1 || l2) {
    let sum = 0;
    if (!l1) {
      sum += l2.val + carry;
      l2 = l2.next;
    } else if (!l2) {
      sum += l1.val + carry;
      l1 = l1.next;
    } else {
      sum += l1.val + l2.val + carry;
      l1 = l1.next;
      l2 = l2.next;
    }
    //console.log(sum);
    carry = Math.floor(sum / 10);
    sum = Math.floor(sum % 10);
    let abc = new ListNode(sum);
    if (!sarpanch) {
      sarpanch = abc;
    } else {
      let cur = sarpanch;
      while (cur.next) {
        cur = cur.next;
      }
      cur.next = abc;
      cur = abc;
    }
  }

  return sarpanch;
};
