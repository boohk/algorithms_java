package Algorithms_1w;

public class Permutation {

	public static void main(String[] args) {

	}

	public static String showPermutaion() {
	
		int count = arr.length;
		
		int total = fac(arr.length);
		
		System.out.println("모든 경우의 수: "+total);
	
	
		
	}

	public static void swap(char[] a, int i, int j) {
		
		char spare;
		spare = a[j];
		a[j] = a[i];
		a[i] = spare;
		
	}

	public static int fac(int n) {

		if (n > 0) {

			return n * fac(n - 1);

		} else {

			return 1;

		}

	}

}
