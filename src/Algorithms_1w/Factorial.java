package Algorithms_1w;

//import java.util.Scanner;

public class Factorial {

	public static void main(String[] args) {

		System.out.println(CalcuateFactorial(10));

	}

	public static int CalcuateFactorial(int n) {

		if (n > 0) {

			return n * CalcuateFactorial(n - 1);

		} else {

			return 1;

		}
	}

}
