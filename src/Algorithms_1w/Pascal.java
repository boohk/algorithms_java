package Algorithms_1w;

public class Pascal {

	public static void main(String[] args) {

	
		
	}
	
	public static int pascal(int n, int r) {

		if (n > r) {

			return facorial(n) / (facorial(r)*facorial(n - r));

		} else if (n == r) {

			return 1;

		} else {

			System.out.println("error");

		}

		return 0;

	}

	
	public static int combination(int n, int r) {

		if (n > r) {

			return facorial(n) / (facorial(r)*facorial(n - r));

		} else if (n == r) {

			return 1;

		} else {

			System.out.println("error");

		}

		return 0;

	}

	public static int facorial(int n) {

		if (n > 0) {

			return n * facorial(n - 1);

		} else {

			return 1;

		}

	}

}
