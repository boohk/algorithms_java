package Algorithms_1w;

import java.util.Scanner;

public class SpaceRightTriangle {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int widthAndheight = sc.nextInt();

		for (int h = 1; h <= widthAndheight; h++) {

			for (int w = 1; w < h; w++) {

				if (h == 1 || h == widthAndheight || w == 1 || w == widthAndheight) {

					System.out.print("*");

				} else {

					System.out.print(" ");

				}

			}
			System.out.println("*");


		}
		sc.close();
	}

}
