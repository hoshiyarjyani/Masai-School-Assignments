import java.util.*;

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int tc = sc.nextInt();
        while (tc-- > 0) {
            int minimumCost = 100000;
            int n = sc.nextInt();
            int k = sc.nextInt();
            int[] arr = new int[n];
            for (int i = 0; i < n; i++) {
                arr[i] = sc.nextInt();
            }
            for (int i = 1; i <= 100; i++) {
                int[] convert = new int[n];
                for (int j = 0; j < n; j++) {
                    if (arr[j] < i) {
                        int x = (i - arr[j]) * 3;
                        convert[j] = x;
                    } else {
                        int x = (arr[j] - i) * 5;
                        convert[j] = x;
                    }
                }
                Arrays.sort(convert);
                int cost = 0;
                for (int m = 0; m < k; m++) {
                    cost += convert[m];
                }
                if (cost < minimumCost) {
                    minimumCost = cost;
                }
                cost = 0;
            }
            System.out.println(minimumCost);
        }
    }
}
