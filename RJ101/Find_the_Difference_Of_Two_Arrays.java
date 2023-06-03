import java.util.*;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;
import java.util.StringTokenizer;

public class Main {
    static class FastReader {
        BufferedReader br;
        StringTokenizer st;

        public FastReader() {
            br = new BufferedReader(
                    new InputStreamReader(System.in));
        }

        String next() {
            while (st == null || !st.hasMoreElements()) {
                try {
                    st = new StringTokenizer(br.readLine());
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
            return st.nextToken();
        }

        int nextInt() {
            return Integer.parseInt(next());
        }

        long nextLong() {
            return Long.parseLong(next());
        }

        double nextDouble() {
            return Double.parseDouble(next());
        }

        String nextLine() {
            String str = "";
            try {
                str = br.readLine();
            } catch (IOException e) {
                e.printStackTrace();
            }
            return str;
        }
    }

    public static void main(String[] args) {
        // This will take the input
        FastReader sc = new FastReader();
        int tc = sc.nextInt();
        while (tc-- > 0) {
            int n = sc.nextInt();
            int m = sc.nextInt();

            int arr1[] = new int[n];
            int arr2[] = new int[m];
            for (int i = 0; i < n; i++) {
                arr1[i] = sc.nextInt();
            }
            for (int i = 0; i < m; i++) {
                arr2[i] = sc.nextInt();
            }

            ArrayList<Integer> l1 = UniqueNum(arr1, arr2);
            ArrayList<Integer> l2 = UniqueNum(arr2, arr1);
            for (int x : l1) {
                System.out.print(x + " ");
            }
            System.out.println();
            for (int x : l2) {
                System.out.print(x + " ");
            }
            System.out.println();
        }

    }

    static ArrayList<Integer> UniqueNum(int[] arr1, int[] arr2) {
        Set<Integer> s1 = new TreeSet<>();
        Set<Integer> s2 = new TreeSet<>();

        for (int x : arr1) {
            s1.add(x);
        }

        for (int x : arr2) {
            s2.add(x);
        }

        ArrayList<Integer> al = new ArrayList<>();
        for (int y : s1) {
            if (!s2.contains(y)) {
                al.add(y);
            }
        }
        return al;
    }

}

// Input

// 2
// 3 3
// 1 2 3
// 2 4 6
// 4 4
// 1 2 3 3
// 1 1 2 2

// Output

// 1 3 
// 4 6 
// 3 