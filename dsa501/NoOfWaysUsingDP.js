function ways(n, dp) {
  if (n == 0) {
    return 1;
  }
  if (n < 0) {
    return 0;
  }
  if (dp[n] != -1) {
    return dp[n];
  }
  dp[n] = ways(n - 1, dp) + ways(n - 2, dp) + ways(n - 3, dp);
  return dp[n];
}

function runProgram(input) {
  let n = parseInt(input.trim());
  let dp = new Array(n + 1).fill(-1);
  let result = ways(n, dp);
  console.log(result);
}

if (process.env.USERNAME === "") {
  runProgram(`5`);
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
