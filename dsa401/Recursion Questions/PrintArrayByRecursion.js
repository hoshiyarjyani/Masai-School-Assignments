// Print Array -74:10:35
// Description

// You are given an array, whose size is stored in a variable of sizen

// The array is stored in a variable with the name,arr

// You have to traverse the array, and print each element on a new line

// For example, the value stored inN = 5, and the array isarr = [1 2 3 4 5]

// Therefore, the required output will be

// 1
// 2
// 3
// 4
// 5

// Input
// The first First line containsN, size of array.

// Next line contains N space integers, which denote the numbers present in the array

// Output
// Print all number of array on new line.

// Sample Input 1

// 5
// 1 2 3 4 5
// Sample Output 1

// 1
// 2
// 3
// 4
// 5

function printArray(N, arr) {
  if (N == arr.length) {
    return;
  }
  console.log(arr[N]);
  printArray(N + 1, arr);
}
