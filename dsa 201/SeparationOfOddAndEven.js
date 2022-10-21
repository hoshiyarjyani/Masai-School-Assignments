// Separation of Odd & Even -25:28:43
// Description

// Phulera is a peaceful place, where everyone lives in harmony. The gram panchayat consists of Pradhan Ji, Up-Pradhan Ji, Sachiv Ji, and Vikas(The friendly helper). The Panchayat is preparing for the ceremony on Independence day. According to the tradition of the village, sweets are distributed to every family in the village.

// There are two types of sweets available, and Pradhan Ji decides that all the families who have even number of members will get sweets ofType 1, and all the families who have odd number of members, will get sweets ofType 2. So, he assigns Sachiv Ji, the task of assigning the sweets.

// Since, Sachiv Ji, has to study for his CAT exam, he asks you to distribute the sweets for him. There are N families in the village, and the number of members in each family, is given in the form of an array. According to Sachiv Ji's plan, if the sweets ofType 1are ready first, then the families with even number of members need to distributed the sweets first, then the families with odd number of members. Similarly, if the sweets ofType 2are ready first, then the families with odd number of members will be distributed the sweets first, then the families with even number of members.

// Also, Sachiv Ji does not wants chaos, so he wants the odd and even families to be sorted among themselves in increasing order of their sizes.

// Input
// The first line containsT, the number of test cases. The first line of each test case containsN, the number of fields in the village. Next line contains N space separated integers denoting the size of the fields. The next line contains the integerQ, which can be either 1 or 2, denoting the type of sweets ready first.

// Constraints
// 1 <=T<= 10

// 1 <=N<= 10^4

// 1 <=A[i]<= 10^4

// 1 <=Q<= 2

// Output
// For each test case, print N space separated integers according to the requirement in the question.

// Sample Input 1

// 2
// 6
// 1 3 5 2 7 4
// 1
// 6
// 1 3 5 2 7 4
// 2
// Sample Output 1

// 2 4 1 3 5 7
// 1 3 5 7 2 4
// Hint

// For the first test case, Q = 1, so the answer will be 2,4,1,3,5,7.

function seperationOfOddEven(N, fieldSize, Q) {
  //write code here
  let arr1 = [];
  let arr2 = [];

  if (Q % 2 == 0) {
    for (let i = 0; i < N; i++) {
      if (fieldSize[i] % 2 == 1) {
        arr1.push(fieldSize[i]);
      }
    }
    for (let j = 0; j < N; j++) {
      if (fieldSize[j] % 2 == 0) {
        arr2.push(fieldSize[j]);
      }
    }
  } else {
    for (let i = 0; i < N; i++) {
      if (fieldSize[i] % 2 == 0) {
        arr1.push(fieldSize[i]);
      }
    }
    for (let j = 0; j < N; j++) {
      if (fieldSize[j] % 2 == 1) {
        arr2.push(fieldSize[j]);
      }
    }
  }
  let temp = arr1
    .sort(function (a, b) {
      return a - b;
    })
    .concat(
      arr2.sort(function (a, b) {
        return a - b;
      })
    );

  let beg = "";
  for (let i = 0; i < temp.length; i++) {
    beg += temp[i] + " ";
  }
  console.log(beg.trim());
}
