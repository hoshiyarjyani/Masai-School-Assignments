import java.util.*;

class FindTheTownJudge {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();

        int arr[][] = new int[m][2];

        for (int i = 0; i < m; i++) {
            arr[i][0] = sc.nextInt();
            arr[i][1] = sc.nextInt();
        }

        int x = arr[0][1];

        for (int i = 1; i < m; i++) {
            if (x != arr[i][1]) {
                System.out.println(-1);
                return;
            }
        }
        System.out.println(x);

    }
}