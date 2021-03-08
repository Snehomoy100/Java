public class IncrementDecrement {
    public static void main(String[] args) {
        
        int a = 10;

        // a++/a-- = post increment
        // ++a/--a = pre increment/decrement

        System.out.println(a++);
        System.out.println(++a);

        int b = 5;
        System.out.println(b--);
        System.out.println(--b);




        int c = 10;
        c += 2;
        c /= 6;
        System.out.println(c);



        // operator precedence 

        int d = 2 * 3/2;
        System.out.println(d);
    }
}
