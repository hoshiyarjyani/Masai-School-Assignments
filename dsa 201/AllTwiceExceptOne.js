// All Twice Except One Ended
// Description

// Given an array A of n elements, every element appears twice in the array except for one element. Find the element that is uniquely present in the array.

// In other words, there is one value that has a frequency of 1 whereas the rest has a frequency of 2. Find that particular element.

// Added Constraint -> Do in O(1) auxiliary space and linear time complexity.

// Input
// The first line of the input contains one integer t (1 ≤ t ≤ 10) — the number of test cases. Then t test cases follow.

// The first line of each test case contains a single integer n (1 ≤ n ≤ 100000) — the size of the array A.

// The second line of each test case contains n integers (1 ≤ n ≤ 100000) - The elements of the array A.

// Output
// For each test case, print the answer: The unique element.

// Sample Input 1

// 2
// 1
// 5
// 5
// 1 2 1 3 2
// Sample Output 1

// 5
// 3

function myfunction(size, str) {
  let obj = {};
  for (let i = 0; i < size; i++) {
    if (obj[str[i]] == undefined) {
      obj[str[i]] = 1;
    } else {
      obj[str[i]]++;
    }
  }
  for (let key in obj) {
    if (obj[key] == 1) {
      console.log(key);
    }
  }
}

function runProgram(input) {
  // Write Code Here
  input = input.split("\n");
  tc = +input[0];
  line = 1;
  for (let i = 0; i < tc; i++) {
    size = +input[line];
    line++;
    str = input[line].split(" ").map(Number);
    myfunction(size, str);
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
