package conceptofjava;

import java.util.Scanner;

public class PrintSum {
	static void Print(int N) {
		System.out.println(N + 1);
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		Print(N);
	}
}
