
import java.util.*;

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int tc = sc.nextInt();
        while (tc-- > 0) {
            int n = sc.nextInt();
            int m = sc.nextInt();
            String str = sc.next();
            String pat = sc.next();
            boolean flag = false;
            for (int i = 0; i < n; i++) {
                StringBuilder sb = new StringBuilder();
                for (int j = i; j < n; j++) {
                    sb.append(str.charAt(j));
                    if (sb.toString().equals(pat)) {
                        flag = true;
                        break;
                    }
                }
                sb = null;
            }
            System.out.println(flag ? "Yes" : "No");
        }
    }
}
