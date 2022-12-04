// Palindrome List -4:6:35
// Description

// Given a singly linked list, determine if it is a palindrome.
// No need to take any input, You'll be given the pointer to the head of the linked list,Complete the function belowand return true if it's a palindrome and false if otherwise.

// Input
// This is a function complete problem.

// Refer to sample input for understanding

// The first line contains the number of nodes (n)

// Next n lines contains the nodes of the linked list.

// n <= 1000

// list[i] <= 1000

// Output
// Complete the function

// Sample Input 1

// 3
// 1
// 2
// 1
// Sample Output 1

// true

const LinkedListNode = class {
  constructor(nodeData) {
    this.data = nodeData;
    this.next = null;
  }
};
// Complete the function below
var isPalindrome = function (head) {
  var arr = [];

  let curr = head;
  while (curr) {
    arr.push(curr.data);
    curr = curr.next;
  }

  let str = "";
  for (let i = arr.length - 1; i >= 0; i--) {
    str += arr[i];
  }

  if (arr.join("") === str) {
    return true;
  } else {
    return false;
  }
};
