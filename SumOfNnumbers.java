import java.util.Scanner;

public class SumOfNnumbers {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int n = input.nextInt();
        
        int counter = 1;
        int sum = 0;

        while(counter<=n){
            sum=sum+counter;
            counter++;
        }
        System.out.println(sum);
    }
}
