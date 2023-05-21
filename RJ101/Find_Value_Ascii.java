import java.util.*;

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        String str = sc.next();

        int min = 0;
        int plus = 0;

        for (int i = 0; i < n; i++) {
            char ch = str.charAt(i);
            if (ch >= 'a' && ch <= 'z') {
                int x = ch - 'a' + 1;
                min += x;
            } else if (ch >= 'A' && ch <= 'Z') {
                int y = 'A' - ch - 1;
                plus  += y;
            }
        }

        System.out.println(min + plus);
    }
}
// input = abABX
// output= -24