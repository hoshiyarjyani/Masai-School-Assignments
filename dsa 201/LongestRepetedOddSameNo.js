// Longest Repeated Odd Ended
// Description

// You are given an array A of N integers. Your task is to find the maximum number of times an odd number is continuously repeated in the array.

// Input
// Input Format

// First line contains N which is the number of element present in the array.

// Second line contains N integers which are the values of array.

// Constraints

// N<100

// Output
// Output Format

// Output one integer which the maximum number of times an odd number is repeated in array.

// Sample Input 1

// 12
// 1 1 1 1 2 2 2 2 2 1 1 1
// Sample Output 1

// 4
// Hint

// Sample 1 Explanation

// 1 is repeated 4 times from index 0 to index 3 => 4 times

// 2 is repeated 5 times from index 4 to index 8 => 5 times

// 1 is repeated 3 times from index 9 to index 11 => 3 times

// So, the output is 4 since 1 is odd.
function myFunction(N, arr) {
  let count = 0;
  let max = -Infinity;
  for (let i = 0; i < N; i++) {
    if (
      arr[i] % 2 == 1 &&
      (arr[i - 1] == arr[i] || arr[0] == arr[i] || arr[i - 1] % 2 == 0)
    ) {
      count++;
      if (max < count) {
        max = count;
      }
    } else {
      count = 0;
    }
  }
  if (max == -Infinity) {
    console.log(0);
  } else {
    console.log(max);
  }
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
