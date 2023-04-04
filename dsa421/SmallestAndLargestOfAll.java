import java.util.*;

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int min = 99999999;
        int max = -99999999;
        for (int i = 0; i < n; i++) {
            int k = sc.nextInt();
            if (min > k) {
                min = k;
            }
            if (max < k) {
                max = k;
            }

        }
        System.out.println(min);
        System.out.println(max);

    }
}