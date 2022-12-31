package conceptofjava;

import java.util.Scanner;

public class ConstonantCount {

    static void myFun(String str) {
        int count = 0;
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == 'a' || str.charAt(i) == 'e' || str.charAt(i) == 'i' || str.charAt(i) == 'o'
                    || str.charAt(i) == 'u') {
                continue;
            } else {
                count++;
            }
        }
        System.out.println(count);
    }

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        myFun(str);
    }

}

// Count Consonant
// Description

// You are give a strings.

// Your task is to write a program that counts the number of consonants
// (non-vowels characters) present in the string.

// Input
// Input Format:

// First-line contains a stringS

// Constraints:

// 1 <= length of (S) <= 100

// Output
// Output one number which is the count of number of consonants present in the
// string.

// Sample Input 1

// masaischool
// Sample Output 1

// 6
// Hint

// For stringmasaischool, vowels are (highlighted in bold)

// masaischoo