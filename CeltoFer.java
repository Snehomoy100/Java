public class CeltoFer {
    public static void main(String[] args) {

        int fmin = 0;
        int fmax = 300;
        int fcurrent = fmin;
        int fstep = 20;
        
        while(fcurrent<=fmax){

            int celsius = (int)((5.0/9)*(fcurrent - 32));
            System.out.println(fcurrent + "\t" + celsius);
            fcurrent = fcurrent + fstep;
        }
    }
}
