// N Queens Variant -64:37:31
// Description

// The n-queens puzzle is the problem of placing n queens on an n×n chessboard such that no two queens attack each other.

// Given an integer n, print the number of distinct solutions to the n-queens puzzle.

// queens.png

// Sample figure to understand the problem.

// Input
// The first line of the input contains one integer n (1 ≤ n ≤ 10).

// Output
// Print the number of distinct solutions possible.

// Sample Input 1

// 4
// Sample Output 1

// 2
// Sample Input 2

// 1
// Sample Output 2

// 1
// Hint

// There are two distinct solutions to the 4-queens puzzle as shown below.

// [

// [".Q..",  // Solution 1

// "...Q",

// "Q...",

// "..Q."],

// ["..Q.",  // Solution 2

// "Q...",

// "...Q",

// ".Q.."]

// ]

// So the count is 2.

var count = 0;
function runProgram(input) {
  // Write Code Here
  let matrix = [];
  N = +input;
  for (let i = 0; i < N; i++) {
    let z = [];
    for (let j = 0; j < N; j++) {
      z.push(0);
    }
    matrix.push(z);
  }

  Nqueen(matrix, 0); //function call
  console.log(count);
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

function print(arr) {
  // Print Function
  for (let i = 0; i < arr.length; i++) {
    //  console.log(arr[i].join(" "));
  }
}

function Nqueen(matrix, row) {
  if (row == matrix.length) {
    print(matrix);
    count++;
    return;
  }
  for (let i = 0; i < matrix.length; i++) {
    if (checkSafe(matrix, row, i) === true) {
      matrix[row][i] = 1;
      Nqueen(matrix, row + 1);
      matrix[row][i] = 0;
    }
  }
}

function checkSafe(matrix, row, col) {
  // upward
  for (let i = row; i >= 0; i--) {
    if (matrix[i][col] == 1) {
      return false;
    }
  }
  // left upward

  for (let i = row - 1, j = col - 1; i >= 0 && j >= 0; i--, j--) {
    if (matrix[i][j] == 1) {
      return false;
    }
  }
  //right upward
  for (let i = row - 1, j = col + 1; i >= 0 && j < matrix.length; i--, j++) {
    if (matrix[i][j] == 1) {
      return false;
    }
  }
  return true;
}
