// Smallest and Largest of all -48:53:52
// Description

// Given an array,arrwhich hasNintegers.

// You need to print the smallest and largest element present in the array each on new lines.

// Input
// Input Format

// The first line contains an integerN.

// The second line containsNspace separated integers, which are integers of arrayarr.

// Constraints

// 1 <= N <= 100

// Output
// Output Format

// One first line, print minimum of all elements.

// On the second line, print the maximum of all elements.

// Sample Input 1 

// 4
// -2 0 8 4
// Sample Output 1

// -2
// 8
// Hint

// Integers in array are:-[-2, 0, 8, 4]

// Minimum integer in array[-2, 0, 8, 4]is-2

// Maximum integer in array[-2, 0, 8, 4]is-8

// Language: 

// Theme: 
// Font Size: 12

//   
//    Test against custom input
// Status  Accepted

import java.util.Scanner;

public class MaxMin {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int n = input.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = input.nextInt();
        }

        int smallest = arr[0];
        int largest = arr[0];
        for (int i = 1; i < n; i++) {
            if (arr[i] < smallest) {
                smallest = arr[i];
            }
            if (arr[i] > largest) {
                largest = arr[i];
            }
        }

        System.out.println(smallest);
        System.out.println(largest);
    }
}
