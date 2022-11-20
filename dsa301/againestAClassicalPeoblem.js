// Again a classical problem -0:11:1
// Description

// A bracket is considered to be any one of the following characters: (, ), {, }, [, or ].

// Two brackets are considered to be a matched pair if the opening bracket (i.e., (, [, or {) occurs to the left of a closing bracket (i.e., ), ], or }) of the exact same type. There are three types of matched pairs of brackets: [], {}, and ().

// A matching pair of brackets is not balanced if the set of brackets it encloses are not matched. For example, {[(])} is not balanced because the contents in between { and } are not balanced. The pair of square brackets enclose a single, unbalanced opening bracket, (, and the pair of parentheses encloses a single, unbalanced closing square bracket, ].

// By this logic, we say a sequence of brackets is balanced if the following conditions are met:

// It contains no unmatched brackets.

// The subset of brackets enclosed within the confines of a matched pair of brackets is also a matched pair of brackets.

// Given a string, you have to comment if it is balanced or not

// Input
// Input Format

// First line of input contains t which is the number of test cases present in the question

// Each test case has a string

// Constraints

// t < 100

// length of string < 100

// Output
// Print "balanced" if the string is balanced, otherwise print "not balanced" in case the string is not balanced

// Sample Input 1

// 3
// {([])}
// ()
// ([]
// Sample Output 1

// balanced
// balanced
// not balanced

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
      } else {
        flag = false;
      }
    }
  }
  if (stack.length === 0 && flag) {
    console.log("balanced");
  } else {
    console.log("not balanced");
  }
}
function runProgram(input) {
  // Write Code Here
  input = input.split("\n");
  tc = +input[0];
  line = 1;
  for (let i = 0; i < tc; i++) {
    str = input[line];
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
