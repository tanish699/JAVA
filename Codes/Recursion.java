// Recursion: A function calling itself

public class Recursion {
       public static void main(String[] args) {
        System.out.println("Factorial of 3 is " + Factorial.fact(3));
        System.out.println("Factorial of 4 is " + Factorial.fact(4));
        System.out.println("Factorial of 5 is " + Factorial.fact(5));
       }

       class Factorial {

        // Static recursive method
        static int fact(int n) {
            if (n == 1)
                return 1;
            return fact(n - 1) * n;
        }
    }
    
}
