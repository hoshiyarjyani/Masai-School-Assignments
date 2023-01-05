let matrix = [
  [0, 4, 0, 0, 0, 0, 1, 7, 9],
  [0, 0, 2, 0, 0, 8, 0, 5, 4],
  [0, 0, 6, 0, 0, 5, 0, 0, 8],
  [0, 8, 0, 0, 7, 0, 9, 1, 0],
  [0, 5, 0, 0, 9, 0, 0, 3, 0],
  [0, 1, 9, 0, 6, 0, 0, 4, 0],
  [3, 0, 0, 4, 0, 0, 7, 0, 0],
  [5, 7, 0, 1, 0, 0, 2, 0, 0],
  [9, 2, 8, 0, 0, 0, 0, 6, 0],
];

sudokuSolver(matrix, 0, 0);

function printBoard(board) {
  for (let i = 0; i < board.length; i++) {
    console.log(board[i].join(" "));
  }
}

function sudokuSolver(matrix, row, col) {
  // base case
  if (row == matrix.length) {
    printBoard(matrix);
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
