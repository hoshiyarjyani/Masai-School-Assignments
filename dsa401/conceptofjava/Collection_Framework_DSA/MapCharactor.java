// Map Characters -30:1:18
// Description

// You are given a number stored in a variable with the nameN

// You have to print the first N English smaller case alphabets, mapped with the values starting from 1 toN, including the value stored inN

// For example, consider the value stored inN = 3, then the required output will be

// a-1
// b-2
// c-3
// Note : The value stored in N will always be less than or equal to 26, and greater than 0 

// Input
// The first and the only line of the input contains the value stored inN

// Output
// Print the output as shown in the problem statement

// Sample Input 1 

// 5
// Sample Output 1

// a-1
// b-2
// c-3
// d-4
// e-5
// Hint

// In the sample test case, the value stored inN = 5. Therefore, we have to print the first 5 smaller case English alphabets. Therefore, the output becomes

// a-1
// b-2
// c-3
// d-4
// e-5
// Language: 

// Theme: 
// Font Size: 13

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        for (int i = 1; i <= n; i++) {
            char ch = (char) (96 + i);
            System.out.println(ch + "-" + i);
        }
    }
}
