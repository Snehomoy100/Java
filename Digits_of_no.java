import java.util.Scanner;

public class Digits_of_no {
    public static void main(String[] args) {
        // Find the the total no. of digits in a given no.

        Scanner input = new Scanner(System.in);

        int n = input.nextInt();

        int digits = 1;

        while(n!=0){
            n = n/10;
            digits++;
        }

        System.out.println(digits);
    }
}
