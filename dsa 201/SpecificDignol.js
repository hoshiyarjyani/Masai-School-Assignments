function specificDiagonals(R, C, matrix, K) {
  //write code here

  let r = 0;
  let c = 0;
  for (let i = 0; i < R; i++) {
    for (let j = 0; j < C; j++) {
      if (matrix[i][j] == K) {
        r = i;
        c = j;
      }
    }
  }
  let temp = "";
  for (let i = 0; i < R; i++) {
    for (let j = 0; j < C; j++) {
      if (j - i == c - r) {
        temp += matrix[i][j] + " ";
      }
    }
  }
  console.log(temp.trim());
  let temp1 = "";
  for (let i = 0; i < R; i++) {
    for (let j = 0; j < C; j++) {
      if (i + j == r + c) {
        temp1 += matrix[i][j] + " ";
      }
    }
  }
  console.log(temp1.trim());
}

specificDiagonals(3,3,[[1,2,3],[4,5,6],[7,8,9]],6);
