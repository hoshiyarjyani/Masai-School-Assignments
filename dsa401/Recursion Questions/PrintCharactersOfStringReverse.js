// Print Characters of a String in Reverse -74:18:56
// Description

// You are given a string, whose size is stored in a variable with the nameN

// You have to print all the characters in the string in reverse order, on a new line

// For example, consider the string stored instr = "nrupul", and the value stored inN = 6, then the required output will be

// l
// u
// p
// u
// r
// n

// Input
// The first line of the input contains the value stored inN

// The next line contains the value stored instr

// Output
// Print all the characters stored instr, in reverse order, one character per line

// Sample Input 1

// 6
// ankush
// Sample Output 1

// h
// s
// u
// k
// n
// a
// Hint

// In the sample test case, the value stored inN = 6, and the value stored instr = "ankush"

// Therefore, the required output will be

// h
// s
// u
// k
// n
// a

function printCharReverse(N, str) {
  if (N < 0) {
    return;
  }
  console.log(str[N]);
  printCharReverse(N - 1, str);
}
