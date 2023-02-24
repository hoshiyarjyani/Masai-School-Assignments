//1
//2 3
//1 2 3 
//2 5 8

import java.util.Scanner;

class Main {
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

    static void spiralTraversal(int[][] matrix, int r, int c) {
        int rowStart = 0;
        int rowEnd = r - 1;
        int colStart = 0;
        int colEnd = c - 1;
        int count = 0;
        StringBuilder sb = new StringBuilder(); // let str = "";
        while (count < r * c) {
            // top to bottom
            for (int i = rowStart; i <= rowEnd; i++) {
                if (count == r * c) {
                    break;
                }
                sb.append(matrix[i][colStart] + " ");  // str+=matrix[i][colStart] + " ";
                count++;
            }
            colStart++;

            // left to right

            for (int i = colStart; i <= colEnd; i++) {
                if (count == r * c) {
                    break;
                }
                sb.append(matrix[rowEnd][i] + " ");
                count++;
            }
            rowEnd--;

            // bottom to top

            for (int i = rowEnd; i >= rowStart; i--) {
                if (count == r * c) {
                    break;
                }
                sb.append(matrix[i][colEnd] + " ");
                count++;
            }
            colEnd--;

            // right to left
            for (int i = colEnd; i >= colStart; i--) {
                if (count == r * c) {
                    break;
                }
                sb.append(matrix[rowStart][i] + " ");
                count++;
            }
            rowStart++;

        }
    }
}