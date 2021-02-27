package Patterns;

import java.util.Scanner;


public class Pattern6 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        int n = input.nextInt();
        int nst = 1;
        int nr = (2*n) - 1 ;
        for(int row = 1; row <= n; row++) {

            for(int cst = 1; cst <= nst; cst++) {
                System.out.print("*");
            }
            System.out.println();
            if (row <= nr/2) {
                nst++;
            } else {
                nst--;
            }
        }
        input.close();
    }
}
