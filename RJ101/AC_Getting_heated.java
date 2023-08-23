import java.util.*;

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int tc = sc.nextInt();
        while (tc-- > 0) {
            int a = sc.nextInt(); // 30 30 30 30
            int b = sc.nextInt(); // 35 35 35 25
            int c = sc.nextInt(); // 25 40 35 35

            if (a <= b && (c <= a || c <= b)) {
                System.out.println("AC");
            } else {
                System.out.println("No AC");
            }
        }
    }
}
