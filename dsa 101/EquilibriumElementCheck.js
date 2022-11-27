function equilibriumElement(N, arr) {
  //write code here
  let sum1 = 0;
  let sum2 = 0;
  for (let i = 0; i < Math.floor(N / 2); i++) {
    sum1 += arr[i];
    sum2 += arr[N - 1 - i];
  }
  if (sum1 == sum2) {
    console.log(Math.floor(N / 2)+1);
  } else {
    console.log(-1);
  }
}
equilibriumElement(5,[3,3,5,5,1]);
equilibriumElement(6,[3,3,1,5,3,3]);