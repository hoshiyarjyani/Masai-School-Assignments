import java.util.*;

class Main {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        int x = 0;
        int sum = 0;

        for (int i = 1; i < n && x < n; i++) {
            x = (i * (i + 1) * (i + 2)) / 6;

            if (x <= n) {
                sum++;
            }
        }

        System.out.println(sum);
    }
}