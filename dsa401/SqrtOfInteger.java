import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt(); 
        while (t-- > 0) {
            int n = sc.nextInt(); 
            int sqrt = 0;
            int i = 1;
            while (i*i <= n) {
                sqrt = i;
                i++;
            }
            if (sqrt*sqrt == n) {
                System.out.println(sqrt);
            } else {
                System.out.println(sqrt);
            }
        }
    }
}
