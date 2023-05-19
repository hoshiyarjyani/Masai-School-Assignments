
import java.util.*;

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int tc = sc.nextInt();
        while (tc-- > 0) {
            int n = sc.nextInt();
            int k = sc.nextInt();
            int arr[] = new int[n];
            for (int i = 0; i < n; i++) {
                arr[i] = sc.nextInt();
            }
            int maxlen = 0;
            int st = 0;
            int sum = 0;
            int len = 0;
            for (int end = 0; end < n; end++) {
                sum += arr[end];
                while (sum > k) {
                    sum = sum - arr[st];
                    st++;
                }

                len = end - st + 1;
                maxlen = Math.max(maxlen, len);

            }
            System.out.println(maxlen);

        }
    }
}
