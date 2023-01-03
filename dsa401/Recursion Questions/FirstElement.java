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


import java.util.Scanner;

public class FirstElement {

    static int myFun(int[] arr, int n) {
        int x = -1;
        if (n == 0) {
            return x;
        } else if (n == 1) {
            int p = arr[0];
            return p;
        } else {
            // 5
            // 4 3 6 7 8
           
            for (int i = 0; i < n; i++) {
                for (int j = i+1; j < n; j++) {
                    if (arr[i] <= arr[j]) {
                        x = i;
                    } else {
                        x = -1;
                        break;
                    }
                }
                boolean check = true;
                if (x != -1) {
                    for (int k = i - 1; k >= 0; k--) {
                        if (arr[i] >= arr[k]) {
                            check = true;
                        } else {
                            check = false;
                            break;
                        }
                    }
                    if (check == true && i != -1) {
                        int m = arr[i];
                        return m;
                    }
                    check = true;
                }
            }
            return -1;
        }
        
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int tc = sc.nextInt();
        int[] arr = new int[tc];

        for (int i = 0; i < tc; i++) {
            arr[i] = sc.nextInt();
        }
        int ans = myFun(arr, tc);
        System.out.println(ans);
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
