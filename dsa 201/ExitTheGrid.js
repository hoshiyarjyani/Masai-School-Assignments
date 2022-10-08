function myFunction(arr, size) {
  let i = 0,
    j = 0;
  let count = 0;

  let max = 1;
  while (i >= 0 && i < size && j >= 0 && j < size && max <= size ** 2) {
    if (arr[i][j] == "R") {
      j++;
      count++;
    } else if (arr[i][j] == "L") {
      j--;
      count++;
    } else if (arr[i][j] == "U") {
      i--;
      count++;
    } else if (arr[i][j] == "D") {
      i++;
      count++;
    }
    max++;
  }
  if (i == size || j == size || i < 0 || j < 0) {
    console.log(count);
  } else if (max > size ** 2) {
    console.log(0);
  }
}

function runProgram(input) {
  // Write Code Here

  input = input.split("\n");
  tc = +input[0];
  line = 1;

  for (let i = 0; i < tc; i++) {
    size = +input[line];
    line++;
    arr = [];
    for (let j = 0; j < size; j++) {
      arr.push(input[line].split(""));
      line++;
    }

    myFunction(arr, size);
  }
}
// Input Taking.

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
