// Rotate By 90 Ended
// Description

// Given a squarematrixof sizeN, turn it by 90 degrees in an anti-clockwise direction, as shown in sample input.

// Input
// Input Format

// First line will contain the number of rows N (same as the number of columns)

// After that next N lines will N rows of the matrix.

// Constraints

// 1 <= N <=1000

// 1 <= Elements Of the Matrix <= 10000

// Output
// You have to display therotated matrix.

// Sample Input 1

// 4
// 1 2 3 4
// 5 6 7 8
// 1 2 3 4
// 5 6 7 8
// Sample Output 1

// 4 8 4 8
// 3 7 3 7
// 2 6 2 6
// 1 5 1 5

function rotateBy90(R, matrix) {
  //write code here
  let temp = "";
  for (let i = 0; i < R; i++) {
    for (let j = 0; j < R; j++) {
      temp += matrix[j][R - 1 - i] + " ";
    }
    console.log(temp.trim());
    temp = "";
  }
}
