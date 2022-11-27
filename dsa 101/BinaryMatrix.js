function binaryMatrix(N, M, matrix) {
  //write code here
  let beg = "";
  for (let i = 0; i < N; i++) {
    for (let j = 0; j < M; j++) {
      if (matrix[i][j] == 1) {
        matrix[i][j] = 0;
      } else if (matrix[i][j] == 0) {
        matrix[i][j] = 1;
      }
    }
  }
  for (let i = 0; i < N; i++) {
    for (let j = 0; j < M; j++) {
      beg += matrix[i][j] + " ";
    }
    console.log(beg);
    beg = "";
  }
}
let matrix = [
  [1, 0],
  [0, 1],
  [1, 1],
];
binaryMatrix(3, 2, matrix);
//output

// 0 1
// 1 0
// 0 0
