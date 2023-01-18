// Two Sum One Numbers II -28:10:16
// Description

// You are given five numbers, stored in the variables with the following names

// one, two, three, four, five

// Find the value ofsum1andsum2, such that

// sum1 = one + two 

// sum2 = three + four

// If the value of sum1 or sum2 is greater than the value stored in variablefive, printYes, else printNo

// Input
// The first and the only line of the input contains the value stored in variablesone, two, three, four, fiverespectively

// Output
// PrintYes, if either the value ofsum1orsum2is greater than the value stored infive, else printNo

// Sample Input 1 

// 1 2 3 4 5 
// Sample Output 1

// Yes
// Hint

// In the sample test case, the value stored inone = 1, two = 2, three = 3, four = 4, five = 5

// Therefore, the value of

// sum1 = one + two = 1 + 2 = 3

// sum2 = three + four = 3 + 4 = 7

// Now, the value of sum1 is lesser than the value stored in five, but the value stored in sum2 is greater than five. Therefore, the answer isYes

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int one = scanner.nextInt();

        int two = scanner.nextInt();

        int three = scanner.nextInt();

        int four = scanner.nextInt();

        int five = scanner.nextInt();

        int sum1 = one + two;
        int sum2 = three + four;
        if (sum1 > five || sum2 > five) {
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }
    }
}
