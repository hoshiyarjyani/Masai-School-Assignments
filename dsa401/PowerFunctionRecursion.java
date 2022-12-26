public class PowerFunctionRecursion {
    static int fun(int m, int n) {
        if (n <= 0) {
            return 1;
        } else {
            return m * fun(m, n - 1);
        }
    }

    public static void main(String[] args) {
        int x = fun(2, 5);
        System.out.println(x);
    }
}
