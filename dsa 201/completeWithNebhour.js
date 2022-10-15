// Compete with Neighbour Ended
// Description

// You are provided an array A which has N elements. Your task is to find the count of such occurrence where the element is larger than its neighbour.

// Input
// Input Format :

// First line of input contains N which is the number of elements present in the array.

// Second line contains N integer which are the elements of the array A.

// Constraints :

// N<100

// There will always be at least 2 elements

// Output
// Output one integer which is the count of such occurences.

// Sample Input 1

// 8
// 1 2 3 4 2 1 6 5
// Sample Output 1

// 2
// Hint

// Output Explanation :

// In this case, 4 is bigger than both its neighbour 3 and 2.

// Similarly 6 is bigger than both its neighbour 5 and 1.

// So, the answer is 2.
function myFunction(N, arr) {
  let count = 0;
  for (let i = 1; i < N - 1; i++) {
    if (arr[i] > arr[i - 1] && arr[i] > arr[i + 1]) {
      count++;
    }
  }
  if (arr[0] > arr[1]) {
    count++;
  }
  if (arr[N - 1] > arr[N - 2]) {
    count++;
  }
  console.log(count);
}

function runProgram(input) {
  // Write Code Here
  input = input.split("\n");
  N = +input[0];
  arr = input[1].split(" ").map(Number);
  myFunction(N, arr);
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
