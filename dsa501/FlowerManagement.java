import java.util.*;

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int tc = sc.nextInt();
        while (tc-- > 0) {
            int n = sc.nextInt();
            int k = sc.nextInt();
            int[] arr = new int[n];
            for (int i = 0; i < n; i++) {
                arr[i] = sc.nextInt();
            }
            int count = 0;
            for (int i = 0; i < n; i++) {
                if (i == 0) {
                    if (arr[i] == 0 && arr[i + 1] == 0) {
                        count++;
                        arr[i] = 1;
                    }
                } else if (i == n - 1) {
                    if (arr[i] == 0 && arr[i - 1] == 0) {
                        count++;
                        arr[i] = 1;
                    }
                } else {
                    if (arr[i] == 0 && arr[i + 1] == 0 && arr[i - 1] == 0) {
                        count++;
                        arr[i] = 1;
                    }
                }
            }
            System.out.println(count >= k ? "Yes" : "No");
        }
    }
}