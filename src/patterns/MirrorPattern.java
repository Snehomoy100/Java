package Patterns;
import java.util.Scanner;
public class MirrorPattern {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int n = input.nextInt();
		int i = 1;
		while(i<=n) {
			int j = 1;
			while(j <= n- i) {
				System.out.print(" ");
				j++;
			}
			j = 1;
			while(j <= i) {
				System.out.print(j);
				j++;
			}
			System.out.println();
			i++;
		}
		input.close();
	}

}
