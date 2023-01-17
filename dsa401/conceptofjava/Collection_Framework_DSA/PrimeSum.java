// Prime Sum Up 
// Description

// You are given a number, stored in a variable with the namenum. Find out the sum of all prime numbers in the range of [1,num], including the value stored innum

// Input
// The first and the only line of the input contains the value stored innum

// Output
// Print the sum of all prime numbers in the range of[1,num], includingnumitself

// Sample Input 1 

// 13
// Sample Output 1

// 41
// Hint

// In the sample test case, the value stored innum = 13. Therefore, all the prime numbers, in the range of[1,num]are

// 2
// 3
// 5
// 7
// 11
// 13
// Therefore, the sum of prime numbers becomes,2 + 3 + 5 + 7 + 11 + 13 = 41, which is the required answer

import java.util.Scanner;

public class PrimeSum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int sum = 0;
        for (int i = 2; i <= n; i++) {
            boolean isPrime = true;
            for (int j = 2; j <= Math.sqrt(i); j++) {
                if (i % j == 0) {
                    isPrime = false;
                    break;
                }
            }
            if (isPrime) {
                sum += i;
            }
        }
        System.out.println(sum);
    }
}