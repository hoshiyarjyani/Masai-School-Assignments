// Factorial-Recursion -52:27:33
// Description

// The factorial of a positive integer N is the product of all positive integers less than or equal to n:

// Given a number N your task is to write a program that calculates factorial of N

// Input
// Input Format

// First and the only line contains N

// Constraints

// N<15

// Output
// Output the factorial value of N

// Sample Input 1

// 5
// Sample Output 1

// 120
// Hint

// Sample Explanation

// Factorial of 5 = 5*4*3*2*1 = 120

function myFun(n) {
  if (n == 1) {
    return 1;
  } else {
    return n * myFun(n - 1);
  }
}
function runProgram(input) {
  // Write Code Here
  n = +input;
  let x = myFun(n);
  console.log(x);
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
