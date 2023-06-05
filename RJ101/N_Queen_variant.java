import java.util.Scanner;

public class Main {

    static int count = 0;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String input = sc.nextLine();
        int N = Integer.parseInt(input.trim());
        int[][] matrix = new int[N][N];

        Nqueen(matrix, 0);
        System.out.println(count);
    }

    static void Nqueen(int[][] matrix, int row) {
        if (row == matrix.length) {
           // print(matrix);
            count++;
            return;
        }

        for (int i = 0; i < matrix.length; i++) {
            if (checkSafe(matrix, row, i)) {
                matrix[row][i] = 1;
                Nqueen(matrix, row + 1);
                matrix[row][i] = 0;
            }
        }
    }

    static boolean checkSafe(int[][] matrix, int row, int col) {
        // upward
        for (int i = row; i >= 0; i--) {
            if (matrix[i][col] == 1) {
                return false;
            }
        }
        // left upward
        for (int i = row - 1, j = col - 1; i >= 0 && j >= 0; i--, j--) {
            if (matrix[i][j] == 1) {
                return false;
            }
        }
        // right upward
        for (int i = row - 1, j = col + 1; i >= 0 && j < matrix.length; i--, j++) {
            if (matrix[i][j] == 1) {
                return false;
            }
        }
        return true;
    }

    // static void print(int[][] arr) {
    //     for (int i = 0; i < arr.length; i++) {
    //         for (int j = 0; j < arr[i].length; j++) {
    //             System.out.print(arr[i][j] + " ");
    //         }
    //         System.out.println();
    //     }
    // }
}


Sample Input

4

Sample Output

2