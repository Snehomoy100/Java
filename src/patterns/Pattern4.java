package Patterns;

import java.util.Scanner;

public class Pattern4 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int n = input.nextInt();
		int i = 1;
		while(i <= n) {
			int j = 1;
			int startingNumber = i;
			while(j <= i) {
				System.out.print(startingNumber);
				startingNumber++;
				j++;
			}
			System.out.println();
			i++;
		}
		input.close();
	}

}
