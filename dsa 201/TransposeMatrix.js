function transposeTheMatrix(N, M, matrix) {
  //write code here
  let str = "";
  for (let i = 0; i < M; i++) {
    for (let j = 0; j < N; j++) {
      str += matrix[j][i] + " ";
    }
    console.log(str.trim());
    str = "";
  }
}
// Sample Input 1 

// 5 4
// 0 0 0 0
// 1 1 1 1
// 2 2 2 2
// 3 3 3 3
// 4 4 4 4
// Sample Output 1

// 0 1 2 3 4 
// 0 1 2 3 4 
// 0 1 2 3 4 
// 0 1 2 3 4 