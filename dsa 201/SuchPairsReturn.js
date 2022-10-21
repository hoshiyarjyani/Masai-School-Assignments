// Such Pair Returns -25:24:50
// Description

// For each test case, you are given N integers and K, your task is to write a program that prints "1" (without quotes) if there are 2 integers present in the array whose sum is K. Else print "-1" (without quotes).

// Input
// 10^6Input Format :

// First line contains T, no of test cases.

// First line of each test case contains 2 space separated integers: N & K

// Second line of each test case contains **N** space separated integers

// Constraints :

// 1 <= T <= 10

// 1 <= N <=1000000

// 1 <= abs(A[i]) <=10^6<= abs(K) <= 2*10^6

// Output
// Output 1/-1 depending on the condition for each test case on new line

// Sample Input 1

// 1
// 5 2
// 3 4 0 2 7
// Sample Output 1

// 1

function myfunction(n, k, arr) {
  let newarr = arr.sort(function (a, b) {
    return a - b;
  });

  let flag = false;
  let i = 0;
  let j = n - 1;
  while (i < j) {
    if (newarr[i] + newarr[j] == k) {
      flag = true;
      break;
    } else if (newarr[i] + newarr[j] > k) {
      j--;
    } else {
      i++;
    }
  }
  if (flag) {
    console.log(1);
  } else {
    console.log(-1);
  }
}

function runProgram(input) {
  // Write Code Here
  input = input.split("\n");
  tc = +input[0];
  line = 1;
  for (let i = 0; i < tc; i++) {
    size = input[line].split(" ").map(Number);
    n = +size[0];
    k = +size[1];
    line++;
    arr = input[line].split(" ").map(Number);
    myfunction(n, k, arr);
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
