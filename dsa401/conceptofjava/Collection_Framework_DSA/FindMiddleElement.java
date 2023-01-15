// Element in the middle Ended
// Description

// Given an unsorted array of size, N. Find the first element in the array such that all of its left elements are smaller and all right elements to it are greater than it.

// Note: Left and right side elements can be equal to the required element. And extreme elements cannot be required element.
// Input
// Input Format

// The first line contains an integer n denoting the size of the array and the second line contains n space separated array elements.

// Constraints

// n <= 1000

// Ai <= 10000
// Output
// For each test case, in a new line print the required element. If no such element present in the array then print -1.

// Sample Input 1 

// 5
// 4 3 6 7 8
// Sample Output 1

// 6

import java.util.*;

public class FindMiddleElement {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        int result = -1;
        boolean flag = true;
        for (int i = 0; i < n; i++) {
            flag = true;
            // check if left elements are strictly smaller
            for (int j = 0; j < i; j++) {
                if (arr[j] >= arr[i]) {
                    flag = false;
                    break;
                }
            }
            // check if right elements are strictly greater
            for (int j = i + 1; j < n; j++) {
                if (arr[j] < arr[i]) {
                    flag = false;
                    break;
                }
            }
            if (flag) {
                result = arr[i];
                break;
            }
        }
        System.out.println(result);
    }
}
