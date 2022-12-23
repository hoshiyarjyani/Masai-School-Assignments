// Fizzz buzzz -31:11:15
// Description

// You are given a number stored in a variable with the namenum

// For all numbers in the range[1,num], including num

// 1. If the number is divisible by 3 and 5 both, print FizzBuzz

// 2. Else If the number is divisible by 3, print "Fizz", without quotes

// 3. Else If the number is divisible by 5, print "Buzz", without quotes

// 4. Else, print the number as it is 

// Input
// The first line containsT, the number of test cases.

// The first line of each test case contains the value stored in the variablenum

// Output
// Print the required output, according to the conditions shown in the problem statement

// Sample Input 1 

// 2
// 1
// 3
// Sample Output 1

// 1
// 1
// 2
// Fizz
// Hint

// In the sample test case, the value stored inT = 2. Therefore, there are two test cases for which we need to solve the given problem

// In the first test case, the value stored innum = 1. Therefore, all the values in the range from[1,1], are printed. Since, no value is either divisibly by 3 or 5 or both, hence the number is printed as it is

// Hence the output becomes

// 1
// In the second test case, the value stored innum = 3. Therefore, all the values in the range from[1,3]are printed. Since, the number3is divisible by3, therefore, instead of writing 3, we writeFizz

// Hence, the output becomes

// 1
// 2
// Fizz

public class FizzBuzz {

    public static void fizzBuzz(int num) {
        // write your code here
        for (int i = 1; i <= num; i++) {
            if (i % 3 == 0 && i % 5 == 0) {
                System.out.println("FizzBuzz");
            } else if (i % 3 == 0) {
                System.out.println("Fizz");
            } else if (i % 5 == 0) {
                System.out.println("Buzz");
            } else {
                System.out.println(i);
            }
        }

    }

    public static void main(String args[]) {
        fizzBuzz(5);
      }

}