// Vowel Half -29:14:8
// Description

// You are given a string, stored in a variable with the namestr. The size of the string is stored in a variableN

// The string contains only small case English alphabets

// You have to printTrue, if more than half the characters in the strings are vowels, else printFalse

// For example, consider the value stored inN = 6, andstr = "aabefe". The number of vowels in the string are4, which is more than half of the length of the string, which isN/2 = 3. Therefore, the required output isTrue

// Note : The value stored in N, will always be even

// Input
// The first line of the input contains the value stored inN

// The next line contains the value stored instr

// Output
// PrintTrueif more than half of the characters in the string are vowels, else printFalse

// Sample Input 1 

// 6
// aabefe
// Sample Output 1

// True
// Hint

// In the sample test case, the value stored inN = 6, andstr = "aabefe". The number of vowels in the string are4, which is more than half of the length of the string, which isN/2 = 3. Therefore, the required output isTrue

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        String str = sc.next();
        int count = 0;
        for (int i = 0; i < N; i++) {
            char c = str.charAt(i);
            if (c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u') {
                count++;
            }
        }
        if (count > N / 2) {
            System.out.println("True");
        } else {
            System.out.println("False");
        }
    }
}
