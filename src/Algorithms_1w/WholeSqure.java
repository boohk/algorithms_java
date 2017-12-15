package Algorithms_1w;

import java.util.Scanner;

public class WholeSqure {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int width = sc.nextInt();
		int i, j;

		for (i = 1; i <= width; i++) {

			for (j = 1; j <= width; j++) {

				System.out.print("*");

			}
			System.out.println();

		}

		sc.close();

	}

}
