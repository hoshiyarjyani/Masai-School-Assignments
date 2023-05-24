import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.HashSet;
import java.util.Set;
import java.util.StringTokenizer;

class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int tc = Integer.parseInt(br.readLine());

        while (tc-- > 0) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            int n = Integer.parseInt(st.nextToken());
            int k = Integer.parseInt(st.nextToken());

            Set<Integer> set = new HashSet<>();
            StringTokenizer arrTokens = new StringTokenizer(br.readLine());

            boolean found = false;

            while (arrTokens.hasMoreTokens()) {
                int num = Integer.parseInt(arrTokens.nextToken());

                if (set.contains(num - k) || set.contains(num + k)) {
                    found = true;
                    break;
                }

                set.add(num);
            }

            if (found) {
                System.out.println("Yes");
            } else {
                System.out.println("No");
            }
        }

        br.close();
    }
}

