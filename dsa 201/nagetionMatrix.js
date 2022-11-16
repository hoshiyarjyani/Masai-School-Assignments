// Negation Matrix Ended
// Description

// You are given a matrix A, you have to find the negation matrix A' whose elements are given by the following rule

// A'[i][j] = Sum - A[i][j], Where Sum is the total sum of all the elements of matrix A.

// Input
// Input Format

// First-line contains 2 integers n and m representing the number of rows and columns respectively of 2D array arr.

// Following n lines contains m-integers.

// Constraints

// 1 <= n <= 100

// 1 <= m <= 100

// 1 <= arr[i][j] <= 10^4

// Output
// Print the negation matrix.

// Sample Input 1

// 2 2
// 1 2
// 3 4
// Sample Output 1

// 9 8
// 7 6
// Hint

// See the total sum of the given matrix, Sum = 1+2+3+4 = 10

// Resultant matrix elements A'[1][1] = Sum - A[1][1] = 10 - 1 = 9

// Similarly, A'[1][2] = 10-2 = 8

// A'[2][1] = 10-3 = 7

// A'[2][2] = 10-4 = 6

function myfunction(R, C, arr) {
  let sum = 0;
  for (let i = 0; i < R; i++) {
    for (let j = 0; j < C; j++) {
      sum += arr[i][j];
    }
  }

  for (let i = 0; i < R; i++) {
    let temp = "";
    for (let j = 0; j < C; j++) {
      temp += sum - arr[i][j] + " ";
    }
    console.log(temp.trim());
    temp = "";
  }
}
function runProgram(input) {
  // Write Code Here
  input = input.split("\n");
  size = input[0].split(" ").map(Number);
  R = +size[0];
  C = +size[1];
  var arr = [];

  for (let j = 0; j < R; j++) {
    arr.push(input[j + 1].split(" ").map(Number));
  }
  myfunction(R, C, arr);
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
