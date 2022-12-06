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

let arr = [];
let x = 0;
let y = 0;
let count = 0;
function enqueue(d) {
  arr[x] = d;
  x++;
  count++;
  console.log(count);
}
function dequeue() {
  if (count === 0) {
    console.log(-1 + " " + 0);
  } else {
    count--;
    console.log(arr[y] + " " + count);
    y++;
  }
}

function runProgram(input) {
  // Write Code Here

  input = input.trim().split("\n");
  let tc = +input[0];
  let line = 1;
  let Arr = [];

  for (let i = 0; i < tc; i++) {
    Arr = input[line].trim().split(" ").map(Number);
    line++;
    if (Arr.length == 2) {
      enqueue(Arr[1]);
    } else {
      dequeue();
    }
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
