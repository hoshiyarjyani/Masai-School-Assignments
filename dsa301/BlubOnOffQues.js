// Find the first and last BULB Ended
// Description

// Given a series of BULBS in a series, the initial state of the BULBS is that they are in ON-state. You are given an array of numbers denoting we will be flipping the A[i] BULB, Meaning if that BULB was in ON state we switch-OFF, else if it was in OFF state we switch it ON. After applying each operation you have to give answers to two queries.

// 1. What is the first bulb going from left to right order (1 to N order), that is turned ON?

// 2. What is the first bulb going from right to left order (N to 1 order), that is turned ON?

// (Note: Note if there is no such bulb found in a particular order then return -1.)

// Input
// Line 1: Single Integer N.

// Line 2. N integers are separated by a single space.

// Constraints:
// 5 <= N <= 10^6

// 1 <= A[i] <= N

// Output
// Output N lines, and in each line two integers that are separated by a single space, also the first integer is the result of the first query, and the second is the result of the second query.

// Sample Input 1

// 6
// 1 2 2 6 5 1
// Sample Output 1

// 2 6
// 3 6
// 2 6
// 2 5
// 2 4
// 1 4
// Hint

// We have to switch these numbered Bulbs =[1 2 2 6 5 1 ], In the starting, we assume all bulks are ON.

// Initially.png

function myFunction(N, arr) {
  let obj = [];
  for (let i = 0; i < N; i++) {
    obj[i] = 1;
  }
  for (let i = 0; i < N; i++) {
    let p = arr[i] - 1;

    if (obj[p] == 1) {
      obj[p] = 0;
    } else if (obj[p] == 0) {
      obj[p] = 1;
    }
    let first = "";
    let sec = "";
    for (let j = 0; j < N; j++) {
      if (obj[j] == 1) {
        first += j + 1;
        break;
      }
    }
    for (let j = N - 1; j >= 0; j--) {
      if (obj[j] == 1) {
        sec += j + 1;
        break;
      }
    }
    console.log(+first, +sec);
    first = "";
    sec = "";
  }
}

function runProgram(input) {
  // Write Code Here
  input = input.split("\n");
  N = +input[0];
  arr = input[1].split(" ").map(Number);
  myFunction(N, arr);
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
