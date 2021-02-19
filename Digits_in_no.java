import java.util.Scanner;

public class Digits_in_no {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int n = input.nextInt();
        int digit;
        while (n!=0) {
             digit = n%10;
        }
        
        System.out.println(digit);
    }
}
