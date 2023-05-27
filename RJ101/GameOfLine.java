import java.util.*;

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int r = sc.nextInt();
        int c = sc.nextInt();
        int mat[][] = new int[r][c];
        for (int i = 0; i < r; i++) {
            for (int j = 0; j < c; j++) {
                mat[i][j] = sc.nextInt();
            }
        }
        int ans[][] = new int[r][c];
        for (int i = 0; i < r; i++) {
            for (int j = 0; j < c; j++) {
                int count = 0;
                if (i - 1 >= 0 && j - 1 >= 0) {
                    // count = mat[i-1][j-1]==1?count+1:count;
                    if (mat[i - 1][j - 1] == 1) {
                        count = count + 1;
                    } else {
                        count = count;
                    }

                }
                if (i - 1 >= 0) {
                    // count = mat[i-1][j]==1?count+1:count;
                    if (mat[i - 1][j] == 1) {
                        count = count + 1;
                    } else {
                        count = count;
                    }

                }
                if (i - 1 >= 0 && j + 1 < c) {
                    // count = mat[i-1][j+1]==1?count+1:count;
                    if (mat[i - 1][j + 1] == 1) {
                        count = count + 1;
                    } else {
                        count = count;
                    }

                }

                if (j + 1 < c) {
                    // count = mat[i][j+1]==1?count+1:count;
                    if (mat[i][j + 1] == 1) {
                        count = count + 1;
                    } else {
                        count = count;
                    }

                }
                if (i + 1 < r && j + 1 < c) {
                    // count = mat[i+1][j+1]==1?count+1:count;
                    if (mat[i + 1][j + 1] == 1) {
                        count = count + 1;
                    } else {
                        count = count;
                    }
                }
                if (i + 1 < r) {
                    // count = mat[i+1][j]==1?count+1:count;
                    if (mat[i + 1][j] == 1) {
                        count = count + 1;
                    } else {
                        count = count;
                    }

                }
                if (i + 1 < r && j - 1 >= 0) {
                    // count = mat[i+1][j-1]==1?count+1:count;
                    if (mat[i + 1][j - 1] == 1) {
                        count = count + 1;
                    } else {
                        count = count;
                    }
                }
                if (j - 1 >= 0) {
                    // count = mat[i][j-1]==1?count+1:count;
                    if (mat[i][j - 1] == 1) {
                        count = count + 1;
                    } else {
                        count = count;
                    }
                }
                if (mat[i][j] == 1 && count < 2) {
                    ans[i][j] = 0;
                } else if (mat[i][j] == 1 && count <= 3) {
                    ans[i][j] = 1;
                } else if (mat[i][j] == 1 && count > 3) {
                    ans[i][j] = 0;
                } else if (mat[i][j] == 0 && count == 3) {
                    ans[i][j] = 1;
                }

            }
        }
        for (int i = 0; i < r; i++) {
            for (int j = 0; j < c; j++) {
                System.out.print(ans[i][j] + " ");
            }
            System.out.println();
        }

    }
}