import java.util.Scanner;

public class Hypotenuose {
    public static void main(String[] args) {
     
        Scanner scan = new Scanner(System.in);

        double a;
        double b;
        double h;

        a = scan.nextDouble();
        b = scan.nextDouble();
        
        double d = ((a*a) + (b*b));
        h = Math.sqrt(d);
        System.out.println(+h);
        scan.close();
    }
    
}
