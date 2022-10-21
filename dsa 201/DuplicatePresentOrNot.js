// Check duplicate -25:33:20
// Description

// Given an array of integers, check if it contains duplicate element. If present then print YES else print NO.

// Input
// 1<=T<=10

// 1<=N<=100000

// 1<=Ai<=100000

// Output
// output YES or NO as described for each test case.

// Sample Input 1

// 3
// 1
// 1
// 2
// 1 1
// 3
// 1 2 3
// Sample Output 1

// NO
// YES
// NO

function myfunction(arr, N) {
  let obj = {};
  for (let i = 0; i < N; i++) {
    if (obj[arr[i]] == undefined) {
      obj[arr[i]] = 1;
    } else {
      obj[arr[i]]++;
    }
  }
  let flag = false;
  for (let key in obj) {
    if (obj[key] > 1) {
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
    N = +input[line];
    line++;
    arr = input[line].split(" ").map(Number);
    myfunction(arr, N);
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
