import java.util.Scanner;

public class Example1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = 0, b;
        
        try{
           a = sc.nextInt();
           b = sc.nextInt();

           int c =a / b;
           System.out.println(c);
        }
        catch(ArithmeticException ex){
            System.out.println("Can't divide by zero");
            System.out.println("Re-Enter the value of b");
            b = sc.nextInt();
            System.out.println(a / b);
        }
        

        


        System.out.println("Hello all  !!");
        sc.close();
    }
}
