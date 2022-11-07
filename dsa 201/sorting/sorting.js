// Bubble sort Ended
// Description

// Consider the following version of Bubble Sort:

//     for (int i = 0; i < n; i++) {
//         for (int j = 0; j < n - 1; j++) {
//             if (a[j] > a[j + 1]) {
//                 swap(a[j], a[j + 1]);
//             }
//         }
//     }
// Given an array of integers, sort the array in ascending order using the Bubble Sort algorithm above. Once sorted, print the following three lines:

// Array is sorted in numSwaps swaps, wherenumSwapsis the number of swaps that took place.

// First Element: firstElement, wherefirstElementis the first element in the sorted array.

// Last Element: lastElement, wherelastElementis the last element in the sorted array.

// Input
// Input Format
// The first line contains an integer,n, the size of the arraya.

// The second line containsnspace-separated integersai.

// Constraints
// 2 <= n <= 600

// 1 <= a[i] <= 2*10^6

// Output
// Output Format
// Print the three lines required

// Sample Input 1

// 3
// 3 2 1
// Sample Output 1

// Array is sorted in 3 swaps
// First Element: 1
// Last Element: 3
// Hint

// Capture.PNG

// Language:

function bubblesort(N, arr) {
  let count = 0;
  for (let i = 0; i < N - 1; i++) {
    for (let j = 0; j < N - i - 1; j++) {
      if (arr[j] > arr[j + 1]) {
        // swap the numbers
        let temp = arr[j];
        arr[j] = arr[j + 1];
        arr[j + 1] = temp;
        count++;
      }
    }
  }
  console.log("Array is sorted in " + count + " swaps");
  console.log("First Element: " + arr[0]);
  console.log("Last Element: " + arr[N - 1]);
}

function runProgram(input) {
  // Write Code Here
  input = input.split("\n");
  N = +input[0];
  arr = input[1].split(" ").map(Number);
  bubblesort(N, arr);
}
if (process.env.USERNAME === "") {
  runProgram(``);
} else {
  process.stdin.resume();
  process.stdin.setEncoding("ascii");
  let read = "";
  process.stdin.on("data", function (input) {
    read += input;
  });
  process.stdin.on("end", function () {
    read = read.replace(/\n$/, "");
    read = read.replace(/\n$/, "");
    runProgram(read);
  });
  process.on("SIGINT", function () {
    read = read.replace(/\n$/, "");
    runProgram(read);
    process.exit(0);
    l;
  });
}
