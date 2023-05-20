import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.*;

class Main {
    public static void main(String args[]) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        String[] str = br.readLine().split(" ");
        for (int i = 0; i < n; i++) {
            char[] arr = str[i].toCharArray();
            List<Character> list = new ArrayList<>();
            for (char c : arr) {
                list.add(c);
            }
            char[] s = { '@', '$', '#', '*' };
            boolean check = false;
            for (int j = 0; j < 4; j++) {
                if (list.contains(s[j])) {
                    check = true;
                }
            }
            System.out.print(check ? "strong " : "weak ");

        }
    }
}
// input
// 4
// test123 new@t mon*y nrupul

// output
// weak strong strong weak