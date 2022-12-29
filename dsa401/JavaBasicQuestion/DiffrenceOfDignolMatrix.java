package JavaBasicQuestion;

public class DiffrenceOfDignolMatrix {

    public static void main(String[] args) {
        int matrix[][] = {
                { 1, 2, 3, 4 },
                { 5, 6, 3, 1 },
                { 7, 1, 2, 3 },
                { 5, 8, 4, 6 }
        };

        int diff = 0;
        int dig1 = 0;
        int dig2 = 0;
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                if (i == j) {
                    dig1 += matrix[i][j];
                }
                if ((i + j) == (matrix.length - 1)) {
                    dig2 += matrix[i][j];
                }
            }
        }
        diff = dig1 - dig2;
        System.out.println(diff);
    }

}
