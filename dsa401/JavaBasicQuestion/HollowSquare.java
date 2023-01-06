// Sample Input 2 

// 4
// Sample Output 2

// * * * *
// *     *
// *     *
// * * * *

package JavaBasicQuestion;

import java.util.Scanner;

public class HollowSquare {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        sc.close();

        for (int i = 1; i <= N; i++) {

            for (int j = 1; j <= N; j++) {
                if (i == 1 || i == N || j == 1 || j == N) {
                    System.out.print("* ");
                } else {
                    System.out.print("  ");
                }
            }

            System.out.println();
        }
    }
}
