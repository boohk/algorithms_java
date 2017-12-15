package Algorithms_1w;

import java.util.Scanner;

public class Rectangle {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int width = sc.nextInt();
		int height = sc.nextInt();
		for (int h = 1; h <= height; h++) {
			for (int w = 1; w <= width; w++) {
				if (h == 1 || h == height || w == 1 || w == width) {
					System.out.print("*");
				} else {
					System.out.print(" ");
				}
			}
			System.out.println("");
		}
		sc.close();
	}
}
