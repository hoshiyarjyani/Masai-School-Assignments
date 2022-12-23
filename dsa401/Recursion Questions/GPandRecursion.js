// GP & Recursion -45:57:53
// Description

// Now that you have learnt about geometric progression in Masai School pre-course, we hope you remember about the sum of a geometric series:

// Assume, you are given

// S = 1 + (1/r) + (1/r^2) + (1/r^3) +... (1/r^n)

// You will be given two integers n and r

// Your task is to calculate the sum S by writing a recursive function

// Using iterative approach or formula to calculate the sum can lead to disqualification directly

// Input
// Input Format

// First line of input contains space separated numbers n and r respectively

// Constraints

// n <= 1000

// r <= 10

// Output
// Output till 4 places after the decimal. For instance, 12.1345 is a valid answer but 12.43138 is not. 12.0000 is also a valid answer

// Sample Input 1

// 1 1
// Sample Output 1

// 2.0000
// Sample Input 2

// 3 5
// Sample Output 2

// 1.2480

let S = 1;
function myFun(index, n, r) {
  if (index > n) {
    console.log(S.toFixed(4));
    return;
  } else {
    let a = Math.pow(r, index);
    S += 1 / a;
  }
  myFun(index + 1, n, r);
}

function runProgram(input) {
  // Write Code Here
  k = input;
  let index = 1;
  let sarpanch = k.split(" ").map(Number);
  let n = sarpanch[0];
  let r = sarpanch[1];
  myFun(index, n, r);
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
