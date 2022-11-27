// Sum less than equal to K

function solve(N, K, arr) {
  //write code here
  let sum = 0;
  for (let i = 0; i < N; i++) {
    if (arr[i] <= K) {
      sum += arr[i];
    }
  }
  console.log(sum);
}

let arr = [1, 2, 3, 4];
solve(4, 2, arr);
