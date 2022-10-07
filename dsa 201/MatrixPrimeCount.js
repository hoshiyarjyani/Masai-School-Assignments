function matrixPrimeCheck(N, M, arr) {
  //write code here

  let primecount = 0;

  for (let i = 0; i < N; i++) {
    for (let j = 0; j < M; j++) {
      let x = arr[i][j];
      let count = 0;
      for (let i = 1; i <= x; i++) {
        if (x % i == 0) {
          count++;
        }
      }
      if (count == 2) {
        primecount++;
      }
    }
  }
  console.log(primecount);
}

let N = 3;
let M = 3;

let arr = [
  [1, 2, 3],
  [4, 5, 6],
  [7, 8, 9],
];
matrixPrimeCheck(N, M, arr);
