// is it a power of 2 -81:19:37
// Description

// Given a number n, print YES if it is a power of 2 else print NO.

// Input
// 1<=T<=10

// 1<=N<=100000000

// Output
// output a single integer, the answer to the question.

// Sample Input 1

// 3
// 1
// 2
// 100
// Sample Output 1

// YES
// YES
// NO

function myfunction(n) {
  let flag = false;
  for (let i = 0; i < 100; i++) {
    if (2 ** i == n) {
      flag = true;
      break;
    }
  }
  if (flag) {
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
    n = +input[line];
    line++;
    myfunction(n);
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
