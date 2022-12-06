// List and Queue 2 Ended
// Description

// You need to implement a list using queue data structure. You can only use queue.get() and queue.put() methods.

// Note- import and the use queue data structure.

// Input
// The first line contains the number of operations (t).

// Next t lines contains commands for the list.

// Eg- Push 3 means add 3 in the list

// Pop means to remove the last element of the list and print it on the screen

// Note-If the list is empty print- 'Empty' (Without the quotes)

// t <= 500000

// Output
// Print the last element as a single integer on the screen.

// Sample Input 1

// 3
// Push 4
// Push 5
// Pop
// Sample Output 1

// 5
// Hint

// After two push operations the list would look like - [4,5], popping it should return 5

class Node {
  constructor(data) {
    this.data = data;
    this.next = null;
  }
}

class Stack {
  constructor() {
    this.first = null;
    this.size = 0;
  }

  Push(data) {
    let newNode = new Node(data);
    if (!this.first) {
      this.first = newNode;
    } else {
      newNode.next = this.first;
      this.first = newNode;
    }
    return ++this.size;
  }

  Pop() {
    if (!this.first) {
      return "Empty";
    }

    let stk = this.first;

    if (this.size === 1) {
      this.first = null;
      this.size--;
      return stk.data;
    } else {
      this.first = this.first.next;
      this.size--;
      return stk.data;
    }
  }
}

let S = new Stack();

function stackData(arr) {
  if (arr[0] == "Push") {
    S.Push(+arr[1]);
  } else {
    console.log(S.Pop());
  }
}

function runProgram(input) {
  // Write Code Here
  input = input.split("\n");
  tc = +input[0];
  let line = 1;
  for (let i = 0; i < tc; i++) {
    let arr = input[line].split(" ");
    line++;
    stackData(arr);
  }
}
if (process.env.USERNAME === "") {
  runProgram(``);
} else {
  process.stdin.resume();
  process.stdin.setEncoding("ascii");
  let read = "";
  process.stdin.on("data", function (input) {
    read += input;
  });
  process.stdin.on("end", function () {
    read = read.replace(/\n$/, "");
    read = read.replace(/\n$/, "");
    runProgram(read);
  });
  process.on("SIGINT", function () {
    read = read.replace(/\n$/, "");
    runProgram(read);
    process.exit(0);
  });
}
