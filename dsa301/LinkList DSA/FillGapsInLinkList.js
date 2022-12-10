// Fill Gaps -43:13:14
// Description

// You are given a sorted linked list containing unique values. You have to manipulate the linked list such that the difference between every two adjacent node values should be exactly equal to 1. You can only insert some extra between existing nodes in the linked list.

// Note

// You don’t need to take input/output. Just implement the given function.

// Input
// The first line of input contains the N denoting the number of elements of the linked list.

// The second line contains the elements of the linked list.

// Function description

// fillGaps(head) {

// // Write your code here

// }
// Arguments:

// head = head node of the LinkedList.
// Constraints

// 1 <= N <= 10^4

// 1<= node.val <=10^6

// Output
// Return the head of the modified linked list.

// Note

// The sample output will contain the modified Linked List.

// Sample Input 1

// 3
// 4 7 8
// Sample Output 1

// 4 5 6 7 8
// Sample Input 2

// 5
// 2 5 8 9 11
// Sample Output 2

// 2 3 4 5 6 7 8 9 10 11
// Hint

// Explanation of Sample 1

// The given linked list has elements 4 and 7. We can insert nodes 5 and 6 between 4 and 7 to make a new LinkedList having a difference between every pair of adjacent nodes equal to 1. So, the linked list becomes 4->5->6->7.

const LinkedListNode = class {
  constructor(nodeData) {
    this.data = nodeData;
    this.next = null;
  }
};
// Complete the function below
var fillGaps = function (head) {
  let curr = head;
  let x = head.data;
  let y = 0;
  while (curr.next) {
    curr = curr.next;
  }
  y = curr.data;
  let z = y - x + 1;

  let first = head;
  let prev = null;
// ...
  for (let i = x; i < x + z; i++) {
    if (i == first.data) {
      prev = first;
      first = first.next;
      continue;
    } else {
      let node = new LinkedListNode(i);
      prev.next = node;
      prev = node;
      node.next = first;
    }
  }
  return head;

  // let first = head;
  // for(let i = x; i<x+z;i++){
  //     if(i==first.data){
  //         continue;
  //     }else{
  //          let node = new LinkedListNode(i);
  //          first.next=node;
  //          first=first.next;
  //     }

  // }
  // return head;
};
