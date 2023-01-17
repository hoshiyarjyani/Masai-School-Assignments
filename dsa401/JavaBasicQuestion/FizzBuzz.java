// Fizzz buzzz -53:6:10
// Description

// You are given a number stored in a variable with the namenum

// For all numbers in the range[1,num], including num

// 1. If the number is divisible by 3 and 5 both, print "FizzBuzz" without quotes

// 2. Else If the number is divisible by 3, print "Fizz", without quotes

// 3. Else If the number is divisible by 5, print "Buzz", without quotes

// 4. Else, print the number as it is 

// Input
// TThe first line contains the value stored in the variablenum

// Output
// Print the required output, according to the conditions shown in the problem statement

// Sample Input 1 

// 3
// Sample Output 1

// 1
// 2
// Fizz
// Hint

// The value stored innum = 3. Therefore, all the values in the range from[1,3]are printed. Since, the number3is divisible by3, therefore, instead of writing 3, we writeFizz

// Hence, the output becomes

// 1
// 2
// Fizz
import java.util.Scanner;

public class FizzBuzz {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for (int i = 1; i <= n; i++) {
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
}
