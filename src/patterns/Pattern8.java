package Patterns;

import java.util.Scanner;

public class Pattern8 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int n = input.nextInt();
		for(int i = 1; i <= n; i++) {
			int startingNumber = i;
			for(int j = 1; j <=i; j++) {
				System.out.print(startingNumber);
				startingNumber--;
			}
			System.out.println();
		}
		input.close();
	}
}
