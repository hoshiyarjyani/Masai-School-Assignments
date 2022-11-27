function xEven(N, matrix) {
  // write code here
  let sum = 0;

  for (let i = 0; i < N; i++) {
    for (let j = 0; j < N; j++) {
      if (i == j) {
        sum += matrix[i][j];
      } else if (i + j == N - 1) {
        sum += matrix[i][j];
      }
    }
  }
  if (sum % 2 == 0) {
    console.log("yes");
  } else {
    console.log("no");
  }
}

xEven(3, [
  [1, 1, 1],
  [2, 2, 2],
  [4, 4, 4],
]);
