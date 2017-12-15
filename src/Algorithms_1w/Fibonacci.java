package Algorithms_1w;

public class Fibonacci {

	public static void main(String[] args) {

		System.out.println(CalculateFibo(-1));
	}

	public static int CalculateFibo(int n) {

		if (n == 0) {

			return 0;

		} else if (n == 1) {

			return 1;

		} else if (n > 1) {

			return CalculateFibo(n - 1) + CalculateFibo(n - 2);

		} else {

			System.out.println("failed!!");

		}

		return 0;
	}

}
