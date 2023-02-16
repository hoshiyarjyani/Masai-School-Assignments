import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        int[][] matrix = new int[n][m];
        int sum1 = 0, sum2 = 0;

        // Input matrix
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                matrix[i][j] = sc.nextInt();
            }
        }

        // Calculate sum1
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                if ((i == 0 && j > (m - 1) / 2) || (i == n - 1 && j < (m - 1) / 2)) {
                    sum1 += matrix[i][j];
                } else if (j == (m - 1) / 2) {
                    sum1 += matrix[i][j];
                }
            }
        }
        // Calculate sum2
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                if ((j == m - 1 && i > (n - 1) / 2) || (j == 0 && i < (n - 1) / 2)) {
                    sum2 += matrix[i][j];
                } else if (i == (n - 1) / 2) {
                    sum2 += matrix[i][j];
                }
            }
        }
        // Output the absolute difference between sum1 and sum2
        System.out.println(Math.abs(sum1 - sum2));
    }
}
