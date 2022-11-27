// Flower Management
// Description

// You have a long flowerbed in which some of the plots are planted, and some are not. However, flowers cannot be planted in adjacent plots.

// Given an integer arrayflowerbedof lengthNcontaining0's and1's, where0means empty and1means not empty, and an integerK, find out ifKnew flowers can be planted in theflowerbedwithout violating the no-adjacent-flowers rule.

// Input
// Input Format

// The first line contains the number of testcases T

// The first line of each testcase contains number of plots N, and the required number of flowers to be added K

// The second line of each testcase contains the values of N plots : 0 or 1

// Constraints

// 1<=T<=10

// 1<=N<=10^6

// 1<=K<=10^5

// Output
// Print "Yes" if it is possible to place N flowers else print "No"

// Sample Input 1

// 3
// 5 1
// 1 0 0 0 1
// 3 2
// 0 0 0
// 4 1
// 1 0 0 1
// Sample Output 1

// Yes
// Yes
// No
// Hint

// For the first test case,

// N=5, K=1, flowerbed=[1,0,0,0,1]
// We can plant 1 flower at 2nd index as both 1st index and 3rd index are vacant.
// Hence, the output is "Yes"
// For the second test case,

// N=3, K=2, flowerbed=[0,0,0]
// We can plant a flower at the 0th index and the 2nd index and keep the 1st index vacant.
// Hence, the output is "Yes"
// For the third test case,

// N=4, K=1, flowerbed=[1,0,0,1]
// We cannot plant a flower at any position.
// Hence, the output is "No"

function flowerManagement(N, K, flowerbed) {
  // write code here

  let count1 = 0;
  let count0 = 0;
  for (let i = 0; i < N; i++) {
    if (flowerbed[i] == "0") {
      count0++;
    } else {
      count1++;
    }
  }
  console.log(count0, count1);
  if (count1 == 0 && count0 !== 0) {
    if (K == (count0 + 1) / 2 || K == count0 / 2) {
      console.log("Yes");
    } else {
      console.log("No");
    }
  } else if (count0 == count1) {
    if (K == 0) {
      console.log("Yes");
    } else {
      console.log("No");
    }
  } else if (Math.abs(count1 - count0) % 2 == 0) {
    if (K == count0 / 2) {
      console.log("Yes");
    } else {
      console.log("No");
    }
  } else {
    let x = Math.abs(count1 - count0);

    if (K == Math.floor(x / 2) + 1) {
      console.log("Yes");
    } else {
      console.log("No");
    }
  }
}

flowerManagement(5, 1, [1, 0, 0, 0, 1]);
flowerManagement(3, 2, [0, 0, 0]);
flowerManagement(4, 1, [1, 0, 0, 1]);
