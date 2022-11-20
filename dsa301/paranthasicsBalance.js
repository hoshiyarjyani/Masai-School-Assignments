// Strings with Parenthesis -0:2:8
// Description

// Given a string containing three types of parenthesis : (), [], {}, write a program to check whether the string contains a valid sequence of parentheses.

// Input
// Input Format

// Input contains one line which is the string with parentheses whose validity you have to check

// Constraints

// length of string <= 1000

// Output
// Output Format

// Print "balanced" (without quotes) if it has a sequence of valid parentheses, otherwise print "unbalanced" (without quotes)

// Sample Input 1

// (((((((((())))))))))
// Sample Output 1

// balanced
// Sample Input 2

// [one[two[three[four[five[six[seven[eight[nine[ten]]]]]]]]]]
// Sample Output 2

// balanced

function myfunction(str) {
  let flag = true;
  let stack = [];
  for (let i = 0; i < str.length; i++) {
    if (stack.length !== 0 && stack[stack.length - 1] == str[i]) {
      stack.pop();
    } else {
      if (str[i] == "[") {
        stack.push("]");
      } else if (str[i] == "(") {
        stack.push(")");
      } else if (str[i] == "{") {
        stack.push("}");
      } else if (str[i] == ")" || str[i] == "}" || str[i] == "]") {
        flag = false;
      }
    }
  }
  if (stack.length === 0 && flag) {
    console.log("balanced");
  } else {
    console.log("unbalanced");
  }
}
function runProgram(input) {
  // Write Code Here
  str = input;
  myfunction(str);
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
