// Sum without borders Ended
// Description

// You are given a matrix of size n x m. Find the sum of all the elements of the matrix which do not lie at the border.

// Input
// The first line contains T, the number of test cases. The first line of each test case contains n and m, the matrix dimensions.

// Each of the next n lines contain m space separated integers, denoting the values of the matrix.

// Constraints

// 1 <= T <= 10

// 1 <= n,m <= 1000

// 1 <= a[i][j] <= 1000

// Output
// Print a single integer, denoting the sum of all the elements of the matrix, which do not lie on the border, on a new line.

// Sample Input 1

// 1
// 3 3
// 1 2 3
// 4 5 6
// 7 8 9
// Sample Output 1

// 5
// Hint

// In the sample test case, except for 5 all the elements lie on the border. Therefore, the required sum is 5.

function sumWithoutBorders(N, M, matrix) {
  //write code here
  let sum = 0;
  for (let i = 0; i < N; i++) {
    for (let j = 0; j < M; j++) {
      if (i !== 0 && j !== 0 && i !== N - 1 && j !== M - 1) {
        sum += matrix[i][j];
      }
    }
  }
  console.log(sum);
}
sumWithoutBorders(3, 3, [
  [1, 2, 3],
  [4, 5, 6],
  [7, 8, 9],
]);
