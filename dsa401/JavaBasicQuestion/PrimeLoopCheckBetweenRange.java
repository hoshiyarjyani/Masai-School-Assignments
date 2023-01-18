// Prime Loop Check -30:7:34
// Description

// You are given a number, stored in a variable with the name,num

// Find out all the prime numbers, in the range, [1,num], including the value stored in num, and print each of them on a new line

// Note : 1 is not a prime number

// Input
// The first and the only line of the input contains the value stored in the variable with the namenum

// Output
// Print all the prime numbers, in the range from[1, num], includingnumitself

// Sample Input 1 

// 5
// Sample Output 1

// 2
// 3
// 5
// Hint

// In the sample test case, the value stored in the variablenum = 5. Therefore, all the prime numbers in the range, [1,5] are printed. Hence the output becomes

// 2
// 3
// 5
import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        for (int i = 2; i <= n; i++) {
            boolean isPrime = true;
            for (int j = 2; j <= Math.sqrt(i); j++) {
                if (i % j == 0) {
                    isPrime = false;
                    break;
                }
            }
            if (isPrime) {
                System.out.println(i);
            }
        }

    }
}