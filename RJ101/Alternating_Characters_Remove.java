import java.util.*;

class Alternating_Characters_Remove {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int tc = sc.nextInt();
        while (tc-- > 0) {
            String str = sc.next();
            int count = 0;
            for (int i = 1; i < str.length(); i++) {
                if (str.charAt(i) == str.charAt(i - 1)) {
                    count++;
                }
            }
            System.out.println(count);
        }
    }
}