function myFun(row, col, arr) {
  let obj = {};
  for (let i = 0; i < row; i++) {
    for (let j = 0; j < col; j++) {
      const color = arr[i][j];
      if (!obj[color]) {
        obj[color] = [[i + 1, j + 1]];
      } else {
        obj[color].push([i + 1, j + 1]);
      }
    }
  }
  let sum = 0;

  for (const color in obj) {
    const coords = obj[color];
    for (let i = 0; i < coords.length; i++) {
      for (let j = i + 1; j < coords.length; j++) {
        const [x1, y1] = coords[i];
        const [x2, y2] = coords[j];
        sum += Math.abs(x1 - x2) + Math.abs(y1 - y2);
      }
    }
  }
  console.log(sum);
}

function runProgram(input) {
  // Write Code Here
  input = input.trim().split("\n");
  let line = 0;
  let [row, col] = input[line++].trim().split(" ").map(Number);
  let arr = [];
  for (let m = 0; m < row; m++) {
    arr.push(input[line].trim().split(" ").map(Number));
    line++;
  }
  myFun(row, col, arr);
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
