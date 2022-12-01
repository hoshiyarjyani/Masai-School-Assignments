// Nearest Smaller Element Ended
// Description

// You are given an array A of size N. For each element, in the array find the closest element with a smaller value, than the current value. If no such element exists, print -1. If two values are equidistant to the current value, print the one that occurs to the left of it. Refer the sample I/O for better understanding.

// Input
// The first line contains T, the number of test cases. The first line of each test case contains N, the size of the array.

// Next line contains N space separated integers denoting the closest smaller values, or -1, if no such values exist.

// Constraints

// 1 <= T <= 10

// 1 <= N <= 10^5

// 1 <= A[i] <= 10^4

// Output
// For each test case, print N space separated integers, denoting the nearest smaller elements, or -1 if it does not exists, on a new line.

// Sample Input 1

// 1
// 8
// 39 27 11 4 24 32 32 1
// Sample Output 1

// 27 11 4 1 4 24 1 -1
// Hint

// In the sample test case, the array has 8 elements. The closest value to the first element 39, which is lesser than it is 27. Similarly, for 27 is 11, for 11 is 4, for 4 is 1, for 24 is 4, for the first instance of 32, the closest value is 24, and for the second instance, the closest value is 1, and for 1, the value is -1, as it has no values lesser than it in the array.


function myFunction(N, arr) {
  let stk1 = [];
  let stk2 = [];
  let x = [];
  let y = [];
  let ans = [];

  //watching left Smaller
  for (let i = 0; i < N; i++) {
    while (stk1.length != 0 && arr[stk1[stk1.length - 1]] >= arr[i]) {
      stk1.pop();
    }
    if (stk1.length == 0) {
      x.push(-1);
    } else {
      x.push(stk1[stk1.length - 1]);
    }
    stk1.push(i);
  }

  // watching Right Smaller
  for (let i = N - 1; i >= 0; i--) {
    while (stk2.length != 0 && arr[stk2[stk2.length - 1]] >= arr[i]) {
      stk2.pop();
    }
    if (stk2.length == 0) {
      y.push(-1);
    } else {
      y.push(stk2[stk2.length - 1]);
    }
    stk2.push(i);
  }
  y.reverse();
  ////////////////////////////////////
  for (i = 0; i < N; i++) {
    if (x[i] == -1 && y[i] == -1) {
      ans.push(-1);
    } else if (x[i] == -1 && y[i] != -1) {
      ans.push(arr[y[i]]);
    } else if (x[i] != -1 && y[i] == -1) {
      ans.push(arr[x[i]]);
    } else {
      let a = Math.abs(i - x[i]);
      let b = Math.abs(i - y[i]);

      if (a > b) {
        ans.push(arr[y[i]]);
      } else {
        ans.push(arr[x[i]]);
      }
    }
  }
  ///////////////////////////

  //   console.log(x);
  //   console.log(y);
  console.log(ans.join(" "));
}

function runProgram(input) {
  // Write Code Here
  input = input.split("\n");
  tc = +input[0];
  line = 1;
  for (let i = 0; i < tc; i++) {
    N = +input[line];
    line++;
    arr = input[line].split(" ").map(Number);
    myFunction(N, arr);
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
