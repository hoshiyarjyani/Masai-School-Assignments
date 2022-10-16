// Count vowels Ended
// Description

// Given a 2D array with N rows and M columns containing lowercase alphabets. Given a pattern containing the array elements in V shape, starting from the top right corner and ending up at the bottom right corner as given below:

// prob2.png

// Calculate the number of vowels that are contained in the V shape.

// Note - Assume 1-based indexing.

// Input
// First line: Single integer denoting the value of T - the number of test cases.

// For each test case:

// First line: Two single space-separated integers denoting the value of N and M.

// N lines follow:

// Each of the lines consists of M single space-separated characters, denoting a row of a matrix.

// Constraints:

// 1 <= T <= 100
// 1 <= N,M <= 100

// Output
// For each test case, print in a new line, a single integer denoting the number of vowels that are contained in the V shape. If it is not possible to traverse the V shape, print -1.

// Sample Input 1

// 2
// 3 2
// a a
// b b
// c c
// 2 2
// a a
// b b
// Sample Output 1

// 1
// -1
// Hint

// You are to print the sum of elements of matrix which are at following positions:

// (1,M),(2,M-1),(3,M-2), ........, (M-1,2), (M,1), (M+1,2),(M+2,3), ......, (N,M).

// Given test cases,

// Test 1:
// N = 3, M = 2, and given 2D array:

// a a
// b b
// c c

// Elements at required positions:
// (1,2) - a, (2,1) - b, (3,2) - c.
// Hence the number of vowels is 1.

// Test 2:
// Elements at required positions:
// (1,2) - a, (2,1) - b.
// There are no elements to be traversed further, hence you can't reach the bottom right corner of the array. Hence the answer is -1.F
function myfunction(N, M, arr) {
  if (M * 2 - 1 == N) {
    let count = 0;

    let i = 0;
    let j = M - 1;
    for (let i = 0; i < Math.floor(N / 2); i++) {
      if (
        arr[i][j] == "a" ||
        arr[i][j] == "e" ||
        arr[i][j] == "i" ||
        arr[i][j] == "o" ||
        arr[i][j] == "u"
      ) {
        count++;
      }
      j--;
    }
    for (let i = Math.floor(N / 2); i < N; i++) {
      if (
        arr[i][j] == "a" ||
        arr[i][j] == "e" ||
        arr[i][j] == "i" ||
        arr[i][j] == "o" ||
        arr[i][j] == "u"
      ) {
        count++;
      }
      j++;
    }
    console.log(count);
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
    N = +size[0];
    M = +size[1];
    var arr = [];
    line++; //2
    for (let j = line; j < line + N; j++) {
      arr.push(input[j].split(" "));
    }
    line += N;
    myfunction(N, M, arr);
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
