function myfunction(size, str) {
  let obj = {};
  for (let i = 0; i < size; i++) {
    if (
      obj[str[i]] == undefined &&
      (str[i] == "m" ||
        str[i] == "o" ||
        str[i] == "u" ||
        str[i] == "s" ||
        str[i] == "e")
    ) {
      obj[str[i]] = 1;
    } else if (obj[str[i]] != undefined) {
      obj[str[i]]++;
    }
  }

  let min = Infinity;
  for (let key in obj) {
    if (key == "m" || key == "o" || key == "u" || key == "s" || key == "e") {
      if (obj[key] < min) {
        min = obj[key];
      }
    }
  }
  let a = 0;
  for (let key in obj) {
    if (key == "m" || key == "o" || key == "u" || key == "s" || key == "e") {
      a++;
    }
  }
  if (min == Infinity) {
    console.log(0);
  } else if (a == 5) {
    console.log(min);
  } else {
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
    str = input[line].split("");
    myfunction(size, str);
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
