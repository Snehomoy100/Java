import java.util.Scanner;


public class if_elseif {
    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);

        int n = input.nextInt();

        try{
            if (n <= 11) {
            System.out.println("You are a child");
        } else if (n >= 12 && n <= 18) {
            System.out.println("You are a teenager");
        } else if (n >= 19 && n <= 60) {
            System.out.println("You are an adult");
        } else {
            System.out.println("You are an old person");
        }
    } finally{
        input.close();
    }
    }
}
