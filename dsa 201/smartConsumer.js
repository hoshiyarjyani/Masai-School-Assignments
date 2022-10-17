// Smart Consumer Ended
// Description

// You go to a shop to buy groceries.There are n items you have to buy. You are given an array of size n representing the price of these n items.

// You know that there is a discount coupon available that cost X rupees.

// This coupon gives you upto Y rupees off on all items, i.e. for all items that costs more than Y their price reduces by Y and others you get for 0 rupees.

// Determine whether you should buy the discount coupon or not. You should buy the discount coupon if and only if the total price you pay after buying the discount coupon is strictly less than the price you were paying without buying the discount coupon.

// Input
// Input Format
// The first line contains the number of testcases t.

// Next 2*t lines we have the description of the t testcases.

// For each testcase there is 2 line of input.

// The first line contains three integers n,x,y.

// The second line contains n integers, the prices of the n items you wish to buy.

// Constraints
// 1 <= t <=1000

// 1 <= n,x,y <= 1000

// 0 <= price <= 1000

// Output
// Output Format
// For each testcase output YES if you should buy the coupon ,or NO if you shouldn't

// Sample Input 1

// 3
// 4 30 10
// 15 8 22 6
// 4 40 10
// 15 8 22 6
// 4 34 10
// 15 8 22 6
// Sample Output 1

// YES
// NO
// NO
// Hint

// In the first testcase the original cost of the items is 15 + 8 + 22 + 6 =51. Buying the coupon costs 30, and after buying it the cost of buying all the items is 5 + 0 + 12 + 0 =17. The total cost of buying everything with the coupon is 30 + 17 = 47, which is strictly less than 51. So, you will buy the coupon.

// In the second testcase the original cost of the items is 15 + 8 + 22 + 6 = 51. Buying the coupon costs 40, and after buying it the cost of buying all the items is 5 + 0 + 12 + 0 = 17. The total cost of buying everything with the coupon is 40 + 17 = 57, which is more than 51. So, you will not buy the coupon.

// In the third testcase the original cost of the items is 15 + 8 + 22 + 6 = 51. Buying the coupon costs 34, and the cost of buying all the items after using it is 17, making the total cost 34 + 17 = 51. Since this is not strictly less than the original cost, you won't buy the coupon.

function myfunction(ratearr, n, codeprice, dis) {
  let totel = 0;
  for (let i = 0; i < n; i++) {
    if (ratearr[i] > dis) {
      totel += ratearr[i] - dis;
    } else {
      totel += 0;
    }
  }
  let sum = 0;
  for (let i = 0; i < n; i++) {
    sum += ratearr[i];
  }

  if (totel + codeprice < sum) {
    console.log("YES");
  } else {
    console.log("NO");
  }
}

function runProgram(input) {
  // Write Code Here
  input = input.split("\n");
  tc = +input[0];
  line = 1;
  for (let i = 0; i < tc; i++) {
    codearr = input[line].split(" ").map(Number);
    line++;
    ratearr = input[line].split(" ").map(Number);
    n = +codearr[0];
    codeprice = +codearr[1];
    dis = +codearr[2];
    myfunction(ratearr, n, codeprice, dis);
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
