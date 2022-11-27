// Dhoni Fan

// Description
// Alex is a huge Dhoni Fan, so naturally he loves the number 7. He has an arrayarrof sizeN, so he wants to find the count of all the subarrays which contain the number 7 at least once. Help him, find all such subarrays.
// Input
// The first line containsN, the size of the array.

// Next line contains N space separated integers, denoting the arrayarr.
// Constraints

// 1 <= N <= 100

// 1 <= A[i] <= 100

// Output
// Print a single integer denoting the count of all the subarrays which contain at least one 7 within them.

// Sample Input 1

// 3
// 1 2 7

// Sample Output 1

// 3
// Hint

// In the sample test case, all the subarrays of the given array are

// [1]

// [1, 2]

// [1, 2, 7]

// [2]

// [2, 7]

// [7]

// Three of the subarrays contain one 7 [1,2,7] , [2,7], [7]. Therefore, the output is 3.

function dhoniFan(N, arr) {
  //write code here
  let count = 0;
  for (let i = 0; i < N; i++) {
    let temp = [];
    for (let j = i; j < N; j++) {
      temp.push(arr[j]);
      for (let k = 0; k < temp.length; k++) {
        if (temp[k] == 7) {
          count++;
          break;
        }
      }
    }
  }
  console.log(count);
}
dhoniFan(3, [1, 2, 7]);
