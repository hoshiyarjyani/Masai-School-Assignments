// A football tournament -60:10:30
// Description

// Masai School had hosted a Football tournament. You got hold of a profound description of the final match's process. On the whole, there are n lines in that description each of which described one goal. Every goal was marked with the name of the team that had scored it. Write a program to find the name of the team that won the finals. It is guaranteed that the match did not end in a tie.

// Input
// Input Format

// The first line contains an integer n — the number of lines in the description.

// Then follow n lines — for each goal the names of the teams that scored it.

// Constraints

// 1 ≤ n ≤ 100

// The names are non-empty lines consisting of uppercase letters whose lengths do not exceed 10 symbols. It is guaranteed that the match did not end in a tie and the description contains no more than two different teams.

// Output
// Print the name of the winning team. We remind you that in football the team that scores more goals is considered the winner.

// Sample Input 1

// 5
// A
// ABA
// ABA
// A
// A
// Sample Output 1

// A

function footBallTournament(n, teamNamesArr) {
  //write code here
  let obj = {};
  for (let i = 0; i < n; i++) {
    if (obj[teamNamesArr[i]] == undefined) {
      obj[teamNamesArr[i]] = 1;
    } else {
      obj[teamNamesArr[i]]++;
    }
  }
  let max = -Infinity;
  for (let key in obj) {
    if (obj[key] > max) {
      max = obj[key];
      var val = key;
    }
  }
  console.log(val);
}
footBallTournament(5, ["A", "ABA", "ABA", "A", "A"]);
