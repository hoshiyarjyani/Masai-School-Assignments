// Walk in the Park Ended
// Description

// Given a 2d array with 'U', 'D', 'L', 'R' representing up, down, left, right => count the number of steps you have taken before reaching an already visited cell or going outside the 2d array.

// Note: The first step is always taken to cell located at (0,0).

// Input
// The first line of the input contains T, the number of test cases.

// The first line of each test case contains N, and M, the number of rows, and columns in the 2D Array.

// The next lines of the test case, contains M characters each, denoting the values in the 2D array.

// Constraints

// 1 <= T <= 10

// 1 <= N,M <= 100

// Output
// Print a single integer, denoting the number of steps, you take before stepping out of the 2D array, or visiting an already visited cell, on a new line.

// Sample Input 1

// 1
// 3 4
// RRDR
// LLUD
// LLLL
// Sample Output 1

// 4
// Hint

// In the first sample test case, the first jump as given in the problem statement, is taken at (0,0), and the next jump is taken at (0,1) as the value in the cell is R, followed by another jump  right at (0,2). At (0,2) the value in the cell is D, therefore, a jump down is made at the point (1,2) which has a value of 'U', so the jump is made back to an already visited cell, (0,2). Therefore, we stop at this point, making the total number of steps taken as 4, before visiting an already visited cell, or going out of the 2D array.

function myfunction(N, M, arr) {
  let i = 0,
    j = 0;
  let count = 0;

  let max = 1;
  while (i >= 0 && i < N && j >= 0 && j < M && max <= N * M) {
    if (arr[i][j] == "R") {
      arr[i][j] = 0;
      j++;
      count++;
      
    } else if (arr[i][j] == "L") {
      arr[i][j] = 0;
      j--;

      count++;
    } else if (arr[i][j] == "U") {
      arr[i][j] = 0;
      i--;

      count++;
    } else if (arr[i][j] == "D") {
      arr[i][j] = 0;
      i++;

      count++;
    } else if (arr[i][j] == 0) {
      break;
    }
    max++;
  }
  if (i == N || j == M || i < 0 || j < 0) {
    console.log(count);
  } else {
    console.log(count);
  }
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
      arr.push(input[j].split(""));
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
