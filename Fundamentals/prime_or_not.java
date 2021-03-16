import java.util.Scanner;

public class prime_or_not {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Prime no is divisible by either 1 or itself

        
        int n = input.nextInt();
        boolean flag = true;
        int div = 2;
        
        while (div<=n-1) {
            if (n % div == 0) {
                flag = false;
            }
            div++;
        }
        if(flag==true){
            System.out.println("Prime Number");
        }
        else{
            System.out.println("Not prime");
        }
    }
}
