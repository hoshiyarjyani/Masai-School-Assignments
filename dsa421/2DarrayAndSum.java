
import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int r = sc.nextInt();
        int c = sc.nextInt();
        int p = sc.nextInt();

        int[][] arr = new int[r][c];

        for (int i = 0; i < r; i++) {
            for (int j = 0; j < c; j++) {
                arr[i][j] = sc.nextInt();
            }
        }

        int count = 0;

        // Check horizontally
        for (int i = 0; i < r; i++) {
            for (int j = 0; j < c - 2; j++) {
                if (arr[i][j] + arr[i][j + 1] + arr[i][j + 2] == p) {
                    count++;
                }
            }
        }

        // Check vertically
        for (int i = 0; i < r - 2; i++) {
            for (int j = 0; j < c; j++) {
                if (arr[i][j] + arr[i + 1][j] + arr[i + 2][j] == p) {
                    count++;
                }
            }
        }

        // Check diagonally (from top left to bottom right)
        for (int i = 0; i < r - 2; i++) {
            for (int j = 0; j < c - 2; j++) {
                if (arr[i][j] + arr[i + 1][j + 1] + arr[i + 2][j + 2] == p) {
                    count++;
                }
            }
        }

        // Check diagonally (from top right to bottom left)
        for (int i = 0; i < r - 2; i++) {
            for (int j = 2; j < c; j++) {
                if (arr[i][j] + arr[i + 1][j - 1] + arr[i + 2][j - 2] == p) {
                    count++;
                }
            }
        }

        System.out.println(count);
    }
}