package Algorithms_1w;

public class CombinationCount {

	public static void main(String[] args) {
	
		System.out.println(calculateCombination(5, 2));

	}

	public static int calculateCombination(int n, int k) {

		if (n > k) {

			return fac(n) / (fac(k)*fac(n - k));

		} else if (n == k) {

			return 1;

		} else {

			System.out.println("error");

		}

		return 0;

	}

	public static int fac(int n) {

		if (n > 0) {

			return n * fac(n - 1);

		} else {

			return 1;

		}

	}
	
}
