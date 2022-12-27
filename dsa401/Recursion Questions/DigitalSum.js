function DigitalSum(num) {
  if (num / 10 == 0) {
    return num;
  } else {
    return (num % 10) + DigitalSum(Math.floor(num / 10));
  }
}
let ans = DigitalSum(12345);
if (ans > 9) {
  let z = DigitalSum(ans);
  console.log(z);
} else {
  console.log(ans);
}
