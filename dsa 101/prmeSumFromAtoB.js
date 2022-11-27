// Complete the following function and use this in solving sumOfPrimeFromAToB function
function checkPrime(n) {
  // This function take single input i.e n and check whether that number is prime or not
  // if number is prime then return true otherwise false
  let count = 0;
  for (let i = 1; i <= n; i++) {
    if (n % i == 0) {
      count++;
    }
  }
  if (count == 2) {
    console.log(n, " is a prime no.");
  } else {
    console.log(n, " is not a prime no.");
  }
}

function sumOfPrimeFromAToB(A, B) {
  //Code Here
  let a = A,
    b = B;
  let sum = 0;
  for (let i = a; i <= b; i++) {
    let count = 0;
    for (let j = 1; j <= i; j++) {
      if (i % j == 0) {
        count++;
      }
    }
    if (count == 2) {
      sum += i;
      count = 0;
    }
  }
  console.log(sum);
}
checkPrime(7);
sumOfPrimeFromAToB(1, 10);
