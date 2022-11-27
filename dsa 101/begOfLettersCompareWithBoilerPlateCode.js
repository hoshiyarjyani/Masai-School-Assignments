function bothSame(str1, size1, str2, size2) {
  let count = 0;
  for (let i = 0; i < size2; i++) {
    for (let j = 0; j < size1; j++) {
      if (str2[i] == str1[j]) {
        count++;
        break;
      }
    }
  }
  if (count == size2) {
    console.log("Yes");
  } else {
    console.log("No");
  }
}

function runProgram(input) {
  // Write Code Here
  input = input.split("\n");
  str1 = input[1];
  size1 = input[1].length;
  str2 = input[3];
  size2 = input[3].length;
  bothSame(str1, size1, str2, size2);
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

runProgram();

// 5
// aabbc
// 3
// abc
