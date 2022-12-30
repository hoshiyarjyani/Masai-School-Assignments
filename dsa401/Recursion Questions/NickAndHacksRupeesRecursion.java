import java.util.Scanner;

public class NickAndHacksRupeesRecursion {

    static boolean myFun(double t, double k) {
        if (t == k) {
            return true;
        } else if (t < k) {
            return false;
        } else {
            return myFun(t, k * 10) || myFun(t, k * 20);
        }
    }

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        for (int i = 0; i < x; i++) {
            double t = sc.nextDouble();
            int k = 1;
            boolean z = myFun(t, k);
            if (z == true) {
                System.out.println("Yes");
            } else {
                System.out.println("No");
            }
        }
    }

}
