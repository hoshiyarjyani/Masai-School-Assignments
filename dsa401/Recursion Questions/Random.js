function myFun(n, r) {
  if (n > 0) {
    return (n % r) + myFun(Math.floor(n / r), r);
  } else {
    return 0;
  }
}
let x = myFun(345, 10);
console.log(x);
