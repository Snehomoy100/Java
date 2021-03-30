package Patterns;

import java.util.Scanner;

public class Pattern6 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int noOfRows = input.nextInt();
		int row = 1;
		while(row <= noOfRows) {
			int col = 1;
			while(col <= row) {
				System.out.print("*");
				col++;
			}
			System.out.println();
			row++;
		}
		input.close();
	}
}
