// Remove duplicates -25:31:20
// Description

// Given an array of n integers, the array is sorted. You have to remove the duplicates, print only unique elements, do it in place. i.e O(1) space

// Input
// 1<=T<=10

// 1<=N<=100000

// 1<=Ai<=100000

// Output
// output a single integer x, i.e the number of unique elements in the array and in the next line print the x unique elements.

// NOTE: Do it inplace

// Sample Input 1

// 2
// 3
// 1 1 2
// 4
// 1 1 3 3
// Sample Output 1

// 2
// 1 2
// 2
// 1 3

function myfunction(n, arr) {
  let count = 0;
  let obj = {};
  for (let i = 0; i < n; i++) {
    if (obj[arr[i]] == undefined) {
      obj[arr[i]] = 1;
      count++;
    }
  }
  let temp = "";
  for (let key in obj) {
    temp += key + " ";
  }
  console.log(count);
  console.log(temp.trim());
}

function runProgram(input) {
  // Write Code Here
  input = input.split("\n");
  tc = +input[0];
  line = 1;
  for (let i = 0; i < tc; i++) {
    n = +input[line];
    line++;
    arr = input[line].split(" ").map(Number);
    myfunction(n, arr);
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
