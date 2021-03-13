import java.util.Scanner;

public class BreakContinue {
        public static void main(String[] args) {

            Scanner input = new Scanner(System.in);

            int n = input.nextInt();
            boolean divided = false;
            int d = 2;
            while(d < n) {
                if (n % d == 0) {
                    divided = true;
                    break;
                }
                d++;
            }
            if(divided){
                System.out.println("Not Prime");
            } else {
                System.out.println("Prime");
            }

            input.close();
    }
}
