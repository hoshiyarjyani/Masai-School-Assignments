// Bishop Attack Ended
// Description

// Ankush gifted his favorite student Akshay a chessboard to practice his chess skills. This chessboard is a grid a with n rows and m columns with each cell having a non-negative integer written on it.

// Akshay's challenge is to place a bishop on the board such that the sum of all cells attacked by the bishop is maximal. The bishop attacks in all directions diagonally, and there is no limit to the distance which the bishop can attack.

// Note that the cell on which the bishop is placed is also considered attacked.

// Help him find the maximal sum he can get.

// Input
// Input Format

// The first line contains the number of testcases, T

// For each testcase:

// The first line contains the number of rows and columns , n and m

// The next n lines contains m integers each representing the value of chess[i][j]

// Constraints

// 1<=T<=10

// 1<=n,m<=200

// 1<=chess[i][j]<=1000

// Output
// For each test case output a single integer, the maximum sum over all possible placements of the bishop.

// Sample Input 1

// 4
// 4 4
// 1 2 2 1
// 2 4 2 4
// 2 2 3 1
// 2 4 2 4
// 2 1
// 1
// 0
// 3 3
// 1 1 1
// 1 1 1
// 1 1 1
// 3 3
// 0 1 1
// 1 0 1
// 1 1 0
// Sample Output 1

// 20
// 1
// 5
// 3
// Hint

// Untitled Diagram.drawio (2).png

// The above figure represent the chosen cells which will give the best answer in the first testcase

function myfunction(N, M, arr) {
  let sum = 0;
  var max = -Infinity;
  for (let i = 0; i < N; i++) {
    for (let j = 0; j < M; j++) {
      let k = i;
      let m = j;
      while (k < N && m < M && k >= 0 && m >= 0) {
        sum += arr[k][m];
        k++;
        m++;
      }
      k = i;
      m = j;
      while (k < N && m < M && k >= 0 && m >= 0) {
        sum += arr[k][m];
        k--;
        m--;
      }
      k = i;
      m = j;
      while (k < N && m < M && k >= 0 && m >= 0) {
        sum += arr[k][m];
        k--;
        m++;
      }
      k = i;
      m = j;
      while (k < N && m < M && k >= 0 && m >= 0) {
        sum += arr[k][m];
        k++;
        m--;
      }
      var totel = sum - 3 * arr[i][j];
      if (max < totel) {
        max = totel;
      }
      sum = 0;
    }
  }
  console.log(max);
}

function runProgram(input) {
  // Write Code Here
  input = input.split("\n");
  tc = +input[0];
  line = 1;
  for (let i = 0; i < tc; i++) {
    size = input[line].split(" ").map(Number);
    N = +size[0];
    M = +size[1];
    var arr = [];
    line++; //2
    for (let j = line; j < line + N; j++) {
      arr.push(input[j].split(" ").map(Number));
    }
    line += N;
    myfunction(N, M, arr);
  }
}
if (process.env.USERNAME === "") {
  runProgram(``);
} else {
  process.stdin.resume();
  process.stdin.setEncoding("ascii");
  let read = "";
  process.stdin.on("data", function (input) {
    read += input;
  });
  process.stdin.on("end", function () {
    read = read.replace(/\n$/, "");
    read = read.replace(/\n$/, "");
    runProgram(read);
  });
  process.on("SIGINT", function () {
    read = read.replace(/\n$/, "");
    runProgram(read);
    process.exit(0);
  });
}
