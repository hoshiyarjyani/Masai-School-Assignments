// Map Characters & Sum -28:39:46
// Description

// You are given a number stored in a variable with the nameN

// You are also, given a string, whose length is stored in a variable with the nameK, and the string is stored in a variable with the namestr

// You have to map all lower case English characters, starting from the value stored inN.

// For example, if the value stored inN = 30, then the mapping of the characters will be as follows

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
// Finally, you have to print the sum of all the characters, present in the stringstr, according to the values mapped above

// For example, if the value stored instr = "abc", then the required output will be

// 30 + 31 + 32 = 93, which is the required output

// Input
// The first line of the input contains the value stored inN

// The second line of the input contains the value stored inK

// The last line of the input contains the value stored in thestr

// Output
// Print the sum of characters, according to the values mapped, as shown in the problem statement

// Sample Input 1 

// 30
// 3
// abc
// Sample Output 1

// 93
// Hint

// In the sample test case, the value stored inN = 30, then the mapping of the characters will be as follows

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
// Finally, you have to print the sum of all the characters, present in the stringstr, according to the values mapped above

// For example, if the value stored instr = "abc", then the required output will be

// 30 + 31 + 32 = 93, which is the required output

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int k = sc.nextInt();
        int n = sc.nextInt();

        String str = sc.next();

        int sum = findSum(str, k);

        System.out.println(sum);

    }

    public static int findSum(String str, int k) {
        int sum = 0;
        for (int i = 0; i < str.length(); i++) {
            char c = str.charAt(i);
            int val = c - 'a' + k;
            sum += val;
        }
        return sum;
    }
}
