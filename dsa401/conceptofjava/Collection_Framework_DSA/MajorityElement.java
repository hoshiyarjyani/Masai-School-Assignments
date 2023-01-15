// Majority element 
// Description

// Given an array A having N non-negative integers. Find the element that occurs more than N/2 times. If no such element is there then print -1.

// Input
// First line: Single integer T denoting the number of test cases.
// For each test case:
// First line: Single integer denoting the value of N.
// Next line contains N single space separated integers denoting the elements of array A.
// Constraints:
// 1 <= T<= 10
// 1<= N <= 100000
// 0 <= A[ i ] <= 100000

// Output
// For each test case, print in a new line a single integer denoting the majority element.

// Sample Input 1 

// 2
// 6
// 1 1 1 1 2 3
// 5
// 1 1 2 2 3
// Sample Output 1

// 1
// -1
// Hint

// Given test cases :
// Test case 1 :
// N = 6,
// A : 1 1 1 1 2 3

// 1 has occurred 4 times which is greater than N/2. Hence 1 is the majority element.

// Test case 2 :
// N = 5,
// A : 1 1 2 2 3

// None of the elements occurred more than N/2 times. Hence the answer for this case is -1.

import java.util.Scanner;
import java.util.HashMap;

public class MajorityElement {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            int n = sc.nextInt();
            int[] a = new int[n];
            for (int i = 0; i < n; i++) {
                a[i] = sc.nextInt();
            }
            int majorityElement = findMajorityElement(a, n);
            System.out.println(majorityElement);
        }
        sc.close();
    }

    public static int findMajorityElement(int[] a, int n) {
        HashMap<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < n; i++) {
            if (map.containsKey(a[i])) {
                map.put(a[i], map.get(a[i]) + 1);
            } else {
                map.put(a[i], 1);
            }
        }
        for (int key : map.keySet()) {
            if (map.get(key) > n / 2) {
                return key;
            }
        }
        return -1;
    }
}

// import java.util.Scanner;

// public class Main {
// public static void main(String[] args) {
// Scanner sc = new Scanner(System.in);
// int t = sc.nextInt();
// while (t-- > 0) {
// int n = sc.nextInt();
// int[] a = new int[n];
// for (int i = 0; i < n; i++) {
// a[i] = sc.nextInt();
// }
// int majorityElement = findMajorityElement(a, n);
// System.out.println(majorityElement);
// }
// sc.close();
// }

// public static int findMajorityElement(int[] a, int n) {
// int majorityElement = -1;
// int count = 0;
// for (int i = 0; i < n; i++) {
// if (count == 0) {
// majorityElement = a[i];
// count = 1;
// } else if (a[i] == majorityElement) {
// count++;
// } else {
// count--;
// }
// }

// count = 0;
// for (int i = 0; i < n; i++) {
// if (a[i] == majorityElement) {
// count++;
// }
// }
// if (count > n / 2) {
// return majorityElement;
// } else {
// return -1;
// }
// }
// }
