import java.util.*;

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int tc = sc.nextInt();
        while (tc-- > 0) {
            int n = sc.nextInt();
            int k = sc.nextInt();

            Map<Integer, Integer> map = new TreeMap<>();
            for (int i = 0; i < n; i++) {
                int elem = sc.nextInt();
                if (map.containsKey(elem)) {
                    map.put(elem, map.get(elem) + 1);
                } else {
                    map.put(elem, 1);
                }
            }

            int count = 0;

            for (Map.Entry<Integer, Integer> entry : map.entrySet()) {
                int key = entry.getKey();
                int val = entry.getValue();
                if (val < k) {
                    count += val;
                } else {
                    count += k;
                }

            }

            System.out.println(count);
        }
    }
}

// Input

// 4
// 10 1
// 2 1 4 5 2 4 5 5 1 2
// 5 2
// 3 2 1 2 2
// 2 2
// 1 1
// 2 2
// 1 2

// Output

// 4
// 4
// 2
// 2