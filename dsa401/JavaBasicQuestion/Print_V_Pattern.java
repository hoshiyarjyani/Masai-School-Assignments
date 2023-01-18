// V Pattern -27:16:40
// Description

// You need to print pattern as given in Sample Input.
// Note:- Make sure to check for spaces. In output, there is no spaces at end of each line.

// Input
// First line contains N. (1<= N <= 10)

// Output
// Print pattern for N.

// Sample Input 1 

// 1
// Sample Output 1

// \/
// Sample Input 2 

// 4
// Sample Output 2

// \      /
//  \    /
//   \  /
//    \/

import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (i == j) {
                    System.out.print("\\");
                } else {
                    System.out.print(" ");
                }
            }
            for (int j = 0; j < n; j++) {
                if (j == n - 1 - i) {
                    System.out.print("/");
                    break;
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
}
