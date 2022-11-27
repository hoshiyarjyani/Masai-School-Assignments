// Cards and Values Ended
// Description

// Chunnu has a collection of cards. Each card has a value assigned to it. He wants to check if there exist two cardsNandMsuch thatNis double the value ofM(i.eN = 2 * M).

// Print "Yes" without quotes, if a solution exists, else print "No" without quotes.

// The value of all the cards are stored in an array (arr) or lengthx.

// Input
// The first and the only line contains the value of all the cards


// Output
// Print "Yes" without quotes if the solution exists, else print "No" without quotes.


// Sample Input 1 

// 4
// 1 2 3 4
// Sample Output 1

// Yes
// Sample Input 2 

// 5
// 5 0 9 7 20
// Sample Output 2

// No
// Hint

// In sample1,arr=[1, 2, 3, 4]

// N=4is double the value ofM=2, hence the output is "Yes"
// In sample2,arr=[5, 0, 9, 7, 20]

// Here we cannot find N or M such thatN = M * 2, hence the output is "No"

function cardvalues(x, arr) {
  // write code here
  let flag = false;
  for (let i = 0; i < x; i++) {
    for (let j = i + 1; j <= x; j++) {
      if (arr[i] === arr[j] * 2 || arr[i] === arr[j] / 2) {
        flag = true;
      }
    }
  }
  if (flag == true) {
    console.log("Yes");
  } else {
    console.log("No");
  }
}
cardvalues(4, [1, 3, 6, 7]);
