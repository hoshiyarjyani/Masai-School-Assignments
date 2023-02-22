import java.util.*;

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            int n = sc.nextInt();
            int arr[] = new int[n];
            for (int i = 0; i < n; i++) {
                arr[i] = sc.nextInt();
            }
            int leftSum = 0;
            int rightSum = 0;
            for (int i = 0; i < n; i++) {
                rightSum += arr[i];
            }
            int ans = -1;
            for (int i = 0; i < n; i++) {
                rightSum -= arr[i];
                if (leftSum == rightSum) {
                    ans = i;
                    break;
                }
                leftSum += arr[i];
            }
            System.out.println(ans);
        }
    }
}
