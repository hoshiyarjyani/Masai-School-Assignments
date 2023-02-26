import java.util.*;

//thisracecarisgood
public class LongestPalindromeicSubstring {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        int count = 0;
        for (int i = 0; i < s.length(); i++) {
            StringBuilder beg = new StringBuilder();
            for (int j = i; j < s.length(); j++) {
                beg.append(s.charAt(j));
                StringBuilder rev = new StringBuilder(beg.toString());
                rev.reverse();
                if (beg.toString().equals(rev.toString()) && count < beg.length()) {
                    count = beg.length();
                }
            }
        }
        System.out.println(count);

    }
}
