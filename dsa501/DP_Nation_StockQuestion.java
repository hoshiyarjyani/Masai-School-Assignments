import java.util.*;

public class DP_Nation_StockQuestion {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int tc = sc.nextInt();
        while (tc-- > 0) {
            int n = sc.nextInt();
            int[] arr = new int[n];

            int min = Integer.MAX_VALUE;
            int max = 0;

            for (int i = 0; i < n; i++) {
                arr[i] = sc.nextInt();
                min = Math.min(arr[i], min);
                max = Math.max(max, arr[i] - min);
            }
            System.out.println(max);

        }
    }
}
