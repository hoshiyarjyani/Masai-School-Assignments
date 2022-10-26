// Conditional Matrix Sum -81:48:25
// Description

// You are given a matrix(2 dimensional array) of integers of n rows and m columns. Your task is to write a program that calculates sum of all such integers present in the matrix which are divisible by 3.

// Input
// Input Format

// First line contains n and m.

// In the next n lines, there are m integers in each line which makes up elements of matrix.

// Constraints

// n<100

// m<100

// Output
// Output Format

// Output one number which is the sum of all such integers which are divisible by 3.

// Sample Input 1

// 2 3
// 3 1 8
// 2 6 0
// Sample Output 1

// 9
// Hint

// The given 2 dimensional array has 2 rows and 3 columns.

// There are two integers present in this array which are divisible by 3 (those are 3 and 6). So, the output is 9.

// Lang

function myfunction(R, C, arr) {
  let sum = 0;
  for (let i = 0; i < R; i++) {
    for (let j = 0; j < C; j++) {
      if (arr[i][j] % 3 == 0) {
        sum += +arr[i][j];
      }
    }
  }
  console.log(sum);
}

function runProgram(input) {
  // Write Code Here
  input = input.split("\n");
  size = input[0].split(" ").map(Number);
  R = +size[0];
  C = +size[1];
  var arr = [];

  for (let j = 0; j < R; j++) {
    arr.push(input[j + 1].split(" "));
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
