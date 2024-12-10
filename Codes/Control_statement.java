import java.util.Scanner;

public class Control_statement {
    public static void main(String[] agrs){
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        if(n%2==0){
            System.out.println(n+ " is even");
        }

        else {
            System.out.println(n+ " is odd");
        }

        scan.close();
    }
    
}