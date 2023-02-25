import java.util.Scanner;

public class Substrings {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int tc = sc.nextInt();
        while (tc-- > 0) {
            int n = sc.nextInt();
            sc.nextLine();
            String str = sc.next();
            for (int i = 0; i < str.length(); i++) {
                StringBuilder sb = new StringBuilder();
                for (int j = i; j < str.length(); j++) {
                    sb.append(str.charAt(j));
                    System.out.println(sb);
                }
            }

        }
    }

}
