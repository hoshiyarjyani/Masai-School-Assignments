// Map Characters & Compare -28:49:5
// Description

// You are given a string, stored in a variablestr, and the length of the string is stored in the variableN

// You are also given a number stored in a variable with the nameK

// The string contains only lowercase English alphabets, such that each character is mapped to a number starting from 1, so that the mapping is as follows

// a - 1
// b - 2
// c - 3
// .
// .
// .
// .
// .
// .
// .
// .
// z - 26

// You have to find the sum of all characters present in the string, and print the output according to the following conditions
// 1\. If value of sum is greater than the value stored in K, print "Yes", without quotes

// 2\. Else print "No", without quotes

// For example, consider the value stored inN = 6, andstr = nrupul, andK = 45. Then, the sum of characters according to the mapping is
// n - 14
// r - 18
// u - 21
// p - 16
// u - 21
// l - 12

// Therefore, sum = 14 + 18 + 21 + 16 + 21 + 12 = 102, which is greater than the value stored in K = 45, hence the output is Yes

// Note : The string contains only lower case English Alphabets

// Input
// The first line of the input contains the value stored inN

// The second line of the input contains the value stored instr

// The third line of the input contains the value stored inK

// Output
// PrintYesorNoaccording to the condition, mentioned in the problem statement

// Sample Input 1 

// 6
// nrupul
// 45
// Sample Output 1

// Yes
// Hint

// the value stored inN = 6, andstr = nrupul, andK = 45. Then, the sum of characters according to the mapping is

// n - 14
// r - 18
// u - 21
// p - 16
// u - 21
// l - 12

// Therefore, sum = 14 + 18 + 21 + 16 + 21 + 12 = 102, which is greater than the value stored in K = 45, hence the output is Yes

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        String str = sc.next();

        int k = sc.nextInt();
        int sum = findSum(str);
        if (sum > k) {
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }
    }

    public static int findSum(String str) {
        int sum = 0;
        for (int i = 0; i < str.length(); i++) {
            char c = str.charAt(i);
            int val = c - 'a' + 1;
            sum += val;
        }
        return sum;
    }
}
