// Circular Traversal -23:44:31
// Description

// Given a square matrix, you have to find the reverse U traversal of the matrix. Refer the sample I/O for better understanding. Refer the given figure for better understanding.

// note- : No element should be visited more than once.

// Image

// Input
// The first line of the input contains T, the number of test cases.

// The next line contains N, the size of the square matrix.

// The next N lines contains N space separated integers each denoting the values of the matrix.

// Constraints

// 1 <= T <= 10

// 1 <= N <= 50

// 1 <= A[i][j] <= 50

// Output
// For each test case, print the elements that lie on the reverse U traversal, on a single line, on a new line.

// Sample Input 1

// 1
// 3
// 1 2 3
// 4 5 6
// 7 8 9
// Sample Output 1

// 7 4 1 2 3 6 9 8

function cirTraversal(matrix, N) {
  //bottom left to top left
  let temp = "";
  for (let i = N - 1; i >= 0; i--) {
    for (let j = 0; j < N; j++) {
      if (j == 0) {
        temp += matrix[i][j] + " ";
      }
    }
  }

  //top left - top right
  for (let i = 0; i < 1; i++) {
    for (let j = 1; j < N; j++) {
      temp += matrix[i][j] + " ";
    }
  }
//top right - bottom right
  for (let i = 1; i < N; i++) {
    for (let j = 0; j < N; j++) {
      if (j == N - 1) {
        temp += matrix[i][j] + " ";
      }
    }
  }
//bottom right - bottom left

  for (let i = N - 1; i > 0; i--) {
    for (let j = N - 2; j > 0; j--) {
      if (i == N - 1) {
        temp += matrix[i][j] + " ";
      }
    }
  }
  console.log(temp);
}

cirTraversal(
  [
    [1, 2, 3],
    [4, 5, 6],
    [7, 8, 9],
  ],
  3
);
