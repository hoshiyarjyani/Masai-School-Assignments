import java.util.Scanner;

class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int R = sc.nextInt();
        int C = sc.nextInt();
        int[][] matrix = new int[R][C];

        for (int i = 0; i < R; i++) {
            for (int j = 0; j < C; j++) {
                matrix[i][j] = sc.nextInt();
            }
        }
        int K = sc.nextInt();

        specificDiagonals(R, C, matrix, K);

    }

    static void specificDiagonals(int R, int C, int[][] matrix, int K) {
        // findout the element in the matrix
        int r = 0, c = 0;
        for (int i = 0; i < R; i++) {
            for (int j = 0; j < C; j++) {
                if (matrix[i][j] == K) {
                    r = i;
                    c = j;
                }
            }
        }
        // top left digonol to bottom right
        StringBuilder temp = new StringBuilder();
        for (int i = 0; i < R; i++) {
            for (int j = 0; j < C; j++) {
                if (j - i == (c - r)) {
                    temp.append(matrix[i][j] + " ");
                }
            }
        }
        System.out.println(temp.toString().trim());
        // top right digonol to bottom left
        StringBuilder temp1 = new StringBuilder();
        for (int i = 0; i < R; i++) {
            for (int j = 0; j < C; j++) {
                if (j + i == (c + r)) {
                    temp1.append(matrix[i][j] + " ");
                }
            }
        }

        System.out.println(temp1.toString().trim());
    }

}