import java.util.Scanner;

public class Reverse_of_no {
    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        int ans = 0;

        while(n != 0){
            int rem = n % 10;
            ans = (ans * 10) + rem;
            n = n/10;
        }
        
        System.out.println(ans);

        input.close();
    }
}
