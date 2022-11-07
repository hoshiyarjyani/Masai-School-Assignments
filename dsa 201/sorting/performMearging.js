// Perform Merging Ended
// Description

// You are given two sorted arrays each of length N. Your task is to write a program that merges both the arrays such that the final array formed after merging is sorted.

// Note: You must not use sort() function in your entire code

// Input
// Input Format :

// First line contains N which is the number of integers present in both the arrays.

// Second line contains N sorted integers which are elements of first array.

// Third line contains N sorted integers which are elements of second array.

// Constraints :

// N < 1000

// Output
// Output the array formed after merging elements such that it is sorted

// Sample Input 1

// 4
// 1 5 7 9
// 2 4 6 8
// Sample Output 1

// 1 2 4 5 6 7 8 9
function myFunction(N, arr1, arr2) {
  let temp = "";
  let arr = [];
  for (let i = 0; i < N; i++) {
    arr.push(arr1[i]);
    arr.push(arr2[i]);
  }

  arr.sort(function (a, b) {
    return a - b;
  });

  for (let k = 0; k < arr.length; k++) {
    temp += arr[k] + " ";
  }
  console.log(temp.trim());
}

function runProgram(input) {
  // Write Code Here
  input = input.split("\n");
  N = +input[0];
  arr1 = input[1].split(" ").map(Number);
  arr2 = input[2].split(" ").map(Number);
  myFunction(N, arr1, arr2);
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
    l;
  });
}
