// Character At Even Position -74:16:13
// Description

// You are given a string whose size is stored in a variable with the nameN, stored in a variable with the namestr

// You have to print all the characters in the string, which are present at even indexes

// For example, consider the string stored instr = "nrupul", and the value stored inN = 6, then the output will be

// n
// u
// u

// The characters stored at odd positions aren - index 0,u - index 2,l - index 4, hence they are printed, each character on a new line
// Note : The indexing in the string starts from 0

// Input
// The first line of the input contains the value stored inN

// The next line of the input contains the value stored instr

// Output
// Print the characters at even indexes, as shown in the problem statement, each character on a new line

// Sample Input 1

// 6
// ankush
// Sample Output 1

// a
// k
// s
// Hint

// In the sample test case, the value stored inN = 6, and the value stored instr = "ankush"

// Therefore, the characters at even positions are

// a - 0, k - 2, s - 4

// Therefore, the output becomes

// a
// k
// s

function charAtEvenPos(N, str) {
  //complete the recursive function here. The initial value of N = 0;
  if (N == str.length) return;
  if (N % 2 == 0) console.log(str[N]);
  charAtEvenPos(N + 1, str);
}
