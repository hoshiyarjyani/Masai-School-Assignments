import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

class TwoSortedArrays_imp {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int tc = Integer.parseInt(br.readLine());

        while (tc-- > 0) {
            int n = Integer.parseInt(br.readLine());
            int count = 0;

            int[] arr = new int[1000001]; // Assuming the numbers range from 1 to 1000000

            StringTokenizer st = new StringTokenizer(br.readLine());
            for (int i = 0; i < n; i++) {
                int num = Integer.parseInt(st.nextToken());
                arr[num]++;
            }

            st = new StringTokenizer(br.readLine());
            for (int i = 0; i < n; i++) {
                int num = Integer.parseInt(st.nextToken());
                if (arr[num] > 0) {
                    count++;
                    arr[num]--;
                }
            }

            System.out.println(count);
        }

        br.close();
    }
}

// Input

// 1
// 6
// 1 2 2 3 4 5
// 4 4 3 2 1 1

// Output

// 4