function myFun(arr, n) {
  if (n <= 0) {
    return 0;
  } else {
    return myFun(arr, n - 1) + arr[n - 1];
  }
}
let x = myFun([1, 2, 3, 4, 5], 5);
console.log(x);
