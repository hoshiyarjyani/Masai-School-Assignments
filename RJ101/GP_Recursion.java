import java.util.Scanner;

class Main {
    static double S = 1;
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int r = sc.nextInt();
        int index = 1;
        myFun(index, n, r);
    }

    public static void myFun(int index, int n, int r) {
        if (index > n) {
            System.out.println(String.format("%.4f", S));
            return;
        } else {
            double a = Math.pow(r, index);
            S += 1 / a;
        }
        myFun(index + 1, n, r);
    }
}
