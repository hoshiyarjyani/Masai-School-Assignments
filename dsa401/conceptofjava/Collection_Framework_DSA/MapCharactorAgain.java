// Map Characters Again -28:25:44
// Description

// You are given a number stored in variable with the nameN

// You have to map all the lowercase English characters, to a number starting from the value stored inN, and incrementing it by 1 at every step

// For example, consider the value stored inN = 30, then the required output will be

// a-30
// b-31
// c-32
// d-33
// e-34
// f-35
// g-36
// h-37
// i-38
// j-39
// k-40
// l-41
// m-42
// n-43
// o-44
// p-45
// q-46
// r-47
// s-48
// t-49
// u-50
// v-51
// w-52
// x-53
// y-54
// z-55

// Input
// The first and the only line of the input contains the value stored inN

// Output
// Print the output as shown in the problem statement

// Sample Input 1 

// 30
// Sample Output 1

// a-30
// b-31
// c-32
// d-33
// e-34
// f-35
// g-36
// h-37
// i-38
// j-39
// k-40
// l-41
// m-42
// n-43
// o-44
// p-45
// q-46
// r-47
// s-48
// t-49
// u-50
// v-51
// w-52
// x-53
// y-54
// z-55
// Hint

// In the sample test case, the value stored inN = 30

// Therefore, the required output will be

// a-30
// b-31
// c-32
// d-33
// e-34
// f-35
// g-36
// h-37
// i-38
// j-39
// k-40
// l-41
// m-42
// n-43
// o-44
// p-45
// q-46
// r-47
// s-48
// t-49
// u-50
// v-51
// w-52
// x-53
// y-54
// z-55

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        findSum(n);

    }

    public static void findSum(int n) {
        int no = 0;
        for (int i = n; i < n + 26; i++) {
            int val = 'a' + no++;
            char c = (char) val;
            System.out.println(c + "-" + i);

        }

    }
}
