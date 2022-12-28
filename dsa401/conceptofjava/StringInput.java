package conceptofjava;

import java.util.Scanner;

public class StringInput {

    static void print(String str) {
        System.out.println(str);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String x = sc.nextLine();
        String str = sc.nextLine();

        print(str);
    }
}

// Strings - I -54:39:58
// Description

// Single String, where the size of the string is given

// Input
// The first line of the input containsN, the size of the string

// The next line contains the string itself

// Output
// Print the string given as input, in terms of output, as shown in the sample
// test case

// Sample Input 1

// 4
// aman
// Sample Output 1

// aman