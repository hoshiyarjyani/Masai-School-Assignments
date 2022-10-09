// Binary String 1 Ended
// Description

// You are given a string stored in a variable with the namestr, whose length is stored in a variable with the nameN

// The string is binary, which means it contains only 1's and 0's

// You have to find the length of the longest substring which contains only 0's

// For example, consider the value stored inN = 4, andstr = 1001

// All the non empty subarrays of the given string are

// 1
// 10
// 100
// 1001
// 0
// 00
// 001
// 0
// 01
// 1
// The longest substring containing only 0's is00, therefore, the required output is2

// Input
// The first line of the input contains the value stored inN

// The second line contains the value stored instr

// Output
// Print a single integer denoting the length of the longest substring containing only 0's

// Sample Input 1

// 7
// 1000100
// Sample Output 1

// 3
// Sample Input 2

// 11
// 01010010111
// Sample Output 2

// 2
// Hint

// In the first sample test case, the value stored inN = 7, andstr = 1000100. The longest substring having all 0's is000, whose length is 3. Therefore, the required output is 3

// In the second sample test case, the value stored inN = 11, andstr = 01010010111. The longest substring containing only 0's is00, whose length is 2. Therefore, the required output is 2

// Sample Input 1

// 7
// 1000100
//Output = 3
function BinaryString(str, N) {
  let max = 0;
  for (let i = 0; i < N; i++) {
    let temp = "";
    for (let j = i; j < N; j++) {
      temp += str[j];
      let count0 = 0;
      for (let k = 0; k < temp.length; k++) {
        if (temp[k] == 0) {
          count0++;
          if (max < count0) {
            max = count0;
          }
        } else {
          count0 = 0;
          break;
        }
      }
    }
  }
  console.log(max);
}
BinaryString("01010010111", 11);
