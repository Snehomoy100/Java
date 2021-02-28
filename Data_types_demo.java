public class Data_types_demo {
    public static void main(String[] args) {
        int a = 10;
        short sh = 5;
        byte b = 1;
        long l = 7876;



        sh = b;
        a = b;
        a = sh;
        l = a;

        b = (byte) 128;

        a = 1000000;
        l = 10000000000L;

        float f = 5.6f;

        double db = 8.98;

        a = (int) f;
        f = a;


        System.out.println(b);
        System.out.println(l);

        System.out.println(a);
        System.out.println(f);

    }
}
