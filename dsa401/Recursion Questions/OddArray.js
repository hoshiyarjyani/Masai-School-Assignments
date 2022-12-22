// Odd Array -74:25:24
// Description

// You are given an array, stored in a variable with the sizearr

// The size of the array is stored in a variable with the namen

// You have to traverse the array, and print only the odd elements in the array.

// Print each number on a new line

// For example, consider the array asarr = [1 2 3 4 5], and the value stored inn = 5

// Then, the required output will be

// 1
// 3
// 5

// The above are the odd numbers in the given array

// Input
// The first line of the input contains the value stored inN, the size of the array

// The next line containsNspace separated numbers denoting the elements of the array

// Output
// Print the odd elements present in the array, as explained in the problem statement

// Sample Input 1

// 5
// 1 2 3 4 5
// Sample Output 1

// 1
// 3
// 5
// Hint

// In the sample test case, the value stored inn = 5and the value stored inarr = [1 2 3 4 5]

// The odd numbers in the array are1 3 5

// Therefore, the output will be

// 1
// 3
// 5

function oddArray(n, arr) {
  if (n == arr.length) {
    return;
  }
  // complete the rest of the function. The inital value of n = 0
  if (arr[n] % 2 == 1) {
    console.log(arr[n]);
  }
  oddArray(n + 1, arr);
}
