public class RightAngleTrianglePattren {
    public static void patternPrinting(int num) {
        // write your code here
        for (int i = 1; i <= num; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        patternPrinting(20);
    }
}

// Pattern Printing -27:3:16
// Description

// You are given a number, stored in a variable with the nameN

// Print the pattern as shown below.

// If the value stored inN = 4, then the pattern required will be

// *
// **
// ***
// ****

// Input
// The first and the only line of each test case contains the value stored in
// the variableN

// Output
// Print the pattern as shown in the problem statement

// Sample Input 1

// 2
// Sample Output 1

// *
// **
// Sample Input 2

// 1
// Sample Output 2

// *
// Hint

// In the first sample test case, the value stored inN = 2

// Therefore, as shown in the problem statement, the required pattern will be

// *
// **
// In the second sample test case, the value stored inN = 1

// Therefore, as shown in the problem statement, the required pattern will be

// *