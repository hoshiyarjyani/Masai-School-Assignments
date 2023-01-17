// Identify Prime -54:15:8
// Description

// You are given a number stored in a variable with the namenum

// Check if the number is a prime number or not

// If the value stored innum, is a prime number printYes, else printNo

// Note : A prime number is a number, that is divisible by only 1 and the number itself

// Input
// The first and the only line of the input contains the value stored innum

// Output
// If the value stored innum, is a prime number printYes, else printNo

// Sample Input 1 

// 13
// Sample Output 1

// Yes
// Hint

// In the sample test case, the value stored innum = 13. Since,13is a prime number, the output isYes

import java.util.Scanner;

public class CheckPrime {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int count = 0;
        boolean prime = true;
        for (int i = 2; i < num; i++) {
            if (num % i == 0) {
                prime = false;
                break;
            }
        }
        if (prime) {
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }
    }
}
