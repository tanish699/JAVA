import java.util.Scanner; // Import Scanner class

public class Sum {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in); // Create Scanner object

        System.out.println("Enter an integer: ");
        int number1 = scanner.nextInt(); // Read an integer input
        int number2 = scanner.nextInt();
        int Sum = number1 + number2;
        System.out.println("You entered: " + Sum); // Output the entered integer

        scanner.close(); // Close the scanner
    }
}