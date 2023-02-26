import java.util.*;

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int r = sc.nextInt();
        int c = sc.nextInt();
        char[][] matrix = new char[r][c];
        for (int i = 0; i < r; i++) {
            for (int j = 0; j < c; j++) {
                matrix[i][j] = sc.next().charAt(0);
            }
        }
        String word = sc.next();
        boolean found = search(matrix, word);
        System.out.println(found ? "YES" : "NO");

    }

    static boolean search(char[][] matrix, String word) {
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[0].length; j++) {
                if (matrix[i][j] == word.charAt(0)) {
                    if (matchWord(matrix, word, i, j, 0)) {
                        return true;
                    }
                }
            }
        }
        return false;
    }

    static boolean matchWord(char[][] matrix, String word, int row, int col, int index) {
        if (index == word.length()) {
            return true;
        }
        if (row < 0 || row >= matrix.length || col < 0 || col >= matrix[0].length
                || matrix[row][col] != word.charAt(index)) {
            return false;
        }
        char temp = matrix[row][col];
        matrix[row][col] = '$';
        boolean found = matchWord(matrix, word, row - 1, col, index + 1)
                || matchWord(matrix, word, row + 1, col, index + 1) || matchWord(matrix, word, row, col - 1, index + 1)
                || matchWord(matrix, word, row, col + 1, index + 1);
        matrix[row][col] = temp;
        return found;
    }

}