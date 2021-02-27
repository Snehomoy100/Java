package Patterns;

import java.util.Scanner;

public class Pattern7 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();

        int row = 1;
        int nst = n/2;
        int nsp = 1;
        while( row <= n ) {

            for(int cst = 1; cst<=nst; cst++) {
                System.out.print("*");
            }
            for(int csp = 1; csp<=nsp; csp++) {
                System.out.print(" ");
            }
            for(int cst_1 = 1; cst_1<=nst; cst_1++) {
                System.out.print("*");
            }
            System.out.println();

            if ( row <= n/2 ) {
                nst = nst - 1;
                nsp = nsp + 2;
            } else {
                nst = nst + 1;
                nsp = nsp - 2;
            }
            row++;
        }
        input.close();
    }
}
