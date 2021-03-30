package Patterns;

import java.util.Scanner;

public class Pattern7 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int n = input.nextInt();
		int i = 1;
		while(i <= n) {
			int j = 1;
			while(j <= i) {
				System.out.print(i);
				j++;
			}
			System.out.println();
			i++;
		}
		input.close();
	}

}
