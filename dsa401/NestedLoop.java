public class NestedLoop {
    public static void anotherNested(int num) {
        // write your code here
        for (int i = 1; i <= num; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.println(j);
            }
        }
    }

    public static void main(String[] args) {
        anotherNested(5);
    }
}

// Another Nested Loop -27:17:29
// Description

// You are given a number stored in a variable with the namenum

// Printnumlines such that there are numbers from1 to i, such that on each line
// you print only one number. Also,irepresents all the numbers from 1 tonum

// For example, consider the value stored innum = 5

// Therefore, the required output will be

// 1
// 1
// 2
// 1
// 2
// 3
// 1
// 2
// 3
// 4
// 1
// 2
// 3
// 4
// 5

// Input
// The first and the only line of the input contains the value stored innum.

// Output
// Print the output as shown in the problem statement

// Sample Input 1

// 4
// Sample Output 1

// 1
// 1
// 2
// 1
// 2
// 3
// 1
// 2
// 3
// 4
// Hint

// In the sample test case, the value stored innum = 4. Therefore, we start
// printing the numbers, such that, we print all the numbers from [1,1], then
// all the numbers from [1,2], then all the numbers from [1,3], and finally all
// the numbers from [1,4]

// Hence, the final output becomes

// 1
// 1
// 2
// 1
// 2
// 3
// 1
// 2
// 3
// 4
// Language:

// Theme:
// Font Size: 20

//
// Test against custom input
// Status Accepted
