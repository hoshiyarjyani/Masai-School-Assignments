function myfunction(arr, N) {
  for (let i = 0; i < N; i++) {
    for (let j = 0; j < N; j++) {
      if (
        arr[i][j] == "#" &&
        arr[i + 1][j + 1] == "#" &&
        arr[i + 1][j - 1] == "#" &&
        arr[i - 1][j - 1] == "#" &&
        arr[i - 1][j + 1] == "#"
      ) {
        let str = i + 1 + " " + (j + 1);
        return str;
      }
    }
  }
}
function runProgram(input) {
  // Write Code Here
  input = input.split("\n");
  line = 0;
  tc = +input[line];
  for (let i = 0; i < tc; i++) {
    let N = 8;
    var arr = [];
    for (let j = 0; j < N; j++) {
      line++;
      arr.push(input[line].split(""));
    }
    let a = myfunction(arr, N);
    console.log(a);
    arr = [];
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
