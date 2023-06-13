// le Plants Ended
// Description

// Chunnu and Munnu have gone hiking and they have a shortage of food supplies. So, they want your help to figure out which plants are le and which are not. You are given a stringlerepresenting the types of plants that are le, and another stringplantsrepresenting all plants that are on the trail. Your task is to find out how many plants are there on the trail which are le.

// Note : Letters are case sensitive,   so "a" is considered a different type of plant from "A".

// Input

// First line representsN, length of lestring
// Second line represents the le string
// Third line represents M, length of plants string
// Fourth line represents the plant string
// Constraints

// 1 <= N, M <= 1000

// Output
// Output the count of plants that are le

// Sample Input 1

// 2
// xY
// 6
// AYxxXY
// Sample Output 1

// 4
// Sample Input 2

// 3
// abc
// 6
// ABCxyz

// Sample Output 2

// 0
// Hint

// In Sample 1,

// N=2,le="xY",M=6,plants="AYxxXY"
// In the plants string there are 4 characters(2 "x"'s and 2 "Y"'s)that are there in the le string.
// Hence, the output is4

// In Sample2,

// N=3,le="abc",M=6,plants="ABCxyz"
// In theplantsstring there are no characters that match withlestring.
// Hence, the output is0

function lePlants(N, le, M, plants) {
  // write code here
  let count = 0;
  for (let i = 0; i < N; i++) {
    for (let j = 0; j < M; j++) {
      if (le[i] == plants[j]) {
        count++;
      }
    }
  }
  console.log(count);
}


let le = "xY";
let plant = "AYxxXY";
lePlants(2, le, 6, plant);
