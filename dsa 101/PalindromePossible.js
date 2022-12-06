// Possible Palindrome -0:29:42
// Description

// Given a strings, returntrueif a permutation of the string could form a palindrome.

// Input
// Input Format

// The first line contains the number of testcases T

// Each testcase contains a string S

// Constraints

// 1<= length of S <= 10^5

// 1<=T<=10

// Output
// Print "Yes" if a permutation of S can be palindrome, else print "No"

// Sample Input 1

// 1
// carerca
// Sample Output 1

// Yes
// Hint

function myfunction(str) {
  let N = str.length;
  let obj = {};
  for (let i = 0; i < N; i++) {
    if (obj[str[i]] == undefined) {
      obj[str[i]] = 1;
    } else {
      obj[str[i]]++;
    }
  }
  let odd = 0;
  let even = 0;
  for (let key in obj) {
    if (obj[key] % 2 == 1) {
      odd++;
    } else {
      even++;
    }
  }

  if (N % 2 == 0 && odd == 0) {
    console.log("Yes");
  } else if (N % 2 == 1 && odd == 1) {
    console.log("Yes");
  } else {
    console.log("No");
  }
}
function runProgram(input) {
  // Write Code Here
  input = input.split("\n");
  tc = +input[0];
  line = 1;
  for (let i = 0; i < tc; i++) {
    str = input[line].split("");
    line++;
    myfunction(str);
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
