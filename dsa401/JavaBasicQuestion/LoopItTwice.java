import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int L = sc.nextInt();
        int R = sc.nextInt();
        for (int i = L; i <= R; i += 2) {
            if (i == L || i - 2 == L) {
                System.out.println(i);
            } else if (i - 2 > L) {
                System.out.println(i);
            }
        }
    }
}