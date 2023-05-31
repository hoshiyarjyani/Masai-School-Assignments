import java.util.*;

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k = sc.nextInt();
        int arr[] = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        Arrays.sort(arr);
        int ans = 0;
        if (n <= k) {
            for (int i = 0; i < n; i++) {
                ans += arr[i];
            }
            System.out.println(ans);
        } else {
            int a = 0;
            while (n > 0) {
                for (int i = 0; i < k; i++) {
                    ans += (arr[n - 1] * (a + 1));
                    n--;
                    if (n == 0) {
                        break;
                    }
                }
                a++;
            }
            System.out.println(ans);
        }

    }
}