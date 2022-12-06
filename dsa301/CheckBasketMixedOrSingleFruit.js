// Check Basket Ended
// Description

// Given a basketBofNfruits, find out whether the basket contains multiple types of fruits or a single type of fruit.

// Input
// Input Format:-

// The first line of input contains a single integerN, number of fruits in basket.

// The second line of input containsNspace-separated strings,B[0], B[1], .., B[N-1]

// Constraints:-

// 0 <= N <= 25

// 1 <= B[i].length <= 25

// All characters are lowercase letter.

// Output
// Output Format:-

// PrintMixed Basket, If basket contains different types of fruits Otherwise printSingle Type.

// Sample Input 1

// 3
// banana banana banana
// Sample Output 1

// Single Type
// Sample Input 2

// 4
// apple orange banana orange
// Sample Output 2

// Mixed Basket
// Hint

// TestCase 1:Only 1 type of fruit is present.

// TestCase 2:3 types of fruits are present.

function checkBasket(N, B) {
  // write code here
  let count = 0;
  for (let i = 0; i < N - 1; i++) {
    if (B[i] == B[i + 1]) {
      continue;
    } else {
      count++;
    }
  }
  if (count == 0) {
    console.log("Single Type");
  } else {
    console.log("Mixed Basket");
  }
}
