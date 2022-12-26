public class BinaryEquivalentRecursive {
    //static String Str = "";

    static int fun(int n) {
        if (n == 0) {
            return 0;
        } else {
            fun(n / 2);
            System.out.print(n%2);
        }
        return 0;
    }

    public static void main(String[] args) {
        fun(15);
    }
}
