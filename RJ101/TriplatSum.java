import java.util.*;

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int tc = sc.nextInt();
        while (tc-- > 0) {
            int n = sc.nextInt();
            List<Integer> list = new ArrayList<>();
            for (int i = 0; i < n; i++) {
                list.add(sc.nextInt());
            }
            boolean check = false;
            //Collections.sort(list);
            for (int i = 0; i < n - 1; i++) {
                for (int j = i + 1; j < n; j++) {
                    if (list.contains(list.get(i) + list.get(j))) {
                        check = true;
                        break;
                    }
                }
                if (check) {
                    break;
                }
            }
            System.out.println(check ? "1" : "0");
        }

    }
}

Sample Input
1
5
1 3 2 4 5

Sample Output
1


https://oj.masaischool.com/contest/9542/problem/09
