// Number of ways problems -30:34:0
// Description

// Sandhya is running up a staircase with N steps, and can hop(jump) either 1 step, 2 steps or 3 steps at a time. You have to count, how many possible ways Sandhya can run up to the stairs.

// Input
// input Format

// Input contains integer N that is number of steps

// Constraints

// N <= 30

// Output
// Output Format

// Output for each integer N the no of possible ways w.

// Sample Input 1 

// 4
// Sample Output 1

// 7
// Hint

// No of the ways for n=4 are:-

// 1 1 1 1

// 1 1 2

// 2 1 1

// 1 2 1

// 1 3

// 3 1

// 2 2

// Language: 

// Theme: 
// Font Size: 11

//   
//    Test against custom input
// Status  Accepted

import java.util.Scanner;

public class Main {
    public static int countWays(int n) {
        if (n < 0) {
            return 0;
        }
        if (n == 0) {
            return 1;
        }
        return countWays(n - 1) + countWays(n - 2) + countWays(n - 3);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt();
        System.out.println(countWays(n));
    }
}
