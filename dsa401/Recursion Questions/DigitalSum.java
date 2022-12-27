public class DigitalSum {
    static int SumDigital(int n) {
        if (n / 10 == 0) {
            return n;
        } else {
            return n % 10 + SumDigital(n / 10);
        }
    }

    public static void main(String[] args) {
        int x = SumDigital(12345);
        if (x > 9) {
            int y = SumDigital(x);
            System.out.println(y);
        } else {
            System.out.println(x);
        }
    }
}
