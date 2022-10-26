// Reverse Array (Part - I) -80:56:22
// Description

// You are given an array, and an integer K

// You have to reverse the array from0 to K, keeping the rest of the elements in the same order

// You must not use any extra space or create a new array for the same

// Ensure you are not using any extra array to achieve this, and not directly printing it

// Input
// The first line of the input contains the value ofNandK

// The next line containsNspace separated values denoting the elements of the array

// Constraints

// 1 <= N <= 100

// 1 <= arr[i] <= 100

// Output
// Reverse the array from0 to K, and then print the array on a single line

// Sample Input 1

// 6 3
// 1 2 3 4 5 6
// Sample Output 1

// 4 3 2 1 5 6
// Hint

function myFunction(arr, N, K) {
  let temp = "";
  for (let i = 0; i <= K; i++) {
    temp += arr[K - i] + " ";
  }
  for (let i = K + 1; i < N; i++) {
    temp += arr[i] + " ";
  }
  console.log(temp.trim());
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
