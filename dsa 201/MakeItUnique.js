// Make it Unique Ended
// Description

// You are given a string, remove all the duplicates and print the unique string.

// Input
// Input Format

// The single line consists of string S.

// Constraints

// 1<=Length of S <= 50

// Output
// Print string with no duplicate characters.

// Sample Input 1

// aaaabbbbbcccccdddd
// Sample Output 1

// abcd
// Hint

// Sample 1 Explanation

// S ="aaaabbbbbcccccdddd"

// here a, b, c and d present multiple times if more than one such occurrence is removed we will get a string with unique characters as "abcd"

function unique(n) {
  let obj = {};
  for (let i = 0; i < n.length; i++) {
    if (n[i] == " ") {
      continue;
    } else if (obj[n[i]] == undefined) {
      obj[n[i]] = 1;
    }
  }
  let temp = "";
  for (let key in obj) {
    temp += key;
  }
  console.log(temp);
}

function runProgram(input) {
  // Write Code Here
  n = input.split("");
  unique(n);
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
