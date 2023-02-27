// Pattern of W Ended
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

// \/\/
// Sample Input 2 

// 4
// Sample Output 2

// \      /\      /
//  \    /  \    /
//   \  /    \  /
//    \/      \/
// Hint

// Self Explanatory

//Method 1

import java.util.*;

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for (int i = 0; i < n; i++) {
            String str = "";
            for (int j = 0; j < 2 * n; j++) {
                if (j == i) {
                    str += "\\";
                } else if (j == 2 * n - i - 1) {
                    str += "/";
                } else {
                    str += " ";
                }
            }
            for (int j = 0; j < 2 * n; j++) {
                if (j == i) {
                    str += "\\";
                } else if (j == 2 * n - i - 1) {
                    str += "/";
                    break;
                } else {
                    str += " ";
                }
            }
             System.out.println(str);
        }
    }
}

// Method 2

class Main1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for (int i = 0; i < n; i++) {
            String str = "";
            for (int j = 0; j < 4 * n; j++) {
                if (i == j || j == i + (2 * n)) {
                    System.out.print("\\");
                } else if (i + j == (2 * n) - 1) {
                    System.out.print("/");
                } else if (i + j == (4 * n) - 1) {
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