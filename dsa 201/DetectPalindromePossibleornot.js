// Detect Palindrome II Ended
// Description

// You are given a string S. Find if the string, can be converted into a palindrome.

// You are free to rearrange the string in any way you want. Rearrangement refers to the fact that the characters can be arranged in any way in the string.

// Deletion or addition of characters is not allowed.

// Input
// The first line contains T, the number of test cases.

// The first line of each test case contains N, the length of the string.

// The next line contains the string.

// Constraints

// 1 <= T <= 10

// 1 <= N <= 100

// Output
// If the string can be rearranged into a palindrome, print "Possible!", else print "Not Possible!".

// Sample Input 1

// 2
// 6
// aabbcc
// 5
// aabcd
// Sample Output 1

// Possible!
// Not Possible!
// Hint

// In the first sample test case, the string can be rearranged as "acbbca", which is a palindrome.

// In the second sample test case, the string cannot be rearranged into a palindrome.

function pallindrome(N, S) {
  // Write your code here!
  let obj = {};
  for (let i = 0; i < N; i++) {
    if (obj[S[i]] == undefined) {
      obj[S[i]] = 1;
    } else {
      obj[S[i]]++;
    }
  }
  let arr = [];
  for (let key in obj) {
    arr.push(obj[key]);
  }
  countodd = 0;
  counteven = 0;
  for (let i = 0; i < arr.length; i++) {
    if (arr[i] % 2 == 0) {
      counteven++;
    } else {
      countodd++;
    }
  }
  if (countodd == 1 && counteven >= 0) {
    console.log("Possible!");
  } else if (countodd > 1) {
    console.log("Not Possible!");
  } else if (counteven > 0) {
    console.log("Possible!");
  } else if (countodd == 1) {
    console.log("Possible!");
  }
}
pallindrome(6, "aabbcc");

pallindrome(5, "aadbc");
