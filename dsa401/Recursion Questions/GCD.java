public class GCD {
    static int myFun(int x, int y) {
        if (x == 0) {
            return y;
        } else {
            return myFun(y % x, x);
        }
    }

    public static void main(String[] args) {
        int z = myFun(51, 68);
        System.out.println(z);
    }
}
