// Can you find the sum Ended
// Description

// Teena is very good at competitive programming, she solved enough problems on arrays and her friend wants to test her knowledge in arrays, so gave her following task :

// The problem is given an array A having N integers, for each element i (1 <= i <= N), find x+y  where x is the largest number less than i such that A[x]>A[i] and y is the smallest number greater than i such that A[y]>A[i].
// If there is no x < i such that A[x]>A[i], then take x=−1. Similarly, if there is no y>i such that A[y]>A[i], then take y=−1.

// Input
// Input Format

// First line consists of a single integer denoting N.

// Second line consists of N space separated integers denoting the array A.

// Constraints

// 1 <= N <= 10^6

// 1 <= A[i] <= 10^9

// Output
// Print N space separated integers, denoting x+y for each i

// Sample Input 1

// 5
// 5 4 1 3 2
// Sample Output 1

// -2 0 6 1 3
// Hint

// Sample 1 Explanation

// Values of x for each i: -1,1,2,2,4

// Values of y for each i: -1,-1,4,-1,-1

// So, x+y for each i: -2,0,6,1,3

function myFunction(N, arr) {
  let stk1 = [];
  let stk2 = [];
  let x = [];
  let y = [];
  let ans = [];
  for (let i = 0; i < N; i++) {
    while (stk1.length != 0 && arr[stk1[stk1.length - 1]] <= arr[i]) {
      stk1.pop();
    }
    if (stk1.length == 0) {
      x.push(-1);
    } else {
      x.push(stk1[stk1.length - 1] + 1);
    }
    stk1.push(i);
  }
  for (let i = N - 1; i >= 0; i--) {
    while (stk2.length != 0 && arr[stk2[stk2.length - 1]] <= arr[i]) {
      stk2.pop();
    }
    if (stk2.length == 0) {
      y.push(-1);
    } else {
      y.push(stk2[stk2.length - 1] + 1);
    }
    stk2.push(i);
  }
  y.reverse();
  for (let i = 0; i < N; i++) {
    ans.push(x[i] + y[i]);
  }
  console.log(ans.join(" "));
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
    l;
  });
}
