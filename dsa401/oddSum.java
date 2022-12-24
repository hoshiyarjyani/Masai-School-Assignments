public class oddSum {

    public static void oddSumAgain(int num) {
        // write your code here
        int sum = 0;
        for (int i = 1; i <= num; i++) {
            if (i % 2 == 1) {
                sum += i;
            }
            System.out.println(sum);
        }
    }

    public static void main(String[] args) {
        oddSumAgain(14);
    }
}

// Odd Sum Again -27:6:27
// Description

// You are given a number stored in a variable with the nameN

// You have to printNlines such that on each line you find the sum of all odd
// numbers in the range of[1,i], whereirepresents all the numbers in the range
// of[1,N]

// For example, consider the value stored inN = 3

// Then, first we find the sum of all even numbers, in the range of [1,1], which
// comes out to be 1, as there is one odd number (1) in the range

// Then, we find the sum of all even numbers, in the range of [1,2], which comes
// out to be 1, as there is only 1 odd number (1). Hence, the sum becomes 1

// Finally, we find the sum of all even numbers in the range of [1,3], which
// comes out to be 4, as there are two odd numbers (1,3) in the given range.
// Hence, the sum becomes 4

// Therefore, the final output becomes

// 1
// 1
// 4

// Input
// The first and the only line of the input contains the value stored inN

// Output
// PrintNlines such that on each line you find the sum of all odd numbers in the
// range of[1,i], whereirepresents all the numbers in the range of[1,N], as
// shown in the problem statement

// Sample Input 1

// 4
// Sample Output 1

// 1
// 1
// 4
// 4
// Hint

// In the sample test case, the value stored inN = 4.

// Then, first we find the sum of all odd numbers, in the range of [1,1], which
// comes out to be 1, as there is only 1 odd number (1) in the range

// Then, we find the sum of all odd numbers, in the range of [1,2], which comes
// out to be 1, as there is only 1 odd number (1). Hence, the sum becomes 2

// Then, we find the sum of all odd numbers in the range of [1,3], which comes
// out to be 4, as there are 2 odd numbers (1,3). Hence, the sum becomes 4

// Then, finally we find the sum of all odd numbers in the range of [1,4], which
// comes out to be 4, as there are two odd numbers (1,3)

// Therefore, the final output becomes

// 1
// 1
// 4
// 4
