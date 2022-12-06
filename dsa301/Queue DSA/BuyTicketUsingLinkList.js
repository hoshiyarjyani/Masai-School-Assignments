// Buy ticket Ended
// Description

// There is a long waiting line of integers waiting for their turn to buy ticket for a cricket match.

// There are N operations that can be performed on this line. The operations are of following type:

// E x : Integer x enters the queue (For such operation, print the new length of the queue.)

// D: The integer at front buys ticket and leaves the queue (For such operations, print the element that left the queue and the new size of the queue separated by space. If there is no element in the queue then print -1 in place of deleted element.)

// Input
// Input Format :

// First line consists of a single integer denoting N

// Each of the following N lines contain one of the operation as described above.

// Constraints :

// 1<=N<=100

// Output
// For each enqueue operation print the new size of the queue.

// And for each dequeue operation print two integers, deleted element (-1, if queue is empty) and the new size of the queue.

// Sample Input 1

// 5
// E 2
// D
// D
// E 3
// D
// Sample Output 1

// 1
// 2 0
// -1 0
// 1
// 3 0


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

  Enqueue(data) {
    let newNode = new Node(data);
    if (this.first == null) {
      this.first = newNode;
      this.last = newNode;
    } else {
      this.last.next = newNode;
      this.last = newNode;
    }
    console.log(++this.size);
    return this.size;
  }

  Dequeue() {
    if (this.first == null) {
      console.log("-1 0");
      return "-1 0";
    }
    let d = this.first;
    if (this.size === 1) {
      this.last = null;
    }
    this.first = this.first.next;
    this.size--;
    console.log(d.data, this.size);
    return d.data;
  }
}

let Q = new Queue();

function listQueue(arr) {
  if (arr[0] == "E") {
    Q.Enqueue(+arr[1]);
  } else {
    Q.Dequeue();
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
