// Nearest Greater Element Ended
// Description

// You are given an array A of size N. For each element, print the closest greater element, to that particular element. If there is no greater element for a particular element, print -1.

// If the two values, are equidistant from a particular value, print the value that occurs to the left of it.

// Refer the sample I/O for better understanding

// Input
// The first line of the input contains T, the number of test cases. The first line of each test case contains N, the size of the array.

// The next line contains N space separated integers, denoting the array elements.

// Constraints

// 1 <= T <= 10

// 1 <= N <= 10^5

// 1 <= A[i] <= 10^4

// Output
// For each test case, print N space separated integers, denoting the nearest greater element in the array, and -1, if no such element exists, on a new line.

// Sample Input 1

// 1
// 5
// 5 4 1 3 2
// Sample Output 1

// -1 5 4 4 3
// Hint

// In the sample test case, the first element 5 has no element greater than it, either to the left of it, or to the right of it, therefore, the output is -1.

// The second element 4 has only one element greater than it, which is 5, which occurs to the left of it, therefore, the output for 4 is 5.

// The third element is 1, which has four elements greater than it in the array, which are {5,4,3,2}. The closest to 1 are {4,3}, but 4 occurs to the left side. therefore, the output is 4.

// The fourth element is 3, the elements greater than 3 in the array are {4,5} which both occur to the left of it. But the closer one is 4, therefore, the output is 4.

// The fifth element 2 has three elements greater than it, {5,4,3}. The value closest to the element 2 is 3, therefore, the output is 3.
function myFunction(N, arr) {
  let stk1 = [];
  let stk2 = [];
  let x = [];
  let y = [];
  let ans = [];

  //watching left Greater
  for (let i = 0; i < N; i++) {
    while (stk1.length != 0 && arr[stk1[stk1.length - 1]] <= arr[i]) {
      stk1.pop();
    }
    if (stk1.length == 0) {
      x.push(-1);
    } else {
      x.push(stk1[stk1.length - 1]);
    }
    stk1.push(i);
  }

  // watching Right Greater
  for (let i = N - 1; i >= 0; i--) {
    while (stk2.length != 0 && arr[stk2[stk2.length - 1]] <= arr[i]) {
      stk2.pop();
    }
    if (stk2.length == 0) {
      y.push(-1);
    } else {
      y.push(stk2[stk2.length - 1]);
    }
    stk2.push(i);
  }
  y.reverse();

  for (i = 0; i < N; i++) {
    if (x[i] == -1 && y[i] == -1) {
      ans.push(-1);
    } else if (x[i] == -1 && y[i] != -1) {
      ans.push(arr[y[i]]);
    } else if (x[i] != -1 && y[i] == -1) {
      ans.push(arr[x[i]]);
    } else {
      let a = Math.abs(i - x[i]);
      let b = Math.abs(i - y[i]);

      if (a > b) {
        ans.push(arr[y[i]]);
      } else {
        ans.push(arr[x[i]]);
      }
    }
  }

  //   console.log(x);
  //   console.log(y);
  console.log(ans.join(" "));
}

function runProgram(input) {
  // Write Code Here
  input = input.split("\n");
  tc = +input[0];
  line = 1;
  for (let i = 0; i < tc; i++) {
    N = +input[line];
    line++;
    arr = input[line].split(" ").map(Number);
    myFunction(N, arr);
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
