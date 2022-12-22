// Characters At Odd Position -74:17:49
// Description

// You are given a string whose size is stored in a variable with the nameN, stored in a variable with the namestr

// You have to print all the characters in the string, which are present at odd indexes

// For example, consider the string stored instr = "nrupul", and the value stored inN = 6, then the output will be

// r
// p
// l
// The characters stored at odd positions arer - index 1,p - index 3,l - index 5, hence they are printed, each character on a new line
// Note : The indexing in the string starts from 0

// Input
// The first line of the input contains the value stored inN

// The next line of the input contains the value stored instr

// Output
// Print the characters at odd indexes, as shown in the problem statement, each character on a new line

// Sample Input 1

// 6
// ankush
// Sample Output 1

// n
// u
// h
// Hint

// In the sample test case, the value stored inN = 6, and the value stored instr = "ankush"

// Therefore, the characters at odd positions are

// n - 1, u - 3, h - 5
// Therefore, the output becomes

// n
// u
// h

function charAtOddPos(N, str) {
  if (N == str.length) {
    return;
  }
  //complete the rest of the function
  if (N % 2 == 1) {
    console.log(str[N]);
  }
  charAtOddPos(N + 1, str);
}
