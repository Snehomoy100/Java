import java.util.Scanner;

public class Example {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        for(int i = 1; i<=n; i++){
            for(int j = 1; j<=n; j++){
                System.out.print(j + " ");
                if (j > i) {
                    break;
                }
            }
            System.out.println();
        }
        input.close();
    }
}
