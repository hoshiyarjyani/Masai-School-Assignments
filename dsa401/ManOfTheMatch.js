function myFun(arr, n) {
  let a = 0;
  let v = 0;
  let ab = true;
  for (let i = 0; i < n * 6; i++) {
    if (arr[i] % 2 !== 0 && ab === true) {
      a += arr[i];
      ab = false;
    } else if (ab === true) {
      a += arr[i];
    } else if (arr[i] % 2 !== 0 && ab === false) {
      v += arr[i];
      ab = true;
    } else {
      v += arr[i];
    }
    if ((i + 1) % 6 === 0 && ab === true) {
      ab = false;
    } else if ((i + 1) % 6 === 0 && ab === false) {
      ab = true;
    }
  }

  if (a > v) {
    console.log("AB de Villiers");
  } else if (a < v) {
    console.log("Virat Kohli");
  } else {
    console.log("Tie");
  }
}
function runProgram(input) {
  // Write Code Here
  input = input.trim().split("\n");
  let tc = +input[0];
  let line = 1;
  for (let i = 0; i < tc; i++) {
    let n = +input[line++];
    let arr = input[line].trim().split(" ").map(Number);
    line++;
    myFun(arr, n);
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
