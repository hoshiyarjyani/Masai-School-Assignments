// Units Consumed Ended
// Description

// Electricity consumption is measured via slab rates for a particular wattage capacity, which is as follows

// test.png

// Apart from the slab rates, a fixed charge of Rs. 80 is also added to every bill.

// Given the bill, write a program to find the number of units consumed.

// Input
// Input Format:

// First and the only line of input contains the bill amount

// Constraints:

// Bill amount is an integer <= 1000

// Output
// Output the number of units consumed

// Sample Input 1

// 930
// Sample Output 1

// 170
function units(n) {
  //write code here
  let unit = 0;
  if (n >= 0 && n <= 150) {
    unit = n / 3;
  } else if (n >= 151 && n <= 650) {
    unit = 50 + (n - 230) / 5;
  } else if (n >= 651 && n <= 730) {
    unit = 150 / 3 + (n - 150 - 80) / 5;
  } else {
    unit = 150 / 3 + 500 / 5 + (n - 650 - 80) / 10;
  }
  console.log(unit);
}
function runProgram(input) {
  // Write Code Here
  n = +input;
  units(n);
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
