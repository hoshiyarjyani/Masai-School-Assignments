// Traverse the array (Recursively) -74:13:6
// Description

// You are given an array, you have to traverse the array recursively

// You need not complete the function, you just need to complete the function

// Note : You need to implement a recursive function for it

// Input
// The first line of the input contains a valueNreferring to the size of the array

// The next line containsNspace separated integers denoting the values of the array

// Constraints

// 1 <=N<= 30

// 1 <=arr[i]<= 30

// Output
// Print the array elements using a recursive function

// Sample Input 1

// 5
// 1 2 3 4 5
// Sample Output 1

// 1
// 2
// 3
// 4
// 5

function printArray(index, arr) {
  if (index == arr.length) {
    return;
  }
  //complete the rest of the function
  console.log(arr[index]);
  printArray(index + 1, arr);
}
