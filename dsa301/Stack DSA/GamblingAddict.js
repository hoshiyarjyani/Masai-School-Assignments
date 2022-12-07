// Gambling Addict Ended
// Description

// You are a gambling addict but since you are a coder you are also smart.

// You gamble on football matches but also consider the odds for your team.

// You are given n numbers representing the odds for your team on n consecutive days.

// On each day you have to decide whether to bet on that day or wait for the next day you get better odds.

// So, return an array of size n where the ith number represents the number of days you have to wait until the next day with better odds.

// Input
// Input Format
// The first line contains the number of testcases t.

// Next 2*t lines we have the description of the t testcases.

// For each testcase there are 2 lines of input.

// The first line of input contains n, the number of days.

// The second line contains n space-separated integers the ith of which [ 1 <= i <= n ] represents the odds for your team on the ith day.

// Constraints
// 1 <= t <=1000

// 1 <= n <= 10^5

// 1 <= odds <= 100

// Output
// Output Format
// For each testcase output one line containing n space-separated integers the ith of which [ 1 <= i <= n ] represents the total number of days you have to wait on the ith day for better days, if there are no days ahead with better odds output 0 for that day.

// Sample Input 1

// 3
// 8
// 73 74 75 71 69 72 76 73
// 4
// 30 40 50 60
// 3
// 30 60 90
// Sample Output 1

// 1 1 4 2 1 1 0 0
// 1 1 1 0
// 1 1 0
// Hint

// In the first test case :

// To get better odds than 73 you have to wait one day as 74 is the next day.

// For 74 also one day wait to get 75

// For 75 wait 4 days to get 76

// and so on for others.

// For 76 there are no days after that to get better odds hence 0

// Same for 73 no days after that with better odds.

function myfunction(arr, n) {
  let ans = [];
  let stk = [];
  for (let i = n - 1; i >= 0; i--) {
    while (stk.length > 0 && arr[stk[stk.length - 1]] <= arr[i]) {
      stk.pop();
    }
    if (stk.length == 0) {
      ans.push(0);
    } else {
      ans.push(Math.abs(i - stk[stk.length - 1]));
    }
    stk.push(i);
  }
  console.log(ans.reverse().join(" "));
}

function runProgram(input) {
  // Write Code Here
  input = input.split("\n");
  tc = +input[0];
  line = 1;
  for (let i = 0; i < tc; i++) {
    n = +input[line];
    line++;
    arr = input[line].split(" ").map(Number);
    myfunction(arr, n);
    line++;
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
