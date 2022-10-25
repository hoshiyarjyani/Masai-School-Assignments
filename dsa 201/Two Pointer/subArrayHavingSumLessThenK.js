// Subarrays Having Sum Less Than M Ended
// Description

// Given an array A of size n with positive numbers, find the total number of subarrays that have sum < m.

// Input
// The first line of the input contains one integer t (1 ≤ t ≤ 10) — the number of test cases. Then t test cases follow.

// The first line of each test case contains a single integer n (1 ≤ n ≤ 100000) and M as mentioned in the question.

// The second line of the test case contains n integers (1 ≤ Ai ≤ 100).

// Output
// For each test case, print the answer: The number of subarrays.

// Sample Input 1

// 1
// 5 5
// 1 5 1 3 2
// Sample Output 1

// 5

function myfunction(arr, n, k) {
  let sum = arr[0];
  let high = 0;
  let low = 0;
  let count = 0;

  while (high < n && low < n) {
    if (sum < k) {
      high++;
      if (high > low) {
        count += high - low;
      }
      if (high < n) {
        sum += arr[high];
      }
    } else {
      sum -= arr[low];
      low++;
    }
  }

  console.log(count);
}

function runProgram(input) {
  // Write Code Here
  input = input.split("\n");
  tc = +input[0];
  line = 1;
  for (let i = 0; i < tc; i++) {
    size = input[line].split(" ").map(Number);
    line++;
    n = +size[0];
    k = +size[1];
    arr = input[line].split(" ").map(Number);
    myfunction(arr, n, k);
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
