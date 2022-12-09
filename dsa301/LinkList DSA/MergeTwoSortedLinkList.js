// Merge two Linked Lists -42:1:16
// Description

// Merge two sorted linked lists and return it as a new sorted list. The new list should be made by splicing together the nodes of the first two lists.

// Complete the function below and return the head of the new linked list.

// Input
// This is a function complete problem

// To get a understanding of the input-

// The first line contains the number of nodes in the first linked list (n1)

// Next n1 lines contains the nodes of the first linked list

// Next line contains the number of nodes in the second linked list (n2)

// Next n2 lines contains the nodes of the second linked list

// n1, n2 <= 1000

// list[i] <= 1000

// Output
// Complete the function

// Sample Input 1

// 3
// 1
// 1
// 2
// 4
// 2
// 3
// 4
// 5
// Sample Output 1

// 1 1 2 2 3 4 5

const ListNode = class {
  constructor(nodeData) {
    this.val = nodeData;
    this.next = null;
  }
};

// Complete the function below
let arr = [];
var mergeTwoLists = function (l1, l2) {
  let curr = l1;
  while (curr) {
    arr.push(curr.val);
    curr = curr.next;
  }
  let curr1 = l2;
  while (curr1) {
    arr.push(curr1.val);
    curr1 = curr1.next;
  }

  arr.sort((a, b) => {
    return a - b;
  });

  // array bn gyi h

  class List {
    constructor() {
      this.head = null;
      this.size = 0;
    }
    add(data) {
      let newNode = new ListNode(data);
      if (!this.head) {
        this.head = newNode;
      } else {
        let Raja = this.head;
        while (Raja.next) {
          Raja = Raja.next;
        }
        Raja.next = newNode;
      }
      this.size++;
    }
  }

  let List1 = new List();

  let i = 0;
  while (i < arr.length) {
    List1.add(arr[i]);
    i++;
  }

  return List1.head;
};
