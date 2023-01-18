// Logical Evens -29:34:6
// Description

// You are given two numbers, stored in the variable with the following names

// one, two
// If both the values are Even, printBoth, else printNo

// Input
// The only line of input contains two numbers, the values stored inone, two

// Output
// If both the values are Even, printBoth, else printNo

// Sample Input 1 

// 4 7
// Sample Output 1

// No
// Hint

// In the sample test case, the value stored inone = 4andtwo = 7. The value stored in one is Even, while that stored in two is Odd. Therefore, the output isNo

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int one = scanner.nextInt();

        int two = scanner.nextInt();
        if (one % 2 == 0 && two % 2 == 0) {
            System.out.println("Both");
        } else {
            System.out.println("No");
        }
    }
}
