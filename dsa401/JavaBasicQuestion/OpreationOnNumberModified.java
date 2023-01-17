// Operation on Numbers Modified I -51:28:49
// Description

// You are given a number stored in a variable with the name, and another number stored in a variable with the nameM

// You have to perform the following operations on the value stored inN

// 1. Multiply the value stored in N with 5
// 2. Add 3 to the value stored in N 
// 3. Subtract 10 from the value stored in N
// You are given another number stored in the variableM

// If the value after of after performing the above operations is greater thanM, printGreater!, else if the value is equal, printEqual!, else printLesser!

// For example, consider the value stored inN = 5, and the value stored inM = 10

// Then, after performing the above operation, the value stored inNbecomes

// 1. N = N*5 = 25
// 2. N = N + 3 = 28
// 3. N = N - 10 = 18
// Now, the value stored inMis 10, which is lesser than the value stored inN. Therefore, the output isGreater!

// Input
// The first and the only line of the input contains the value stored inNandM

// Output
// Print the output according to the condition shown in the problem statement

// Sample Input 1 

// 5 10 
// Sample Output 1

// Greater!
// Hint

// In the sample test case, consider the value stored inN = 5, and the value stored inM = 10

// Then, after performing the above operation, the value stored inNbecomes
// 1. N = N*5 = 25
// 2. N = N + 3 = 28
// 3. N = N - 10 = 18
// Now, the value stored inMis 10, which is lesser than the value stored inN. Therefore, the output isGreater!

import java.util.Scanner;

public class OpreationOnNumberModified {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int M = sc.nextInt();

        N = N * 5;
        N = N + 3;
        N = N - 10;

        if (N > M) {
            System.out.println("Greater!");
        } else if (N == M) {
            System.out.println("Equal!");
        } else {
            System.out.println("Lesser!");
        }
    }
}
