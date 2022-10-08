function diamondTraversal(matrix) {
  //Write your code over here
  let temp = "";
  let n = matrix.length;
  let i = (n - 1) / 2,
    j = n - 1;
  while (i >= 0) {
    temp += matrix[i][j] + " ";
    i--;
    j--;
  }

  let k = 1,
    l = (n - 1) / 2 - 1;
  while (l >= 0) {
    temp += matrix[k][l] + " ";
    k++;
    l--;
  }

  let q = (n - 1) / 2 + 1,
    r = 1;
  while (q <= n - 1) {
    temp += matrix[q][r] + " ";
    q++;
    r++;
  }
  let s = n - 2,
    t = (n - 1) / 2 + 1;
  while (s >= (n - 1) / 2 + 1) {
    temp += matrix[s][t] + " ";
    s--;
    t++;
  }
  console.log(temp.trim());
}

diamondTraversal([
  [1, 2, 3],
  [4, 5, 6],
  [7, 8, 9],
]);
