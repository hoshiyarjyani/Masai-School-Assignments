import java.util.*;

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int tc = sc.nextInt();
        while (tc-- > 0) {
            boolean flag = false;
            int n = sc.nextInt();
            int g = sc.nextInt();
            int[] arr = new int[n];
            for (int i = 0; i < n; i++) {
                arr[i] = sc.nextInt();
            }
            for (int i = 0; i < n; i++) {
                for (int j = 0; j < n; j++) {
                    if (arr[i] - arr[j] == g) {
                        flag = true;
                        break;
                    }
                }
                if (flag) {
                    break;
                }
            }

            System.out.println(flag ? "Yes" : "No");

        }
    }
}