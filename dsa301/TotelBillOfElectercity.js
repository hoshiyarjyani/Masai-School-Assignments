// Total Bill Ended
// Description

// Electricity consumption is measured via slab rates for a particular wattage capacity, which is as follows:

// Units Consumed	Per Unit Price (Rupees/Unit)
// 0 - 50	3
// 51 - 150	5
// 151 and above	10
// Apart from the slab rates, a fixed charge of Rs. 80 is also added to every bill. You are given total Units ConsumedN, you need to find the Total Bill.

// Input
// Input Format:-

// The first line of input contains a single integerN, number of units consumed.

// Constraints:-

// 0 <= N <= 10^5

// Output
// Output Format:-

// Single integer representing the total bill.

// Sample Input 1

// 4
// 0
// 5
// 68
// 178
// Sample Output 1

// 80
// 95
// 320
// 1010
// Hint

// TestCase 1:N = 0,Total Bill = 80 + 0*3 = 80

// TestCase 2:N = 5,Total Bill = 80 + 5*3 = 95

// TestCase 3:N = 68,Total Bill = 80 + 50*3 + 18*5 = 320

// TestCase 4:N = 178,Total Bill = 80 + 50*3 + 100*5 + 28*10 = 1010

function totalBill(N) {
  // Write code here
  if (N <= 50) {
    console.log(80 + N * 3);
  } else if (N <= 150) {
    console.log(80 + (N - 50) * 5 + 50 * 3);
  } else {
    console.log(80 + (N - 150) * 10 + 50 * 3 + 100 * 5);
  }
}
