package Patterns;

import java.util.Scanner;

public class Pattern9 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int n = input.nextInt();
        int row = 1;
        int nst = 1;
        int nsp = (2*n) - 3;

        while (row <= n) {
            for(int cst =1; cst <= nst; cst++) {
                System.out.print("*");
            }

            for(int csp = 1; csp <= nsp; csp++) {
                System.out.print(" ");
            }


        
            // exception handling for the extra start in the last line & also the loop will run 4 times.

            int cst_1 = 1;
            if (row == n) {
                cst_1 = 2;
            }

            for(; cst_1 <= nst; cst_1++) {
                System.out.print("*");
            }


            // prep
            
            System.out.println();
            nst = nst + 1;
            nsp = nsp - 2;
            row++;
        }
        input.close();
    }
}
