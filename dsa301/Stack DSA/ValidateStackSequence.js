// Valid Stack Sequence Ended
// Description

// Given two integer arrays pushed and popped each with distinct values, print "YES" if this could have been the result of a sequence of push and pop operations on an initially empty stack, or "NO" otherwise.

// Input
// Input Format

// The first line contains the number of testcases - t

// For each testcase:

// The first line contains the number of values - n
// The second line contains the pushed array
// The third line contains the popped array
// Constraints

// 1<=t<=10

// 1<=n<=10^5

// All elements of pushed and popped are distinct

// Output
// Print "YES" if this could have been the result of a sequence of push and pop operations on an initially empty stack, or "NO" otherwise.

// Sample Input 1

// 2
// 5
// 1 2 3 4 5
// 4 5 3 2 1
// 5
// 1 2 3 4 5
// 4 3 5 1 2
// Sample Output 1

// YES
// NO
// Hint

// Explanation 1 : We might do the following sequence:

// push(1), push(2), push(3), push(4),
// pop() -> 4,
// push(5),
// pop() -> 5, pop() -> 3, pop() -> 2, pop() -> 1
// Explanation 2 : 1 cannot be popped before 2.

function myfunction(N, arr1, arr2) {
  let stk = [];
  let j = 0;
  for (let i = 0; i < N; i++) {
    stk.push(arr1[i]);
    while (stk.length != 0 && j < N && stk[stk.length - 1] == arr2[j]) {
      stk.pop();
      j++;
    }
  }

  if (j == N) {
    console.log("YES");
  } else {
    console.log("NO");
  }
}
function runProgram(input) {
  // Write Code Here
  input = input.split("\n");
  tc = +input[0];
  line = 1;
  for (let i = 0; i < tc; i++) {
    N = +input[line];
    line++;
    arr1 = input[line].split(" ").map(Number);
    line++;
    arr2 = input[line].split(" ").map(Number);
    myfunction(N, arr1, arr2);
    line++;
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
