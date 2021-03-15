package Patterns;

import java.util.Scanner;

public class Pattern5 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();

        int nst = 1;
        int nsp = (n - 1);
        int row = 1;

        while (row <= n) {

            // work
            
            // for spaces
            int cst_1 = 1;
            while (cst_1 <= nsp) {
                System.out.println(" ");
                cst_1++;
            }

            // for stars
            int cst_2 = 1;
            while(cst_2 <= nst){
                System.out.println("*");
                cst_2++;
            }

            // prep 
            System.out.println();
            nsp--;
            nst++;
            row++;
        }
        input.close();
    }
}
