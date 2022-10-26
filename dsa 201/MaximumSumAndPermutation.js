// Maximum Sum & Permutation -80:32:9
// Description

// Given an array of n elements. You can arrange the elements whichever way you want to. All you need to do is to find that permutation of integers of the array in which the sum of index multiplied by arr[index] is maximum.

// Basically maximum possible value of:

// Σ arr[i] * i

// Input
// Input Format:

// First-line contains n

// Second-line contains n space-separated integers

// Constraints:

// n <= 100000

// Output
// Output the maximum sum for the given expression

// Sample Input 1

// 4
// 2 5 1 6
// Sample Output 1

// 30

function myFunction(N, arr) {
  let sum = 0;
  arr.sort(function (a, b) {
    return a - b;
  });
  for (let i = 0; i < N; i++) {
    sum += i * +arr[i];
  }
  console.log(sum);
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
  });
}
