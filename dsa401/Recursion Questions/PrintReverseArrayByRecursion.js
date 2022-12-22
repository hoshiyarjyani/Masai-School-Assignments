// Print Reverse Array -74:8:17
// Description

// You are given a arrayarrand its sizen. You need to print all elements of array in reverse order on new line.

// Input
// First line contains N, size of array.

// Next line contains N space integers, numbers in array.

// Output
// Print all number of array in reverse order on new line.

// Sample Input 1

// 5
// 1 2 3 4 5
// Sample Output 1

// 5
// 4
// 3
// 2
// 1
// Hint

// Print all number of array in reverse order on new line.

function printReverseArray(N, arr) {
  if (N < 0) {
    return;
  }
  //complete the rest of the function. The initial value of N = arr.length-1
  console.log(arr[N]);
  printReverseArray(N - 1, arr);
}
