import java.util.*;

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int color[] = new int[n];
        for (int i = 0; i < n; i++) {
            color[i] = sc.nextInt();
        }

        Map<Integer, Integer> map = new HashMap<>();
        for (int x : color) {
            map.put(x, map.getOrDefault(x, 0) + 1);
        }

        int max = 0;
        for (int x : map.values()) {
            max += x / 2;
        }
        System.out.println(max);
    }
}