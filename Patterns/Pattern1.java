package Patterns;

import java.util.Scanner;

public class Pattern1 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int n = input.nextInt();

        for(int rows = 1; rows <= n; rows++) {
            System.out.println("*");
        }
        input.close();
    }
}
