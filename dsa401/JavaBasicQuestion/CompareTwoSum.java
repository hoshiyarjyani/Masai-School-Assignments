// Compare Two Sum -29:28:18
// Description

// You are given six numbers, stored in the variables with the following names

// one, two, three, four, five, six

// Find the value ofsum1andsum2, such that

// sum1 = one + two

// sum2 = four + five

// If both the following two conditions are true, printYes, else printNo

// sum1 > three

// sum2 > six

// Input
// First and the only line of input contains, the values stored inone, two, three, four, five, six

// Output
// PrintYes, if both the conditions given in the problem statement are true, else printNo

// Sample Input 1 

// 1 2 3 4 5 6
// Sample Output 1

// No
// Hint

// In the sample test case, the value stored inone = 1, two = 2, three = 3, four = 4, five = 5, six = 6

// Therefore, the value of sum1 and sum2 becomes

// sum1 = one + two = 1 + 2 = 3

// sum2 = four + five = 4 + 5 = 9

// Now, the value of sum2 is greater than the value stored in six, but the value stored in sum1 is not greater than the value stored in three, Therefore, the answer isNo
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int one = scanner.nextInt();

        int two = scanner.nextInt();

        int three = scanner.nextInt();

        int four = scanner.nextInt();

        int five = scanner.nextInt();

        int six = scanner.nextInt();

        int sum1 = one + two;
        int sum2 = four + five;
        if (sum1 > three && sum2 > six) {
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }
    }
}
