import java.util.Scanner;

public class even_odd {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        try{
            if (n % 2 == 0) {
                System.out.println(n + " is an even no.");
            } else {
                System.out.println(n + " is an odd no.");
            }
        } finally{
        input.close();
        }
        System.out.println("Program is done...");
    }
}
