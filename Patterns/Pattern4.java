package Patterns;

import java.util.Scanner;

public class Pattern4 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        int nst = n;

        int rows = 1;
        while (rows <= n) {
            int cst = 1;

            // nst = no. of rows
            // cst = count of rows

            while (cst <= nst) {
                System.out.println("*");
                cst++;
            }
            System.out.println();
            nst--;
            rows++;
        }
        input.close();
    }
}
