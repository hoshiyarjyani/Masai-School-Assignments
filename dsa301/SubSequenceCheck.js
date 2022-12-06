// Subsequence Check Ended
// Description

// You are given two strings, string a and string b, you have to check whether string a is a subsequence of string b or not. If yes then print YES else print NO.

// Input
// Input Format

// The first line contains integer numbers N and M - the length of the string a and length of string b.

// The second line contains the string a.

// The third line contains the string b.

// Constraints

// 1 <= N <= M <= 10^5

// Output
// If the given condition is true print YES else print NO.

// Sample Input 1

// 4 6
// abcd
// aebcrd
// Sample Output 1

// YES
// Sample Input 2

// 5 7
// aaacc
// abaccac
// Sample Output 2

// NO
// Hint

// For the first sample,

// string a = abcd
// string b = aebcrd

// See a, b, c, and d all characters appear in the string b in the same order as given in string a.

// For the second sample,

// string a = aaacc
// string b = abaccac

// See going in order of characters coming in string a we can see that we can only found aaac as subsequence in b.

function myFunction(x, y, xStr, yStr) {
  let count = 0;
  let j = 0;
  for (let i = 0; i < y; i++) {
    if (xStr[j] == yStr[i]) {
      j++;
    }
  }
  if (j === x) {
    console.log("YES");
  } else {
    console.log("NO");
  }
}

function runProgram(input) {
  // Write Code Here
  input = input.split("\n");
  length = input[0].split(" ").map(Number);
  x = length[0];
  y = length[1];
  xStr = input[1].split("");
  yStr = input[2].split("");
  myFunction(x, y, xStr, yStr);
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
