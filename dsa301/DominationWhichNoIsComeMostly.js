// Domination Ended
// Description

// At masai we say that a number is dominating in an array if it appears in the array most number of times, i.e. the count of this number in this array if greater than all others in the array.

// You are given an array of size n.

// If there exists a dominating number in the array output YES else NO

// Input
// Input Format
// The first line of input will contain a single integer T, denoting the number of test cases.

// Each test case consists of a two lines of input.

// The first line of each test case contains an integer n — the size of the array.

// The second line of each testcase contains n space separated integers, denoting the elements of the array.

// Constraints
// 1 <= T <= 100

// 1 <= N <= 10^5

// 1 <= elements of array <= 10^7

// Output
// Output Format
// If there exists a dominating number in the array output YES else NO

// Sample Input 1

// 2
// 5
// 1 2 2 2 2
// 5
// 1 2 2 3 3
// Sample Output 1

// YES
// NO
// Hint

// Test case 1: 2 is the dominant element.

// Test case 2: There does not exist any dominant element.

function myfunction(n, arr) {
  let obj = {};
  for (let i = 0; i < n; i++) {
    if (obj[arr[i]] == undefined) {
      obj[arr[i]] = 1;
    } else {
      obj[arr[i]]++;
    }
  }
  let arr1 = [];
  for (let key in obj) {
    arr1.push(obj[key]);
  }
  arr1.sort(function (a, b) {
    return b - a;
  });
  if (arr1[0] > arr1[1]) {
    console.log("YES");
  } else {
    console.log("NO");
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
    arr = input[line].split(" ").map(Number);
    myfunction(n, arr);
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
