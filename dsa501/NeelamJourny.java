import java.util.*;

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] rate = new int[n];
        for (int i = 0; i < n; i++) {
            rate[i] = sc.nextInt();
        }
        int totel = 0;
        int ticket = rate[0];
        for (int i = 0; i < n; i++) {
            if (ticket > rate[i]) {
                ticket = rate[i];
            }
            totel += ticket;
        }

        System.out.println(totel);

    }
}