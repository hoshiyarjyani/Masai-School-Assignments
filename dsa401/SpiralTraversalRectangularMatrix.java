import java.util.Scanner;

public class Main {
    public static void spiralTraversal(int[][] matrix, int r, int c) {
        int rowStart = 0, rowEnd = r - 1, colStart = 0, colEnd = c - 1;
        int count = 0;
        StringBuilder sb = new StringBuilder();
        while (count < r * c) {
            for (int i = rowStart; i <= rowEnd; i++) {
                if (count == r * c) {
                    break;
                }
                sb.append(matrix[i][colStart] + " ");
                count++;
            }
            colStart++;
            for (int i = colStart; i <= colEnd; i++) {
                if (count == r * c) {
                    break;
                }
                sb.append(matrix[rowEnd][i] + " ");
                count++;

            }
            rowEnd--;
            for (int i = rowEnd; i >= rowStart; i--) {
                if (count == r * c) {
                    break;
                }
                sb.append(matrix[i][colEnd] + " ");
                count++;

            }
            colEnd--;
            for (int i = colEnd; i >= colStart; i--) {
                if (count == r * c) {
                    break;
                }
                sb.append(matrix[rowStart][i] + " ");
                count++;
            }
            rowStart++;
        }
        System.out.println(sb.toString());
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int tc = sc.nextInt();
        while (tc-- > 0) {
            int r = sc.nextInt();
            int c = sc.nextInt();
            int[][] matrix = new int[r][c];
            for (int i = 0; i < r; i++) {
                for (int j = 0; j < c; j++) {
                    matrix[i][j] = sc.nextInt();
                }
            }
            spiralTraversal(matrix, r, c);
        }
    }
}
