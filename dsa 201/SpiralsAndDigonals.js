function spirallyTraversingAMatrix(N, matrix) {
  //write code here
  let temp = "";
  let tc = N * 2 - 1;

  let lft = 0;
  let lfr = N - 1; //3
  let lfl = 0;
  let lfb = N - 1;
  let count = 0;

  while (count <= tc) {
    for (let i = lft; i < N - lft; i++) {
      temp += matrix[lft][i] + " ";
    }
    count++;
    lft++; //1
    for (let i = lft; i <= N - lft; i++) {
      temp += matrix[i][lfr] + " ";
    }
    count++;
    lfr--; //2
    for (let i = lfr; i >= lfl; i--) {
      temp += matrix[lfb][i] + " ";
    }
    count++;
    lfb--; //2

    for (let i = lfb; i >= lft; i--) {
      temp += matrix[i][lfl] + " ";
    }
    lfl++; //1
    count++;
  }
  console.log(temp.trim());
}
spirallyTraversingAMatrix(4, [
  [1, 2, 3, 4],
  [5, 6, 7, 8],
  [1, 2, 3, 4],
  [5, 6, 7, 8],
]);
