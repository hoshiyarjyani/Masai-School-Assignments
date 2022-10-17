// Rotate by 180 Ended
// Description

// You are given a square matrix of size N x N. Rotate the matrix by 180 degrees.

// Input
// The first line of the input contains T, the number of test cases.

// The next line contains N, the size of the square matrix.

// The next N lines contain N space separated integers, denoting the values of the matrix.

// Constraints

// 1 <= T <= 10

// 1 <= N <=50

// 1 <= A[i][j] <= 100

// Output
// For each test case, print the matrix after rotating 180 degrees, and print in the form as shown in the sample output.

// Sample Input 1

// 2
// 3
// 1 2 3
// 4 5 6
// 7 8 9
// 4
// 1 2 3 4
// 5 6 7 8
// 9 0 1 2
// 3 4 5 6
// Sample Output 1

// 9 8 7
// 6 5 4
// 3 2 1
// 6 5 4 3
// 2 1 0 9
// 8 7 6 5
// 4 3 2 1
// Hint

// In the sample test cases, the matrices have been rotated by 180 degrees.

function rotateBy180(N, matrix) {
  //write code here
  let temp = "";
  for (let i = 0; i < N; i++) {
    for (let j = 0; j < N; j++) {
      temp += matrix[N - 1 - i][N - 1 - j] + " ";
    }
    console.log(temp.trim());
    temp = "";
  }
}
