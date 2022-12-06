// List and Queue Ended
// Description

// You need to implement a queue data structure with a list using plain list methods. You can only use list.append() and list.pop() methods in this question.

// Note-You can't uselist.pop(index) too in this question.

// Input
// The first line contains the number of operations (t).

// Next t lines contains commands for the queue.

// Eg- E 3 means add 3 in the queue

// D means to remove the front element of the queue and print it on the screen

// Note-If the queue is empty print- 'Empty' (Without the quotes)

// Output
// Print the front element as a single integer on the screen.

// Sample Input 1

// 4
// E 2
// E 3
// D
// D
// Sample Output 1

// 2
// 3

class Node {
  constructor(data) {
    this.data = data;
    this.next = null;
  }
}

class Queue {
  constructor() {
    this.first = null;
    this.last = null;
    this.size = 0;
  }

  enqueue(data) {
    let newNode = new Node(data);
    if (!this.first) {
      this.first = newNode;
      this.last = newNode;
    } else {
      this.last.next = newNode;
      this.last = newNode;
    }
    return this.size++;
  }
  dequeue() {
    if (!this.first) {
      return "Empty";
    }

    let f = this.first;

    if (this.size == 1) {
      this.last = null;
    }

    this.first = this.first.next;
    this.size--;
    return f.data;
  }
}

let Q = new Queue();

function listQueue(arr) {
  if (arr[0] == "E") {
    Q.enqueue(+arr[1]);
  } else {
    console.log(Q.dequeue());
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
    listQueue(arr);
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
