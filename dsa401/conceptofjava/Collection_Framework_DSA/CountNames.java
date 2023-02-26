import java.util.*;

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        TreeMap<String, Integer> tm = new TreeMap<>();
        for (int i = 0; i < n; i++) {
            String str = sc.next();
            if (!tm.containsKey(str)) {
                tm.put(str, 1);
            } else {
                tm.put(str, tm.get(str) + 1);
            }
        }
        for (Map.Entry<String, Integer> entry : tm.entrySet()) {
            String key = entry.getKey();
            int value = entry.getValue();
            System.out.println(key + " " + value);
        }
    }
}