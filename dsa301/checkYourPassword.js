// Check Your Password Ended
// Description

// You are given the password of your Cryptolocker, and you have to find if the password is strong or not.

// The password contains small case English Characters, and integers between [0 - 9]
// A password is considered strong, if more than half of the characters in the password are English characters.
// Find that the password given to you, is strong or not
// Note: The length of the string will always be even

// Input
// The first line of the input containsT, the number of test cases

// The first line of each test case containsn, the length of the string

// The next line contains the string itself

// 1 <= T <= 10

// 1 <= N <= 10^6

// Output
// For each test case, printStrong, if the password is strong, else, printWeak, if the password is not strong

// Sample Input 1

// 2
// 6
// aa1234
// 6
// abcd12
// Sample Output 1

// Weak
// Strong
// Hint

// In the first test case, the password isaa1234. The number of characters in the string is 2, which is less than half the length of the string. Therefore, the password isWeak

// In the second test case, the password isabcd12. The number of characters in the string is 4, which is more than half the length of the string. Therefore, the password isStrong

function myfunction(str, n) {
  let count = 0;
  let eng = 0;
  for (let i = 0; i < n; i++) {
    if (
      str[i] == "0" ||
      str[i] == "1" ||
      str[i] == "2" ||
      str[i] == "3" ||
      str[i] == "4" ||
      str[i] == "5" ||
      str[i] == "6" ||
      str[i] == "7" ||
      str[i] == "8" ||
      str[i] == "9"
    ) {
      count++;
    } else if (
      str[i] == "a" ||
      str[i] == "b" ||
      str[i] == "c" ||
      str[i] == "d" ||
      str[i] == "e" ||
      str[i] == "f" ||
      str[i] == "g" ||
      str[i] == "h" ||
      str[i] == "i" ||
      str[i] == "j" ||
      str[i] == "k" ||
      str[i] == "l" ||
      str[i] == "m" ||
      str[i] == "n" ||
      str[i] == "o" ||
      str[i] == "p" ||
      str[i] == "q" ||
      str[i] == "r" ||
      str[i] == "s" ||
      str[i] == "t" ||
      str[i] == "u" ||
      str[i] == "v" ||
      str[i] == "w" ||
      str[i] == "x" ||
      str[i] == "y" ||
      str[i] == "z"
    ) {
      eng++;
    }
  }
  if (n == 0 || n == 1 || n == 2) {
    console.log("Weak");
  } else if (eng > n - eng && count !== 0) {
    console.log("Strong");
  } else {
    console.log("Weak");
  }
}
function runProgram(input) {
  // Write Code Here
  input = input.split("\n");
  tc = +input[0];
  line = 1;
  for (let i = 0; i < tc; i++) {
    n = +input[line];
    line++;
    str = input[line].split("");
    myfunction(str, n);
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

portalhelpdesk@bsnl.co.in


 