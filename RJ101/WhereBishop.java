import java.util.*;

class WhereBishop {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int tc = sc.nextInt();
        while (tc-- > 0) {
            char[][] arr = new char[8][8];
            for (int i = 0; i < 8; i++) {
                arr[i] = sc.next().toCharArray();
            }
            boolean flag = true;
            for (int i = 0; i < 8; i++) {

                for (int j = 0; j < 8; j++) {
                    if (i == 0 || j == 0 || i == 7 || j == 7) {

                    } else if (arr[i][j] == '#'
                            && arr[i + 1][j + 1] == '#'
                            && arr[i + 1][j - 1] == '#'
                            && arr[i - 1][j - 1] == '#'
                            && arr[i - 1][j + 1] == '#') {
                        System.out.println((i + 1) + " " + (j + 1));
                        flag = false;
                        break;
                    }
                }
                if (!flag) {
                    break;
                }
            }
        }
    }
}