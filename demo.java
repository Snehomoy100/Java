public class demo {
    public static void main(String args[])
       {
        
        // Guess the output 

            int x = 10;
            int y = 20;
            if(x++ > 10 || ++y > 20 ){
        System.out.print("Inside if  ");
            }else{
        System.out.print("Inside else  ");
            }

            System.out.println(x  + " " + y);  	
       }
}
