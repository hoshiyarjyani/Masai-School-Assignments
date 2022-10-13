function goInZigZag(N, M, matrix) {
  //write code here
  let temp = "";
  for (let i = 0; i < N; i++) {
    for (let j = 0; j < M; j++) {
      if (i % 2 == 0) {
        temp += matrix[i][M - 1 - j] + " ";
      } else {
        temp += matrix[i][j] + " ";
      }
    }
  }
  console.log(temp.trim());
}
// Output
// Print all matrix elements in a single line separated by spaces.


// Sample Input 1 

// 5 5
// 4 7 1 1 7
// 8 9 9 6 1
// 6 4 9 5 1
// 7 7 4 7 7
// 8 6 2 5 5
// Sample Output 1

// 7 1 1 7 4 8 9 9 6 1 1 5 9 4 6 7 7 4 7 7 5 5 2 6 8