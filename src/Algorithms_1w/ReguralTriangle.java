package Algorithms_1w;

import java.util.Scanner;

public class ReguralTriangle {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int widthAndheight = sc.nextInt();

		for (int h = 1; h <= widthAndheight; h++) {

			for (int w = 1; w <= h; w++) {
				
				for(int point = widthAndheight/2; point > 0; point--){
					
					System.out.print("*");
					
				}

			}

			System.out.println("");
		}

	}

}
