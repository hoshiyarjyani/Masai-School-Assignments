import java.util.*;

class EquilibriumElement {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int tc = sc.nextInt();
        while (tc-- > 0) {
            int n = sc.nextInt();
            int[] arr = new int[n];
            int rSum = 0;
            int lSum = 0;
            for (int i = 0; i < n; i++) {
                arr[i] = sc.nextInt();
                rSum += arr[i];
            }
            int res = -1;
            for (int i = 0; i < n; i++) {
                rSum -= arr[i];
                if (rSum == lSum) {
                    res = i;
                    break;
                }
                lSum += arr[i];
            }
            System.out.println(res);

        }
    }
}