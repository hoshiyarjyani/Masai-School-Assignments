package jyani.hoshiyar.problem3;

public class T3 extends Thread{
	public void run() {
		for (int i = 201; i <= 300; i++) {
			if (checkPrime(i)) {
				System.out.println(i + " T3 checks Prime");
			}
		}
	}

	public boolean checkPrime(int n) {
		if (n <= 1) {
			return false;
		}

		for (int i = 2; i <= Math.sqrt(n); i++) {
			if (n % i == 0) {
				return false;
			}
		}

		return true;
	}

}
