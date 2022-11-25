// Use Side Lane Ended
// Description

// There are N trucks numbered from 1 to N. The trucks are coming on a road in a random manner.(by random, it means that any order of number: not sorted) There is a side lane which can be used to order the sequence of truck properly(1,2,3,..N)

// Use these (Ref :https://imgur.com/a/yWLhQiK) images for better understanding of sample test case.

// If it is possible to achieve using the side land, print "yes"

// else print "no"


// Input
// Input Format :

// There are several test cases.

// The first line of each test case contains a single number n, the number of trucks.

// The second line contains the numbers 1 to n in an arbitrary order.

// All the numbers are separated by single spaces. These numbers indicate the order in which the trucks arrive in the approach street.

// Input ends with number 0

// Constraints :

// N < 1000


// Output
// For each test case your program has to output a line containing a single word "yes" if the trucks can be re-ordered with the help of the side lane, and a single word "no" in case it is not possible.


// Sample Input 1 

// 5
// 5 1 2 4 3 
// 0
// Sample Output 1

// yes

function myFunction(n, arr) {
  // 5 1 2 4 3
  let stk = [];
  let count = 1;
  for (let i = 0; i < n; i++) {
    if (arr[i] == count) {
      count++;
    } else if (stk[stk.length - 1] == count) {
      stk.pop();
      count++;
      i--;
    } else {
      stk.push(arr[i]);
    }
  }
  for (let i = stk.length - 1; i >= 0; i--) {
    if (stk[i] == count) {
      stk.pop();
      count++;
    }
  }
  if (stk.length === 0) {
    console.log("yes");
  } else {
    console.log("no");
  }
}

function runProgram(input) {
  // Write Code Here
  input = input.trim().split("\n");
  k = 0;
  for (let i = 0; i < input.length / 2; i++) {
    let n = Number(input[k]);
    if (n === 0) {
      break;
    }
    k++;
    let arr = input[k].trim().split(" ").map(Number);
    k++;
    myFunction(n, arr);
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
