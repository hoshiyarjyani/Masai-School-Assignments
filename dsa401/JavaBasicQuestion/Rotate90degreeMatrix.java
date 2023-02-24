import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int R = scanner.nextInt();
        int[][] matrix = new int[R][R];

        for (int i = 0; i < R; i++) {
            for (int j = 0; j < R; j++) {
                matrix[i][j] = scanner.nextInt();
            }
        }
        rotateBy90(R, matrix);
        scanner.close();
    }

    static void rotateBy90(int R, int[][] matrix) {
        for (int i = R - 1; i >= 0; i--) {
            StringBuilder temp = new StringBuilder();
            for (int j = 0; j < R; j++) {
                temp.append(matrix[j][i] + " ");
            }
            System.out.println(temp);
        }
    }
}
