// Validate Team Strength Ended
// Description

// There are two teams, given an integer n and an array of 2n length, first n elements of an array represent the strength of the first team and the second n elements represent the strength of the second team, you have to take the absolute difference of the total strengths of both the array and if this difference is less than given integer k then print Valid otherwise print Invalid.

// Input
// Input Format

// The first line contains integer numbers n and integer k.

// The second-line contains 2*n integer numbers a1, a2, ... a2n — elements of the array.

// Constraints

// 1 <= n <= 10^4

// 0 <= k <= 10^4

// 1 <= a[i] <= 10^4

// Output
// If the absolute difference between the total strengths of two teams is less than or equal to k then print Valid otherwise print Invalid.

// Sample Input 1

// 3 0
// 1 2 3 4 2 1
// Sample Output 1

// Invalid
// Sample Input 2

// 3 4
// 1 8 5 9 6 1
// Sample Output 2

// Valid
// Hint

// For the first sample total strength of team 1 is 1+2+3 = 6 and the total strength of the other team is 4+2+1 = 7 and their absolute difference is (7-6) = 1 which is greater than k(=0) therefore we print Invalid.

// For the second sample total strength of team 1 is 1+8+5 = 14 and the total strength of the other team is 9+6+1 = 16 and their absolute difference is (16-14) = 2 which is less than k(=4) therefore we print Valid.
function myFunction(arr, N, K) {
  let sum1 = 0;
  let sum2 = 0;
  for (let i = 0; i < N; i++) {
    sum1 += arr[i];
    sum2 += arr[2 * N - 1 - i];
  }

  let diff = Math.abs(sum1 - sum2);
  if (diff <= K) {
    console.log("Valid");
  } else {
    console.log("Invalid");
  }
}

function runProgram(input) {
  // Write Code Here
  input = input.split("\n");
  line1 = input[0].split(" ").map(Number);
  arr = input[1].split(" ").map(Number);
  N = +line1[0];
  K = +line1[1];
  myFunction(arr, N, K);
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
