package conceptofjava;

import java.util.Scanner;

public class EvenOddSum {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int oddSum = 0, evenSum = 0;
        for (int i = 0; i < n; i++) {
            int num = scanner.nextInt();
            if (num % 2 == 0) {
                evenSum += num;
            } else {
                oddSum += num;
            }
        }
        if (oddSum > evenSum) {
            System.out.println("Odd");
        } else {
            System.out.println("Even");
        }
    }
}
