public class starSqurePattren {

    public static void yourFirstPattern(int num) {
        // write your code here
        for (int i = 0; i < num; i++) {
            for (int j = 0; j < num; j++) {
                System.out.print("*" + " ");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        yourFirstPattern(8);
    }
}
// Your First Pattern -27:22:19
// Description

// You are given a number stored in a variable with the namen

// You have to printnlines, and on each line you have to printnstars

// For example, consider the value stored inn = 4. Then, the required output
// will be

// * * * *
// * * * *
// * * * *
// * * * *

// Input
// The first and the only line of the input contains the value stored in the
// variablen

// Output
// Print the pattern as shown in the problem statement

// Sample Input 1

// 5
// Sample Output 1

// * * * * *
// * * * * *
// * * * * *
// * * * * *
// * * * * *
// Hint

// In the sample test case, the value stored inn = 5. Therefore, the required
// output is

// * * * * *
// * * * * *
// * * * * *
// * * * * *
// * * * * *