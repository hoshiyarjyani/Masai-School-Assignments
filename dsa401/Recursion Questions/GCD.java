import java.util.Scanner;

class GCD {
    static int myFun(int a, int b) {
        if (a == 0) {
            return b;
        }
        return myFun(b % a, a);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        for (int i = 0; i < x; i++) {
            int a = sc.nextInt();
            int b = sc.nextInt();
            int z = myFun(a, b);
            System.out.println(z);
        }
    }
}