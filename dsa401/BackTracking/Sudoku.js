// Solve it, Provide GUI, Put on resume Ended
// Description

// Sudoku

// Sudoku is one of the most popular puzzle games of all time. The goal of Sudoku is to fill a 9×9 grid with numbers so that each row, column and 3×3 section contain all of the digits between 1 and 9.

// How to play Sudoku

// The goal of Sudoku is to fill in a 9×9 grid with digits so that each column, row, and 3×3 section contain the numbers between 1 to 9. At the beginning of the game, the 9×9 grid will have some of the squares filled in. Your job is to use logic to fill in the missing digits and complete the grid. Don’t forget, a move is incorrect if:

// Any row contains more than one of the same number from 1 to 9
// Any column contains more than one of the same number from 1 to 9
// Any 3×3 grid contains more than one of the same number from 1 to 9
// You are given a 2d array (basically 9 rows containing 9 numbers in each row). The numbers can be in the range of [0-9] (both inclusive). The presence of 0 in the matrix implies that particular cell is empty in the given sudoku.

// Write an algorithm that takes the 2d array (sudoku) in input and generates the filled sudoku in output


// Input
// The input has 9 lines and each line has 9 space separated integers between [0-9]


// Output
// Print the filled sudoku. Instead of the 0 present in the input, replace it with any other value from [1-9] that is correct for the sudoku

// **If there is no solution for the given sudoku, print -1 only**


// Sample Input 1 

// 0 4 0 0 0 0 1 7 9 
// 0 0 2 0 0 8 0 5 4 
// 0 0 6 0 0 5 0 0 8 
// 0 8 0 0 7 0 9 1 0 
// 0 5 0 0 9 0 0 3 0 
// 0 1 9 0 6 0 0 4 0 
// 3 0 0 4 0 0 7 0 0 
// 5 7 0 1 0 0 2 0 0 
// 9 2 8 0 0 0 0 6 0
// Sample Output 1

// 8 4 5 6 3 2 1 7 9 
// 7 3 2 9 1 8 6 5 4 
// 1 9 6 7 4 5 3 2 8 
// 6 8 3 5 7 4 9 1 2 
// 4 5 7 2 9 1 8 3 6 
// 2 1 9 8 6 3 5 4 7 
// 3 6 1 4 2 9 7 8 5 
// 5 7 4 1 8 6 2 9 3 
// 9 2 8 3 5 7 4 6 1 



let flag = false;
function printBoard(board) {
  for (let i = 0; i < board.length; i++) {
    console.log(board[i].join(" "));
  }
}

function sudokuSolver(matrix, row, col) {
  // base case
  if (row == matrix.length) {
    printBoard(matrix);
    flag = true;
    return;
  }

  let next_row = 0;
  let next_col = 0;

  // figuring out the next position
  if (col == matrix.length - 1) {
    next_row = row + 1;
    next_col = 0;
  } else {
    next_row = row;
    next_col = col + 1;
  }

  if (matrix[row][col] != 0) {
    sudokuSolver(matrix, next_row, next_col);
  } else {
    for (let i = 1; i <= 9; i++) {
      if (checkSafePosition(matrix, row, col, i) == true) {
        matrix[row][col] = i;
        sudokuSolver(matrix, next_row, next_col);
        matrix[row][col] = 0;
      }
    }
  }
}

function checkSafePosition(board, row, col, value) {
  // vertical check or row check
  for (let i = 0; i < 9; i++) {
    if (board[i][col] == value) return false;
  }
  // horizontal check or column check
  for (let i = 0; i < 9; i++) {
    if (board[row][i] == value) return false;
  }
  // grid check
  let x = Math.floor(row / 3) * 3;
  let y = Math.floor(col / 3) * 3;
  for (let i = x; i < x + 3; i++) {
    for (let j = y; j < y + 3; j++) {
      if (board[i][j] == value) return false;
    }
  }
  return true;
}

function runProgram(input) {
  // Write Code Here
  input = input.split("\n");
  let matrix = [];
  for (let i = 0; i < input.length; i++) {
    matrix.push(input[i].split(" ").map(Number).slice(0, 9));
  }
  let x = sudokuSolver(matrix, 0, 0);
  if (flag == false) {
    console.log(-1);
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
