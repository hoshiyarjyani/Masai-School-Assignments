// Matrix Prime Check Ended
// Description

// In this question, you are given a 2D array stored in a variable with the namearr

// The number of rows in the matrix is stored in the variable with the nameN, while the number of columns stored in the matrix is stored in a variable with the nameM

// You have to find and print the count of prime numbers present in the matrix

// For example, consider the value stored inN = 3, andM = 3, and

// N = 3 M = 3

// arr = [[1 2 3]
//        [4 5 6]
//        [7 8 9]]
// The prime numbers in the 2D array are2,3,5,7. Therefore, the required output is 4

// Note : The 2D array may contain duplicate elements. Each instance of a prime number should be counted separately

// Input
// The first line of the input contains the values stored inNandM

// The next line contains the values stored inarr

// Output
// Print the count of prime numbers present in the matrix

// Sample Input 1

// 3 3
// 1 2 3
// 4 5 6
// 7 8 9
// Sample Output 1

// 4

function matrixPrimeCheck(N, M, arr) {
  //write code here

  var primeno = 0;
  var num = 0;
  for (let j = 0; j < N; j++) {
    for (let k = 0; k < M; k++) {
      num = arr[j][k];
      let count = 0;
      for (let i = 1; i <= num; i++) {
        if (num % i == 0) {
          count++;
        }
      }
      if (count == 2) {
        primeno++;
      }
    }
  }
  console.log(primeno);
}
let matrix = [
  [1, 2, 3],
  [4, 5, 6],
  [7, 8, 9],
];
matrixPrimeCheck(3, 3, matrix);
