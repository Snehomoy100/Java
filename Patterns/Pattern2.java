package Patterns;

import java.util.Scanner;

public class Pattern2 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("Enter the no. of rows: ");
        int r = input.nextInt();

        System.out.println("Enter the no. of cols: ");
        int c = input.nextInt();

        if( r != c) {
            for( int rows = 1; rows <= r; rows++ ){
                for( int col = 1; col <= c; col++ ){
                    System.out.println("*");
                }
                System.out.println();
            }
        }
        input.close();
    }
}
