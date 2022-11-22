// Two Primes Ended
// Description

// You are given two numbers, stored in variables with the following namesa, b

// If both the numbers are prime, printTrue, else printFalse

// Input
// The first and the only line of input contains the value stored ina, brespectively

// Output
// Print the output as explained in the problem statement

// Sample Input 1

// 11 17
// Sample Output 1

// True
// Hint

// In the sample test case, the value stored ina = 11, and the value stored inb = 17. Since, both the numbers are prime, we printTrue

function twoPrimes(a, b) {
  //write code here
  let count = 0;
  for (let i = 1; i <= a; i++) {
    if (a % i == 0) {
      count++;
    }
  }
  let counts = 0;
  for (let j = 1; j <= b; j++) {
    if (b % j == 0) {
      counts++;
    }
  }
  if (count == 2 && counts == 2) {
    console.log("True");
  } else {
    console.log("False");
  }
}
