function myfunction(arr, n) {
  // Your code here
  //100 60 70 65 80 85
  let stk = [];
  let ans = [];
  for (let i = 0; i < n; i++) {
    let count = 1;
    while (stk.length != 0 && arr[stk[stk.length - 1]] <= arr[i]) {
      count = count + ans[stk[stk.length - 1]];
      stk.pop();
    }
    ans[i] = count;
    stk.push(i);
  }
  console.log(ans.join(" "));
}

// function myfunction(arr, n) {
//   // Your code here
//   //100 60 70 65 80 85
//   let stk = [];
//   let ans = [];
//   for (let i = 0; i < n; i++){
//     while (stk.length != 0 && arr[stk[stk.length - 1]] <= arr[i]){
//         stk.pop();
//        }
//     if (stk.length == 0) {
//         ans.push(i + 1);
//    }
//     else {
//       ans.push(i - stk[stk.length - 1]);
//     }
//     stk.push(i);
//   }

//   console.log(ans.join(" "));
// }

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
