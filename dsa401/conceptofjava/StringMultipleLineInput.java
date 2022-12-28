// 2
// 4
// aman
// 6
// rutwik
package conceptofjava;

import java.util.Scanner;

public class StringMultipleLineInput {

    static void print(String str) {
        System.out.println(str);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String x = sc.nextLine();
        int z = Integer.parseInt(x);
        for (int i = 0; i < z; i++) {
            String y = sc.nextLine();
            String str = sc.nextLine();
            print(str);
        }

    }
}

// Strings - II -54:32:32
// Description

// Strings with multiple test case, such as the size of each string is given

// Input
// The first line of the test case containsT, the number of test case

// The first line of each test case, containsN, the size of the string

// The next line contains the string itself

// Output
// Print each string on a new line, as shown in the sample test case

// Sample Input 1

// 2
// 4
// aman
// 6
// rutwik
// Sample Output 1

// aman
// rutwik