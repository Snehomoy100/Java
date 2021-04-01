package Patterns;

import java.util.Scanner;

public class NumberPattern {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int n = input.nextInt();
		for(int row = n; row >= 1; row--) {
			for(int col = 1; col <= row; col++) {
				System.out.print(row);
			}
			System.out.println();
		}
		input.close();
	}

}
