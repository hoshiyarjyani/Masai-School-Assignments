// Discover number -67:10:4
// Description

// You are given an array A of size N, and Q queries to deal with. For each query, you are given an integer X, and you're supposed to find out if X is present in the array A or not.

// Input
// Input Format

// The first line contains two integers, N and Q, denoting the size of array A and number of queries.

// The second line contains N space separated integers, denoting the array of elements Ai.

// The next Q lines contain a single integer X per line.

// Constraints

// 1 <= N, Q <= 10^5

// 1 <= Ai <= 10^9

// 1 <= X <= 10^9

// Output
// Output Format

// For each query, print YES if the X is in the array, otherwise print NO.

// Sample Input 1 

// 5 10
// 50 40 30 20 10
// 10
// 20
// 30
// 40
// 50
// 60
// 70
// 80
// 90
// 100
// Sample Output 1

// YES
// YES
// YES
// YES
// YES
// NO
// NO
// NO
// NO
// NO
// Language: 

// Theme: 
// Font Size: 20

//   
//    Test against custom input
// Masai School

package BinarySearch;

import java.util.*;

public class DiscoverNumber {

    public static boolean search(int[] arr, int x) {
        int left = 0;
        int right = arr.length - 1;
        while (left <= right) {
            int mid = left + (right - left) / 2;
            if (arr[mid] < x) {
                left = mid + 1;
            } else if (arr[mid] > x) {
                right = mid - 1;
            } else {
                return true;
            }
        }
        return false;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int q = scanner.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = scanner.nextInt();
        }
        Arrays.sort(arr);
        for (int i = 0; i < q; i++) {
            int x = scanner.nextInt();
            if (search(arr, x)) {
                System.out.println("YES");
            } else {
                System.out.println("NO");
            }
        }
    }
}
