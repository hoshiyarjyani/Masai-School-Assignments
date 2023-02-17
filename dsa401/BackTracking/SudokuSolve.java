import java.util.*;

class Main {
    static boolean flag = false;

    public static void printBoard(int[][] board) {
        for (int i = 0; i < board.length; i++) {
            for (int j = 0; j < board[0].length; j++) {
                System.out.print(board[i][j] + " ");
            }
            System.out.println();
        }
    }

    public static void sudokuSolver(int[][] matrix, int row, int col) {
        // base case
        if (row == matrix.length) {
            printBoard(matrix);
            flag = true;
            return;
        }

        int next_row = 0;
        int next_col = 0;

        // figuring out the next position
        if (col == matrix[0].length - 1) {
            next_row = row + 1;
            next_col = 0;
        } else {
            next_row = row;
            next_col = col + 1;
        }

        if (matrix[row][col] != 0) {
            sudokuSolver(matrix, next_row, next_col);
        } else {
            for (int i = 1; i <= 9; i++) {
                if (checkSafePosition(matrix, row, col, i)) {
                    matrix[row][col] = i;
                    sudokuSolver(matrix, next_row, next_col);
                    matrix[row][col] = 0;
                }
            }
        }
    }

    public static boolean checkSafePosition(int[][] board, int row, int col, int value) {
        // vertical check or row check
        for (int i = 0; i < 9; i++) {
            if (board[i][col] == value)
                return false;
        }
        // horizontal check or column check
        for (int i = 0; i < 9; i++) {
            if (board[row][i] == value)
                return false;
        }
        // grid check
        int x = (row / 3) * 3;
        int y = (col / 3) * 3;
        for (int i = x; i < x + 3; i++) {
            for (int j = y; j < y + 3; j++) {
                if (board[i][j] == value)
                    return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        // Write Code Here
        Scanner sc = new Scanner(System.in);
        int[][] matrix = new int[9][9];
        for (int i = 0; i < 9; i++) {
            for (int j = 0; j < 9; j++) {
                matrix[i][j] = sc.nextInt();
            }
        }
        sudokuSolver(matrix, 0, 0);
        if (flag == false) {
            System.out.println(-1);
        }
    }
}
