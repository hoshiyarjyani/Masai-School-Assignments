// Multiplication Table of N -51:34:50
// Description

// Given a number, stored in the variable with the namenum

// Print the multiplication table of the value stored innum

// For example, if the value stored innumis 2, then the output should be

// 2
// 4
// 6
// 8
// 10
// 12
// 14
// 16
// 18
// 20
// Print each number, on a new line

// Input
// The first and the only line of the input contains the value stored innum

// Output
// Print the multiplication table of the value stored innum, in the format as shown in the problem statement

// Sample Input 1 

// 3
// Sample Output 1

// 3
// 6
// 9
// 12
// 15
// 18
// 21
// 24
// 27
// 30
// Hint

// In the sample test case, the value stored innum = 3. Therefore, the multiplication table ofnumis printed

// Therefore, the output is

// 3
// 6
// 9
// 12
// 15
// 18
// 21
// 24
// 27
// 30
import java.util.Scanner;

public class TablePrint {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        int k = 1;

        while (k <= 10) {
            System.out.println(x * k);
            k++;
        }

    }
}
