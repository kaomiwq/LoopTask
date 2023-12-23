

public class Task4 {
    public static void main(String[] args) {
        double x = -5.0;
        double y = 0;

        System.out.println("  x      y  ");

        while(x<=5){
            y=5-(x*x)/2;
            System.out.println(  x  + " | " + y );
            x += 0.5;
        }

    }
}