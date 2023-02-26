public class DimondTraversal {
    public static void dimondTravrsal(int[][] matrix) {
        StringBuilder sb = new StringBuilder();
        int n = matrix.length;
        // right mid to top
        int i = (n - 1) / 2;
        int j = n - 1;
        while (i >= 0) {
            sb.append(matrix[i][j] + " ");
            i--;
            j--;
        }
        // top to left mid
        int k = 1;
        int l = ((n - 1) / 2) - 1;
        while (l >= 0) {
            sb.append(matrix[k][l] + " ");
            k++;
            l--;
        }
        // left mid to bottom
        int o = ((n - 1) / 2) + 1;
        int p = 1;
        while (o <= n - 1) {
            sb.append(matrix[o][p] + " ");
            o++;
            p++;
        }
        // bottom to right mid
        int q = n - 2;
        int r = ((n - 1) / 2) + 1;
        while (q >= ((n - 1) / 2) + 1) {
            sb.append(matrix[q][r] + " ");
            q--;
            r++;
        }

    }
}
