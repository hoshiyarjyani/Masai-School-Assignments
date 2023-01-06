package JavaBasicQuestion;

import java.util.Scanner;

public class PattranStar {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt(); // read in value of N from the input
        sc.close();

        for (int i = 1; i <= N; i++) {
            // print out i asterisks on each line
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            // after printing the asterisks, move to the next line
            System.out.println();
        }
    }
}
