public class RandomQuesOfRecursion {
    static int fun(int n) {
        if (n > 100) {
            return n - 10;
        } else {
            return fun(fun(n + 11));
        }
    }

    public static void main(String[] args) {
        int x = fun(95);
        System.out.println(x);
    }
}
