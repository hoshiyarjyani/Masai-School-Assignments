// Edible Plants Ended
// Description

// Chunnu and Munnu have gone hiking and they have a shortage of food supplies. So, they want your help to figure out which plants are edible and which are not. You are given a stringediblerepresenting the types of plants that are edible, and another stringplantsrepresenting all plants that are on the trail. Your task is to find out how many plants are there on the trail which are edible.

// Note : Letters are case sensitive,   so "a" is considered a different type of plant from "A".

// Input

// First line representsN, length of ediblestring
// Second line represents the edible string
// Third line represents M, length of plants string
// Fourth line represents the plant string
// Constraints

// 1 <= N, M <= 1000

// Output
// Output the count of plants that are edible

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

// N=2,edible="xY",M=6,plants="AYxxXY"
// In the plants string there are 4 characters(2 "x"'s and 2 "Y"'s)that are there in the edible string.
// Hence, the output is4

// In Sample2,

// N=3,edible="abc",M=6,plants="ABCxyz"
// In theplantsstring there are no characters that match withediblestring.
// Hence, the output is0

function ediblePlants(N, edible, M, plants) {
  // write code here
  let count = 0;
  for (let i = 0; i < N; i++) {
    for (let j = 0; j < M; j++) {
      if (edible[i] == plants[j]) {
        count++;
      }
    }
  }
  console.log(count);
}


let edible = "xY";
let plant = "AYxxXY";
ediblePlants(2, edible, 6, plant);
