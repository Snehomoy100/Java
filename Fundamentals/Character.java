import java.util.Scanner;


public class Character {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        char ch = input.next().charAt(0);
       
        // print if the given ch is upper or lower or an invalid character
        
        if (ch>=97 && ch<=122) {
            System.out.println("Lowercase");
        }else if (ch>=65 && ch<=90){
            System.out.println("Uppercase");
        } else{
            System.out.println("Invalid character");
        }
        input.close();
    }
}
