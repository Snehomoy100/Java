import java.util.Scanner;

// Let, I want to print the 0th Fibonacci to nth Fibonacci

public class Fibonacci {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int n = input.nextInt(), counter = 1, a = 0, b = 1, sum = 0;

        while(counter<=n+1){
            
            System.out.println(sum);
            sum = a+b;
            a = b;
            b = sum;

            counter++;
        }

        
    }
}
