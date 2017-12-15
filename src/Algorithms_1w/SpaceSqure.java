package Algorithms_1w;

import java.util.Scanner;

public class SpaceSqure {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int widthandheight = sc.nextInt();
		for(int h=1;h<=widthandheight;h++)
		{
			for(int w=1;w<=widthandheight;w++)
			{
				if(h==1||h==widthandheight||w==1||w==widthandheight){
					System.out.print("*");
				}else{
					System.out.print(" ");
				}
			}
			System.out.println("");
		}
		sc.close();
	}

}