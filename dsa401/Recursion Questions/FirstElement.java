// What is a good string?
// Description

// Deletion of characters to make them nice

// Let's call a string good if its length is even, and every character in odd position of this string is different from the next character (the first character is different from the second, the third is different from the fourth, and so on).

// For example, the strings "good", "string" and "xyyx" are good strings, and the strings "bad", "aa" and "aabc" are not good. Note that the empty string is considered good.

// You are given a string s, you have to delete minimum number of characters from this string so that it becomes good.

// Input
// Input Format :

// The first line contains one integer n, the number of characters in string s.

// The second line contains the string s, consisting of exactly n lowercase Latin letters.

// Constraints :

// 1<= n <= 2*10^5

// Output
// In the first line, print one integer k (0≤k≤n) - the minimum number of characters you have to delete from s to make it good.

// In the second line, print the resulting string s. If it is empty, you may leave the second line blank, or not print it at all.

// Sample Input 1 

// 4
// good
// Sample Output 1

// 0
// good

import java.util.Scanner;

public class FirstElement {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        String str = sc.next();
        int count = 0;
        for (int i = 0; i < n - 1; i += 2) {
            if (str.charAt(i) == str.charAt(i + 1)) {
                count++;
            }
        }
        System.out.println(count);
        if (count == 0) {
            System.out.println(str);
        } else {
            StringBuilder sb = new StringBuilder();
            for (int i = 0; i < n - 1; i += 2) {
                if (str.charAt(i) != str.charAt(i + 1)) {
                    sb.append(str.charAt(i)).append(str.charAt(i + 1));
                }
            }
            if (n % 2 == 1) {
                sb.append(str.charAt(n - 1));
            }
            System.out.println(sb);
        }
    }
}



// Second Solution
// import java.util.Scanner;

// public class Main {
//     public static void main(String[] args) {
//         Scanner scanner = new Scanner(System.in);
//         int n = scanner.nextInt();
//         int[] arr = new int[n];
//         for (int i = 0; i < n; i++) {
//             arr[i] = scanner.nextInt();
//         }
//         int result = findElement(arr);
//         System.out.println(result);
//     }

//     static int findElement(int[] arr) {
//         int maxSeen = Integer.MIN_VALUE;
//         for (int i = 0; i < arr.length; i++) {
//             if (arr[i] > maxSeen) {
//                 maxSeen = arr[i];
//                 boolean allGreater = true;
//                 for (int j = i + 1; j < arr.length; j++) {
//                     if (arr[j] <= arr[i]) {
//                         allGreater = false;
//                         break;
//                     }
//                 }
//                 if (allGreater) {
//                     return arr[i];
//                 }
//             }
//         }
//         return -1;
//     }
// }
