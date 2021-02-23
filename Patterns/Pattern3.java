package Patterns;

import java.util.Scanner;

public class Pattern3 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        int nst = 1;
        int row = 1;
        while (row <= n) {
            int cst = 1;
            while (cst <= nst) {
                System.out.println("*");
                cst++;
            }
            System.out.println();
            nst++;
            row++;
        }

        input.close();
    }
}
